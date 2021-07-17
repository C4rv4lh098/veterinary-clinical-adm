// import { HomeComponent } from '../app/home/home.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {FormTutorComponent} from "./form-tutor/form-tutor.component";

const routes: Routes = [
  {path:'form-tutor', component:FormTutorComponent},
  // {path:'consulta', component:ConsultaComponent},
  // {path:'cadastro', component:CadastroComponent},
  // {path:'agendamento', component:AgendamentoComponent},
  // {path:'home', component:HomeComponent},
  // {path:'', component:HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
// @ts-ignore
export class AppRoutingModule { }
