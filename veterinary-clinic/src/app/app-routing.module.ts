import { NgModule } from '@angular/core';

import { CadastroComponent } from '../app/cadastro/cadastro.component';
import { AgendamentoComponent } from '../app/agendamento/agendamento.component';
import { HomeComponent } from '../app/home/home.component';
import { RouterModule, Routes } from '@angular/router';

import { CreateTutorComponent } from '../app/cadastro/tutor/create-tutor/create-tutor.component';
import {TutorListComponent} from "./cadastro/tutor/tutor-list/tutor-list.component";
import {UpdateTutorComponent} from "./cadastro/tutor/update-tutor/update-tutor.component";
import {UpdateAnimalComponent} from "./cadastro/animal/update-animal/update-animal.component";
import {AnimalListComponent} from "./cadastro/animal/animal-list/animal-list.component";
import {CreateAnimalComponent} from "./cadastro/animal/create-animal/create-animal.component";
import { UpdateAgendaComponent } from './agendamento/calendar/update-agenda/update-agenda.component';



const routes: Routes = [
  //#####-----AGENDAMENTOS------########
  {path:'agendamento/editar', component:UpdateAgendaComponent},

  //#####-----TUTOR------########
  {path:'atualiza/animal', component:UpdateAnimalComponent},
  {path:'lista/animal', component:AnimalListComponent},
  {path:'cadastro/animal', component:CreateAnimalComponent},

  //#####-----ANIMAL------########
  {path:'atualiza/tutor', component:UpdateTutorComponent},
  {path:'lista/tutor', component:TutorListComponent},
  {path:'cadastro/tutor', component:CreateTutorComponent},

  //######----GERAL------#########
  {path:'cadastro', component:CadastroComponent},
  {path:'agendamento', component:AgendamentoComponent},
  {path:'home', component:HomeComponent},
  {path:'', component:HomeComponent},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
// @ts-ignore
export class AppRoutingModule { }
