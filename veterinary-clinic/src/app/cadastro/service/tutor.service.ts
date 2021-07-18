import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable} from "rxjs/index";
import { ApiResponse } from '../model/api.response';
import { Tutor } from '../model/tutor.model';
import { environment } from 'src/environments/environment';

@Injectable()
export class TutorService {

  constructor(private http: HttpClient) { }
  private baseUrl: string = environment.baseUrl+'/api/tutor/';

  

  getTutor() : Observable<any> {
    return this.http.get<any>(this.baseUrl);
  }

  getTutorById(tutor_id: number): Observable<any> {
    return this.http.get(this.baseUrl + tutor_id);
  }

  createTutor(tutor: Tutor): Observable<any> {
    return this.http.post<any>(this.baseUrl + 'tutor', tutor);
  }

  updateTutor(tutor_id: number, tutor: Tutor): Observable<any> {
    return this.http.put<any>(this.baseUrl + tutor.tutor_id, tutor);
  }

//   deleteTutor(tutor_id: number): Observable<ApiResponse> {
//     return this.http.delete<ApiResponse>(this.baseUrl + tutor_id);
//   }
}