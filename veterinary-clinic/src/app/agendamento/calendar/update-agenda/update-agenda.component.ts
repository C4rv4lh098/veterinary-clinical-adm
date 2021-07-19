import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Agenda } from 'src/app/agendamento/model/agenda.model';
import { AgendamentoService } from 'src/app/agendamento/service/agendamento.service';


@Component({
  selector: 'app-update-agenda',
  templateUrl: './update-agenda.component.html',
  styleUrls: ['./update-agenda.component.css']
})
export class UpdateAgendaComponent implements OnInit {

  id!: number;
  agenda!: Agenda;

  constructor(private route: ActivatedRoute,private router: Router,
    private agendaService: AgendamentoService) { }

  ngOnInit() {
    this.agenda = new Agenda();

    this.id = this.route.snapshot.params['id'];
    this.agendaService.getAgendaById(this.id)
      .subscribe(data => {
        console.log(data)
        this.agenda = data;
      }, error => console.log(error));
  }

  onSubmit() {
    this.agendaService.updateAgenda(this.id, this.agenda)
      .subscribe(data => console.log(data), error => console.log(error));
    this.agenda = new Agenda();
    this.router.navigate(['/agendamento/editar']);
    }


  list(){
    this.router.navigate(['agendamento']);
  }
}
