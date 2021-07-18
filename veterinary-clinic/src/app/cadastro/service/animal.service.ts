import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable} from "rxjs/index";
import { ApiResponse } from '../model/api.response';
import { Animal } from '../model/animal.model';
import { environment } from 'src/environments/environment';

@Injectable()
export class AnimalService {

  constructor(
    private http: HttpClient) { }
    private baseUrl: string = environment.baseUrl+'/api/animal/';

  

  getAnimal() : Observable<any> {
    return this.http.get<any>(this.baseUrl);
  }

  getAnimalById(animal_id: number): Observable<any> {
    return this.http.get(this.baseUrl + animal_id);
  }

  createAnimal(animal: Animal): Observable<any> {
    return this.http.post<any>(this.baseUrl + 'animal', animal);
  }

  updateAnimal(animal_id: number, animal: Animal): Observable<any> {
    return this.http.put<any>(this.baseUrl + animal_id, animal);
  }

//   deleteAnimal(animal_id: number): Observable<ApiResponse> {
//     return this.http.delete<ApiResponse>(this.baseUrl + animal_id);
//   }
}