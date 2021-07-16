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

  cadastroForm: FormGroup;
  submittingForm: boolean = false;
  currentAction: string;
  tutor: CadastroTutor;
  animal: CadastroAnimal;
  pageTitle: string;

  constructor(private _cadastroService: CadastroService,
    private route: ActivatedRoute,
    private router: Router,) {}

  ngOnInit() {
    this.tutor = new CadastroTutor();
    this.animal = new CadastroAnimal();
    this.setCurrentAction();
  }

  ngAfterContentChecked(){
    this.atualizarPageTitle();
  }

  private setCurrentAction() {   
    if(this.route.snapshot.url[1].path == "novo"){
      this.currentAction = "new";    
    }
    else
    {
      this.currentAction = "edit";
      this.carregarTutores();          
    }
  }

  submitForm(cadastroForm) {
    console.log(cadastroForm)
    this.submittingForm = true;

    if (this.currentAction == "new") {
      this.cadastrarTutor(cadastroForm);
    }
    else {
      this.editar(cadastroForm);
    }
  }

  private carregarTutores() {
    if(this.currentAction == "edit"){
      this.route.paramMap.pipe(
        switchMap(params => this._cadastroService.buscarPorTutorId(+params.get("tutor_id")))
      )
      .subscribe(
        (c)=>{
          this.tutor = c;
        },
        (error) => alert('Ocorreu um erro no servidor, tente novamente.')
      )
    }
  }

  private cadastrarTutor(cadastroForm) {
    const tutor: CadastroTutor = Object.assign(new CadastroTutor(), cadastroForm.value);    

     this._cadastroService.gravar(tutor)
       .subscribe(
          () => this.cadastroGravadoComSucesso(),
          error => this.erroAoCadastrar(error)
       )
  }

  private editar(cadastroForm) {
    const tutor: CadastroTutor = Object.assign(new CadastroTutor(), cadastroForm.value);    

    this._cadastroService.editar(tutor)
      .subscribe(
        tutor => this.cadastroGravadoComSucesso(),
        error => this.erroAoCadastrar(error)
      )
  }

  private cadastroGravadoComSucesso() {
    this.router.navigateByUrl("/api/tutores/")
  }

  private erroAoCadastrar(error) {
    alert(error.body.error);
  }

  private atualizarPageTitle() {
    if(this.currentAction == "new")
      this.pageTitle = "Cadastro de Novo Tutor";
    else{
      const tutorNome = this.tutor.name || ""
      this.pageTitle = "Editando Cadastro: " + tutorNome;
    }
  }

}