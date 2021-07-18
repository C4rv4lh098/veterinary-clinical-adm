// import { HomeComponent } from '../app/home/home.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateTutorComponent } from './tutor/create-tutor/create-tutor.component'; 

const routes: Routes = [
  
  {path:'tutor-create', component:CreateTutorComponent},
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
export class CadastroRoutingModule { }
