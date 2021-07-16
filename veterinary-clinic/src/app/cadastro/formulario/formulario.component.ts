import { Component, OnInit } from '@angular/core';

import { CadastroTutor } from '../models-tutor/cadastro-tutor.model';

import { Router, ActivatedRoute } from '@angular/router';
import { CadastroAnimal } from '../models-animal/cadastro-animal.model';
import { CadastroService } from '../services/cadastro.service';

import { switchMap } from 'rxjs/operators';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
})
export class FormularioComponent implements OnInit {

  cadastroForm: FormGroup | undefined;
  submittingForm: boolean = false;
  currentAction: string | undefined;
  tutor: CadastroTutor | undefined;
  animal: CadastroAnimal | undefined;
  pageTitle: string | undefined;

  constructor(
    private _cadastroService: CadastroService,
    private route: ActivatedRoute,
    private router: Router,) {}

  ngOnInit() {
    this.tutor = new CadastroTutor();
    this.animal = new CadastroAnimal();
    // this.setCurrentAction();
  }

  ngAfterContentChecked(){
    this.atualizarPageTitle();
  }

  // private setCurrentAction() {
  //   if(this.route.snapshot.url[1].path == "novo"){
  //     this.currentAction = "new";
  //   }
  //   else
  //   {
  //     this.currentAction = "edit";
  //     this.carregarTutores(tutor.tutor_id);
  //   }
  // }

  submitForm(cadastroForm: { value: string; }) {
    console.log(cadastroForm)
    this.submittingForm = true;

    if (this.currentAction == "new") {
      this.cadastrarTutor(cadastroForm);
    }
    else {
      // @ts-ignore
      this.editar(cadastroForm);
    }
  }

  private carregarTutores(cpf: string) {
    if(this.currentAction == "edit"){
      this.route.paramMap.pipe(
        switchMap(params => this._cadastroService.buscarPorNomeCpf("cpf"))
      )
      .subscribe(
        (c)=>{
          this.tutor = c;
        },
        (error) => alert('Ocorreu um erro no servidor, tente novamente.')
      )
    }
  }

  private cadastrarTutor(cadastroForm: { value: any; }) {
    const tutor: CadastroTutor = Object.assign(new CadastroTutor(), cadastroForm.value);

     this._cadastroService.cadastrar(tutor)
       .subscribe(
          () => this.cadastroGravadoComSucesso(),
          error => this.erroAoCadastrar(error)
       )
  }

  private editar(cadastroForm: number) {
    const tutor: CadastroTutor = Object.assign(new CadastroTutor(), cadastroForm);

    this._cadastroService.editar(tutor)
      .subscribe(
        tutor => this.cadastroGravadoComSucesso(),
        error => this.erroAoCadastrar(error)
      )
  }

  private cadastroGravadoComSucesso() {
    this.router.navigateByUrl("/api/tutores/")
  }

  private erroAoCadastrar(error: { body: { error: any; }; }) {
    alert(error.body.error);
  }

  private atualizarPageTitle() {
    if(this.currentAction == "new")
      this.pageTitle = "Novo cadastro";
    else{
      // const tutorNome = this.tutor.name || ""
      this.pageTitle = "Editando Cadastro: ";
    }
  }

  // ########################--ANIMAL--################################
  submitFormAnimal(cadastroForm: any) {
    console.log(cadastroForm)
    this.submittingForm = true;

    if (this.currentAction == "new") {
      this.cadastrarTutor(cadastroForm);
    }
    else {
      this.editar(cadastroForm);
    }
  }

  private carregarAnimais(animal_id: number) {
    if(this.currentAction == "edit"){
      this.route.paramMap.pipe(
        switchMap(params => this._cadastroService.buscarPorNome("name"))
      )
      .subscribe(
        (c)=>{
          this.animal = c;
        },
        (error) => alert('Ocorreu um erro no servidor, tente novamente.')
      )
    }
  }

  private cadastrarAnimal(cadastroForm: { value: any; }) {
    const animal: CadastroAnimal = Object.assign(new CadastroAnimal(), cadastroForm.value);

     this._cadastroService.cadastrarAnimal(animal)
       .subscribe(
          () => this.cadastroGravadoComSucesso(),
          error => this.erroAoCadastrar(error)
       )
  }

  private editarAnimal(cadastroForm: number) {
    const animal: CadastroAnimal = Object.assign(new CadastroAnimal(), cadastroForm);

    this._cadastroService.editarAnimal(animal)
      .subscribe(
        animal => this.cadastroGravadoComSucesso(),
        error => this.erroAoCadastrar(error)
      )
  }

  // private cadastroGravadoComSucesso() {
  //   this.router.navigateByUrl("/api/tutores/")
  // }

  // private erroAoCadastrar(error) {
  //   alert(error.body.error);
  // }

  // private atualizarPageTitle() {
  //   if(this.currentAction == "new")
  //     this.pageTitle = "Cadastro de Novo";
  //   else{
  //     const tutorNome = this.tutor.name || ""
  //     this.pageTitle = "Editando Cadastro: " + tutorNome;
  //   }
  // }
  // cadastro: number;


  // }
}
