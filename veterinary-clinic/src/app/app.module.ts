import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AgendamentoComponent } from '../app/agendamento/agendamento.component';
import { CadastroComponent } from '../app/cadastro/cadastro.component';
import { ConsultaComponent } from '../app/consulta/consulta.component';
import { HomeComponent } from '../app/home/home.component';
import { HeaderComponent } from '../app/header/header.component';
import { MenubarComponent } from '../app/menubar/menubar.component';
import { CalendarComponent } from '../app/agendamento/calendar/calendar.component';
import {FormTutorComponent} from "./cadastro/form-tutor/form-tutor.component";
import {FormsModule} from "@angular/forms";
import {CoreModule} from "./cadastro/core/core.module";


@NgModule({
  declarations: [
    AppComponent,
    AgendamentoComponent,
    // CadastroComponent,
    ConsultaComponent,
    HomeComponent,
    HeaderComponent,
    MenubarComponent,
    CalendarComponent,
    FormTutorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    CoreModule
  ],
  providers: [],
  exports: [
    FormTutorComponent
  ],
  bootstrap: [AppComponent]
})
// @ts-ignore
export class AppModule { }
