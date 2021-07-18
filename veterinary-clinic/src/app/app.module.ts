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
import { FormularioComponent } from '../app/cadastro/formulario/formulario.component';
import { UpdateAgendaComponent } from '../app/agendamento/calendar/update-agenda/update-agenda.component';
import { CreateAgendaComponent } from '../app/agendamento/calendar/create-agenda/create-agenda.component';
import { ListAgendaComponent } from '../app/agendamento/calendar/list-agenda/list-agenda.component';
import { AgendamentoService } from './agendamento/service/agendamento.service';


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
    FormularioComponent,
    UpdateAgendaComponent,
    CreateAgendaComponent,
    ListAgendaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [AgendamentoService ],
  bootstrap: [AppComponent]
})
export class AppModule { }
