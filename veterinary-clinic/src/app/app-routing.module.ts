import { ConsultaComponent } from '../app/consulta/consulta.component';
import { CadastroComponent } from '../app/cadastro/cadastro.component';
import { AgendamentoComponent } from '../app/agendamento/agendamento.component';
import { HomeComponent } from '../app/home/home.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {path:'consulta', component:ConsultaComponent},
  {path:'cadastro', component:CadastroComponent},
  {path:'agendamento', component:AgendamentoComponent},
  {path:'home', component:HomeComponent},
  {path:'', component:HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
