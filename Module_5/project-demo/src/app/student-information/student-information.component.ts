import { Component, OnInit } from '@angular/core';
import {IStudent} from '../model/IStudent';

@Component({
  selector: 'app-student-information',
  templateUrl: './student-information.component.html',
  styleUrls: ['./student-information.component.css']
})
export class StudentInformationComponent implements OnInit {
  student: IStudent = {
    id : 1,
    name: 'Kan',
    age: 23,
    mark: 10
  }
  value: number;

  constructor() { }

  ngOnInit(): void {
  }

  // tslint:disable-next-line:typedef
  riseUp() {
    this.student.mark = this.value;
  }
}
