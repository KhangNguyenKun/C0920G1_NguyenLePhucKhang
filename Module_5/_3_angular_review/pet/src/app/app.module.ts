import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppComponent} from './app.component';
import {FormsModule} from '@angular/forms';
import {CustomerComponent} from './customer/customer.component';
import {CalculatorComponent} from './calculator/calculator.component';
import {FontSizeComponent} from './font-size/font-size.component';
import {AppRoutingModule} from './app-routing.module';
import { ColorPickerComponent } from './color-picker/color-picker.component';


@NgModule({
  declarations: [
    AppComponent,
    CustomerComponent,
    CalculatorComponent,
    FontSizeComponent,
    ColorPickerComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
