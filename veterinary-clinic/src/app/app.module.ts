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

import { CreateTutorComponent } from "./cadastro/tutor/create-tutor/create-tutor.component";

import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { TutorService } from './cadastro/service/tutor.service';
import { AnimalService } from './cadastro/service/animal.service';
import { HttpClient, HttpClientModule, HttpHandler } from '@angular/common/http';


import { CreateAnimalComponent } from './cadastro/animal/create-animal/create-animal.component';
import { UpdateAnimalComponent} from "./cadastro/animal/update-animal/update-animal.component";
import { UpdateTutorComponent} from "./cadastro/tutor/update-tutor/update-tutor.component";
import { TutorListComponent} from "./cadastro/tutor/tutor-list/tutor-list.component";
import { AnimalListComponent} from "./cadastro/animal/animal-list/animal-list.component";
// import {DataTablesModule} from "angular-datatables";
import { NgIterable } from '@angular/core';
import { UpdateAgendaComponent } from './agendamento/calendar/update-agenda/update-agenda.component';
import { CreateAgendaComponent } from './agendamento/calendar/create-agenda/create-agenda.component';
import { ListAgendaComponent } from './agendamento/calendar/list-agenda/list-agenda.component';
import { AgendamentoService } from './agendamento/service/agendamento.service';



@NgModule({
  declarations: [
    AppComponent,
    AgendamentoComponent,
    ConsultaComponent,
    HomeComponent,
    HeaderComponent,
    MenubarComponent,
    CalendarComponent,
    CadastroComponent,

    CreateTutorComponent,
    CreateAnimalComponent,

    UpdateAnimalComponent,
    UpdateTutorComponent,

    TutorListComponent,
    AnimalListComponent,

    UpdateAgendaComponent,
    CreateAgendaComponent,
    ListAgendaComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,

    BrowserModule,
    HttpClientModule,
  
    ReactiveFormsModule,
    
    // DataTablesModule
  ],
  providers:
  [ TutorService,
    AnimalService,

    AgendamentoService,
    HttpClient,
    
    // HttpHandler
  ],
  exports: [
  ],
  bootstrap: [AppComponent]
})
// @ts-ignore
export class AppModule { }
