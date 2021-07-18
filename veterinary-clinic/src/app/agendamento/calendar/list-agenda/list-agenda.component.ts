import { Component, OnInit, ViewChild } from '@angular/core';
import { Agenda } from 'src/app/agendamento/model/agenda.model';
import { AgendamentoService } from 'src/app/agendamento/service/agendamento.service';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-agenda',
  templateUrl: './list-agenda.component.html',
  styleUrls: ['./list-agenda.component.css']
})
export class ListAgendaComponent implements OnInit {

  agenda!: Observable<any>;
  constructor(private agendaService: AgendamentoService,
    private router: Router) { 
      }
  ngOnInit() {
    this.agenda = this.agendaService.getAgenda();
  }

  deleteEmployee(id: number) {
    this.agendaService.deleteAgenda(id)
      .subscribe(
        data => {
          console.log(data);
          this.agenda = this.agendaService.getAgenda();
        },
        error => console.log(error));
  }

  updateAgenda(consulta_id: number){
    this.router.navigate(['update', consulta_id]);
  }
}

