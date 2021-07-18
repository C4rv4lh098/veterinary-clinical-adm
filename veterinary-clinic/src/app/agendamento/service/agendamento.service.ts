import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable} from "rxjs/index";
import { Agenda } from 'src/app/agendamento/model/agenda.model';
import { environment } from 'src/environments/environment';

@Injectable()
export class AgendamentoService {

  constructor(private http: HttpClient) { }
  private baseUrl: string = environment.baseUrl+'/api/consultas';

  

  getAgenda() : Observable<any> {
    return this.http.get<any>(this.baseUrl);
  }

  getAgendaById(id: number): Observable<any> {
    return this.http.get(this.baseUrl + id);
  }

  createAgenda(agenda: Agenda): Observable<any> {
    return this.http.post<any>(this.baseUrl, agenda);
  }

  updateAgenda(id: number, agenda: Agenda): Observable<any> {
    return this.http.put<any>(this.baseUrl + agenda.consulta_id, agenda);
  }

  deleteAgenda(id: number): Observable<any> {
    return this.http.delete<any>(this.baseUrl + id);
  }

}

