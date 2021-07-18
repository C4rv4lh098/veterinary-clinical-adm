// noinspection AngularMissingOrInvalidDeclarationInModule

import { TutorService } from 'src/app/cadastro/service/tutor.service';
import { Tutor } from 'src/app/cadastro/model/tutor.model';

import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";

import {Router} from '@angular/router';


@Component({
  selector: 'app-create-tutor',
  templateUrl: './create-tutor.component.html',
  styleUrls: ['./create-tutor.component.css']
})
export class CreateTutorComponent implements OnInit {

  tutor: Tutor = new Tutor();
  submitted = false;

  constructor(
    public tutorService: TutorService,
    public router: Router
  ) { }

  ngOnInit() {
  }


  onSubmit() {
    this.submitted = true;
    this.tutorService.createTutor(this.tutor)
    .subscribe(data => console.log(data), error => console.log(error));
    this.tutor = new Tutor();
    this.router.navigate(['/cadastro']);
  }


}
