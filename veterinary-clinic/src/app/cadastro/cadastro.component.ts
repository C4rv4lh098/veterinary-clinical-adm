import { Component, OnInit, Input, ElementRef, ViewChild, OnChanges, OnDestroy, } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable, Subject, Subscription } from 'rxjs';
import 'rxjs/add/operator/debounceTime';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/distinctUntilChanged';
// import { BreakpointObserver } from "@angular/cdk/layout";
// import { cadastroInterface } from '../../interfaces/cadastro-interface';
// import { AlertService } from 'src/app/shared/alert/alert.service';
// import { UserService } from 'src/app/services/user/user.service';
// import { StateService } from '../../services/state.service';
// import { CadastroService} from '../../services/cadastro.service';
import { map } from 'rxjs/operators';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent implements OnInit {

  // cadastroForm: FormGroup;
  // /** INTERFACES */
  // cadastroEdit: cadastroInterface;
  // /** condicionais */
  // isLoadingResults = false;
  // isRateLimitReached = false;
  // is_edit = false;
  // existId = false;
  // // textoErrorId: string;

  // tutor_id: any;
  // nome: any;
  // rg: any;
  // cpf: any;
  // age: any;
  // email: any;
  // nationality: any;
  // phone: any;
  // country: any;
  // state: any;
  // cep: any;
  // street: any;
  // district: any;
  // number: any;
  // city_id: any;
  // address_id: any;

  // ageAnimal: any;
  // breed: any;
  // species: any;
  // sex: any;
  // animal_id: any;

  // cadastro$: Observable<cadastroInterface>;

  // textoClass: any;
  // isMobile = false;

  routerLink = '../../../';
  // perfisUsuario: any;
  // manipuladorDeModuloCcaf: boolean;

  // searchTextChangedArma = new Subject<string>();
  // searchTextChangedMilitar = new Subject<string>();
  // listAllArmas$: Observable<any>;
  // listAllMilitar$: Observable<any>;
  constructor(
    // private formBuilder: FormBuilder,
    // private cadastroService: CadastroService,
    // private router: Router,
    // private alertService: AlertService,
    // private userService: UserService,
    // private stateService: StateService,
    // private route: ActivatedRoute,
    // private breakpointObserver: BreakpointObserver
  ) { }

  ngOnInit(): void {
    // this.breakpointObserver.observe([
    //   '(min-width: 800px)'
    // ]).subscribe(result => {
    //     this.isMobile = result.matches;
    //     if (!this.isMobile){
    //       this.textoClass = '';
    //     } else {
    //       this.textoClass = 'mat-form-field--inline';
    //     }
    // });

    // this.tutor_id = this.route.snapshot.params.id;
    // this.formulariosDeCadastro();
  }

  // formulariosDeCadastro() {
  //   // FORMULARIO DE CADASTRO DO CCAF

  //   this.cadastroForm = this.formBuilder.group({
  //     tutor_id: ['', [Validators.required]],
  //     city_id_id : [''],
  //     address_id : [''],

  //     cpf: ['', [Validators.required]],
  //     name: ['', [Validators.required]],
  //     rg: ['', [Validators.required]],
  //     age: ['', [Validators.required]],
  //     email: ['', [Validators.required]],
  //     nationality: ['', [Validators.required]],
  //     phone: ['', [Validators.required]],
  //     country: ['', [Validators.required]],
  //     state: ['', [Validators.required]],
  //     cep: ['', [Validators.required]],
  //     street: ['', [Validators.required]],
  //     district: ['', [Validators.required]],
  //     number: ['', [Validators.required]],

  //     animal_id: [''],
  //     ageAnimal: ['', [Validators.required]],
  //     breed: ['', [Validators.required]],
  //     species: ['', [Validators.required]],
  //     sex: ['', [Validators.required]],

  //   });
  // }

  // cadastrar() {
  //   this.isLoadingResults = true;
  //   const cadastro = this.cadastroForm.getRawValue() as cadastroInterface;
  //   cadastro.tutor_id = this.tutor_id;
  //   cadastro.animal_id = this.animal_id;
  //   if (!this.is_edit) {
  //     this.cadastro$ = this.cadastroService.cadastrar(cadastro);
  //     this.cadastro$.subscribe(() => {
  //       // tslint:disable-next-line:no-unused-expression
  //       this.isLoadingResults = false;
  //       this.stateService.setMessage('Cadastrado com sucesso!');
  //       this.router.navigate(['home']);
  //     }, (err) => {
  //       this.isLoadingResults = false;
  //       this.isRateLimitReached = true;
  //       this.errosCadastro(err);
  //     });
  //   } else {
  //     this.cadastro$ = this.cadastroService.editarCadastro(this.tutor_id, cadastro);
  //     this.cadastro$.subscribe(() => {
  //       // tslint:disable-next-line:no-unused-expression
  //       this.isLoadingResults = false;
  //       this.stateService.setMessage('Editado com sucesso!');
  //       this.router.navigate(['home']);
  //     }, (err) => {
  //       this.isLoadingResults = false;
  //       this.isLoadingResults = true;
  //       this.errosCadastro(err);
  //     });
  //   }
  // }

  // errosCadastro(err) {
  //   if (err.status === 422) {
  //     this.isLoadingResults = false;
  //     // console.log(err.error[0]);
  //     this.alertService.danger('Erro no campo: ' + err.error[0]['field'] + ' Motivo: ' + err.error[0]['message']);
  //     window.scroll(0, 0); // IR PARA O TOPO DA PAGINA
  //   }
  //   if (err.status === 401) {
  //     this.isLoadingResults = false;
  //     this.alertService.danger('Token expirado, refaça o login!');
  //     this.userService.logout();
  //     this.router.navigate(['']);
  //   }
  //   if (err.status !== 401 && err.status !== 422) {
  //     this.isLoadingResults = false;
  //     if(this.is_edit){
  //       this.alertService.danger('houve um erro ao editar');
  //     }else{
  //       this.alertService.danger('houve um erro ao cadastrar');
  //     }
    // }
  // }

}
