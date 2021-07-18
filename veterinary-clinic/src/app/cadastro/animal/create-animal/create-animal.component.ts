import { AnimalService } from 'src/app/cadastro/service/animal.service';
import { Animal } from 'src/app/cadastro/model/animal.model';

import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";

import {Router} from '@angular/router';
// import * as internal from 'stream';
import { TutorService } from '../../service/tutor.service';
import { Tutor } from '../../model/tutor.model';
// import { Tutor } from '../../model/tutor.model';


@Component({
  selector: 'app-create-animal',
  templateUrl: './create-animal.component.html',
  styleUrls: ['./create-animal.component.css']
})
export class CreateAnimalComponent implements OnInit {

  // tutor: Tutor = new Tutor();
  animal: Animal = new Animal();
  submitted = false;
  constructor(
    private animalService: AnimalService,
    private router: Router

    ) { }

  ngOnInit() {
  }


  onSubmit() {
    this.submitted = true;
    this.animalService.createAnimal(this.animal)
    .subscribe(data => console.log(data), error => console.log(error));
    this.animal = new Animal();
    this.router.navigate(['/cadastro']);
  }


}
