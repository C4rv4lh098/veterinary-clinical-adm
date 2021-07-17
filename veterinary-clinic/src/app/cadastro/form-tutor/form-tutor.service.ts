import { FormTutor } from './form-tutor';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
    providedIn: 'root'
})
// @ts-ignore
export class FormTutorService {

    private tutorUrl: string = 'http://localhost:8082/api/tutor';

    constructor(private httpClient: HttpClient) { }

    retrieveAll(): Observable<FormTutor[]> {
        return this.httpClient.get<FormTutor[]>(this.tutorUrl);
    }

    retrieveById(tutor_id: number): Observable<FormTutor> {
        return this.httpClient.get<FormTutor>(`${this.tutorUrl}/${tutor_id}`);
    }

    save(tutor: FormTutor): Observable<FormTutor> {
        if(tutor.tutor_id) {
            return this.httpClient.put<FormTutor>(`${this.tutorUrl}/${tutor.tutor_id}`, tutor);
        } else {
            return this.httpClient.post<FormTutor>(`${this.tutorUrl}`, tutor);
        }
    }

    // deleteById(id: number): Observable<any> {
    //     return this.httpClient.delete<any>(`${this.coursesUrl}/${id}`);
    // }

}

// class FormTutorServiceImpl extends FormTutorService {
// }

