import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
// import { NgModule } from '@angular/core';

import { HttpClientModule } from '@angular/common/http';
// import { CadastroRoutingModule } from './cadastro-routing.module';

import { CadastroComponent } from './cadastro.component';
// import { FormTutorModule } from './form-tutor/form-tutor.module';
// import { CoreModule } from './core/core.module';
// import {Error404Component} from "./core/component/error-404/error404.component";
import {AppModule} from "../app.module";
import { CreateAnimalComponent } from './animal/create-animal/create-animal.component';
import { CreateTutorComponent } from './tutor/create-tutor/create-tutor.component';
import {FormsModule} from "@angular/forms";
// import {RouterModule} from '@angular/router';

// @ts-ignore
@NgModule({
  declarations: [

    // CreateAnimalComponent,
    // CreateTutorComponent,
    // CadastroComponent,
    // CadastroRoutingModule,
    // Error404Component
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
      {
        path: '', redirectTo: 'api/tutor', pathMatch: 'full'
      },
    ]),
    // FormTutorModule,
    // CoreModule,
    AppModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [CadastroComponent]
})
// @ts-ignore
export class CadastroModule { }
