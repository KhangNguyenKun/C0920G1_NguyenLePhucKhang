import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { StudentInformationComponent } from './student-information/student-information.component';
const routes: Routes = [
  {path: 'information' , component: StudentInformationComponent}
  ]
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
