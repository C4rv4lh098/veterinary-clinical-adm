import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Animal } from 'src/app/cadastro/model/animal.model';
import { AnimalService } from 'src/app/cadastro/service/animal.service';
import { ApiResponse } from 'src/app/cadastro/model/api.response';

@Component({
  selector: 'app-update-animal',
  templateUrl: './update-animal.component.html',
  styleUrls: ['./update-animal.component.css']
})
export class UpdateAnimalComponent implements OnInit {

  animal_id!: number;
  animal!: Animal;
  apiResponse!:ApiResponse;

  constructor(private route: ActivatedRoute,private router: Router,
    private animalService: AnimalService) { }

  ngOnInit() {
    this.animal = new Animal();

    this.animal_id = this.route.snapshot.params['animal_id'];
    this.animalService.getAnimalById(this.animal_id)
      .subscribe(data => {
        console.log(data)
        this.animal = data;
      }, error => console.log(error));
  }

  onSubmit() {
    this.animalService.updateAnimal(this.animal_id, this.animal)
      .subscribe(data => console.log(data), error => console.log(error));
    this.animal = new Animal();
    console.log('Atualizado com sucesso!');
    this.router.navigate(['/cadastro']);
    }

  
  list(){
    this.router.navigate(['/atualiza/animal']);
  }
}