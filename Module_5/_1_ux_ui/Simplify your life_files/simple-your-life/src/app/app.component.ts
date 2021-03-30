import {Component} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'simple-your-life';
  name = 'nguyen khang';
  diss = false;

  // tslint:disable-next-line:typedef
  clearValue() {
    this.name = '';
  }
}
