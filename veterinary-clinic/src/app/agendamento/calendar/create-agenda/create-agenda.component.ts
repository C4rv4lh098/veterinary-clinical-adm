import { Component, OnInit } from '@angular/core';
import { AgendamentoService } from 'src/app/agendamento/service/agendamento.service';
import { Agenda } from 'src/app/agendamento/model/agenda.model';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Router} from '@angular/router';

@Component({
  selector: 'app-create-agenda',
  templateUrl: './create-agenda.component.html',
  styleUrls: ['./create-agenda.component.css']
})
export class CreateAgendaComponent implements OnInit {

  agenda: Agenda = new Agenda();
  submitted = false;

  constructor(private agendaService: AgendamentoService,
    private router: Router) { }

  ngOnInit() {
  }


  onSubmit() {
    this.submitted = true;
    this.agendaService.createAgenda(this.agenda)
    .subscribe(data => console.log(data), error => console.log(error));
    this.agenda = new Agenda();
    this.router.navigate(['/consultas']);
  }

}
