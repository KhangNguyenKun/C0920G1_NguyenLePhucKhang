import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CalculatorComponent} from './calculator/calculator.component';
import {FontSizeComponent} from './font-size/font-size.component';
const routes: Routes = [
  {path: 'calculator' , component: CalculatorComponent},
  {path: 'fontSize' , component: FontSizeComponent}
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
