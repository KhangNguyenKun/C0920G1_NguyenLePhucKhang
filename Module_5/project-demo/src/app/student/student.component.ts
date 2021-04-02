import {Component, OnInit, Output} from '@angular/core';
import {student} from '../model/StudentRepo';
import {IStudent} from '../model/IStudent';
import {FormControl} from '@angular/forms';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';


@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
  @Output()
    // @ts-ignore
  students = student;
  studentIn: IStudent;

  studentForm = new FormControl(
    {
      id: new FormControl(),
      name: new FormControl(),
      age: new FormControl(),
      mark: new FormControl(),
    }
  );

  constructor(private modalService: NgbModal) {
  }

  ngOnInit(): void {
  }

  openWindowCustomClass(content) {
    this.modalService.open(content, {windowClass: 'dark-modal'});
  }

  // tslint:disable-next-line:no-shadowed-variable typedef

  detail(student: IStudent) {
    this.studentIn = student;
  }

  createStudent() {

  }

  onSubmit() {
    student.push(this.studentForm.value);
  }
}
