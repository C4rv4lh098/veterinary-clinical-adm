import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { HttpClientModule } from '@angular/common/http';


import { CadastroComponent } from './cadastro.component';
import { FormTutorModule } from './form-tutor/form-tutor.module';
import { CoreModule } from './core/core.module';
import {Error404Component} from "./core/component/error-404/error404.component";
import {AppModule} from "../app.module";
// import {RouterModule} from '@angular/router';

// @ts-ignore
@NgModule({
  declarations: [

    // RouterModule,
    CadastroComponent,
    Error404Component
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
      {
        path: '', redirectTo: 'api/tutor', pathMatch: 'full'
      }, {
        path: '**', component: Error404Component
      }
    ]),
    FormTutorModule,
    CoreModule,
    AppModule
  ],
  providers: [],
  bootstrap: [CadastroComponent]
})
// @ts-ignore
export class CadastroModule { }
