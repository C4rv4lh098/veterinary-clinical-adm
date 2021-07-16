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
import {FormularioComponent} from "./cadastro/formulario/formulario.component";
import {FormsModule} from "@angular/forms";


@NgModule({
    declarations: [
        AppComponent,
        AgendamentoComponent,
        CadastroComponent,
        ConsultaComponent,
        HomeComponent,
        HeaderComponent,
        MenubarComponent,
        CalendarComponent,
        FormularioComponent
    ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
