import {Component, Input, OnInit} from '@angular/core';
import {IStudent} from '../model/IStudent';
import {student} from '../model/StudentRepo';
import {FormControl} from '@angular/forms';

@Component({
  selector: 'app-student-information',
  templateUrl: './student-information.component.html',
  styleUrls: ['./student-information.component.css']
})
export class StudentInformationComponent implements OnInit {
  @Input()
  studentIn: IStudent;



  value = 5;

  constructor() {
  }

  ngOnInit(): void {
  }

  // tslint:disable-next-line:typedef
  studentForm: any;
  riseUp() {
    this.studentIn.mark = this.value;
  }


}
