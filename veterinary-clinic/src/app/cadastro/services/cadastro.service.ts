import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from "@angular/common/http";

import { Observable, throwError } from "rxjs";
import { map, catchError, flatMap } from "rxjs/operators";

import { CadastroTutor } from "../models-tutor/cadastro-tutor.model";
import { CadastroAnimal } from "../models-animal/cadastro-animal.model";


@Injectable({
    providedIn: 'root'
})

export class CadastroService {
    private apiTutorPath: string = "api/tutor/";
    private apiAnimalPath: string = "api/animal/";

    constructor(private http: HttpClient) { }

    //#############-----TUTOR-------################

    retornarTutores(): Observable<CadastroTutor[]>{
        return this.http.get(this.apiTutorPath).pipe(
          catchError(this.handleError),
          map(this.jsonDataToCadastroTutores)
        )
      }


    cadastrar(tutor: CadastroTutor): Observable<CadastroTutor>{
      return this.http.post(this.apiTutorPath, tutor).pipe(
        catchError(this.handleError),
        map(this.jsonDataToCadastroTutor)
      )
    }

    editar(tutor: CadastroTutor): Observable<CadastroTutor>{
        const url = `${this.apiTutorPath}/${tutor.tutor_id}`;

        return this.http.post(url, tutor).pipe(
          catchError(this.handleError),
          map(() => tutor)
        )
    }

  buscarPorNomeCpf(cpf: string ): Observable<CadastroTutor> {
        const url = `${this.apiTutorPath}/filter/custom/${cpf}`;

        return this.http.get(url).pipe(
          catchError(this.handleError),
          map(this.jsonDataToCadastroTutor)
        )
    }

  buscarPorId(id: string): Observable<CadastroTutor> {
      const url = `${this.apiTutorPath}/${id}`;

      return this.http.get(url).pipe(
        catchError(this.handleError),
        map(this.jsonDataToCadastroTutor)
      )
    }


    private jsonDataToCadastroTutores(jsonData: any[]) : CadastroTutor[] {
        const contatos: CadastroTutor[] = [];
        jsonData.forEach(element => contatos.push(element as CadastroTutor));
        return contatos;
    }

    private jsonDataToCadastroTutor(jsonData: any): CadastroTutor{
        return jsonData as CadastroTutor;
    }

    private handleError(error: any): Observable<any>{
       console.log("ERRO NA REQUISIÇÃO => ", error);
       return throwError(error);
    }

    //##############-------ANIMAL-------###################

    retornarAnimais(): Observable<CadastroAnimal[]>{
        return this.http.get(this.apiAnimalPath).pipe(
          catchError(this.handleError),
          map(this.jsonDataToCadastroAnimais)
        )
      }


    cadastrarAnimal(animal: CadastroAnimal): Observable<CadastroAnimal>{
      return this.http.post(this.apiAnimalPath, animal).pipe(
        catchError(this.handleError),
        map(this.jsonDataToCadastroAnimal)
      )
    }

    editarAnimal(animal: CadastroAnimal): Observable<CadastroAnimal>{
        const url = `${this.apiAnimalPath}/${animal.animal_id}`;

        return this.http.post(url, animal).pipe(
          catchError(this.handleError),
          map(() => animal)
        )
    }

    buscarPorNome(name: string): Observable<CadastroAnimal> {
        const url = `${this.apiAnimalPath}/filter/custom/${name}`;

        return this.http.get(url).pipe(
          catchError(this.handleError),
          map(this.jsonDataToCadastroAnimal)
        )
    }


    private jsonDataToCadastroAnimais(jsonData: any[]) : CadastroAnimal[] {
        const contatos: CadastroAnimal[] = [];
        jsonData.forEach(element => contatos.push(element as CadastroAnimal));
        return contatos;
    }

    private jsonDataToCadastroAnimal(jsonData: any): CadastroAnimal{
        return jsonData as CadastroAnimal;
    }

    // private handleError(error: any): Observable<any>{
    //    console.log("ERRO NA REQUISIÇÃO => ", error);
    //    return throwError(error);
    // }
}
