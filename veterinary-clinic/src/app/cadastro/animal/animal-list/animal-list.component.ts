import { Component, OnInit, ViewChild } from '@angular/core';
import { Animal } from 'src/app/cadastro/model/animal.model';
import { AnimalService } from 'src/app/cadastro/service/animal.service';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';
import { ApiResponse } from 'src/app/cadastro/model/api.response';

@Component({
  selector: 'app-animal-list',
  templateUrl: './animal-list.component.html',
  styleUrls: ['./animal-list.component.css']
})
export class AnimalListComponent implements OnInit {

  animals!: Observable<any>;
  // @ts-ignore
  dtOptions: DataTables.Settings = {};
  // @ts-ignore
  @ViewChild('dtOptions', {static: true}) table;


  constructor(
    private animalService: AnimalService,
    private router: Router) {
    //   setTimeout(function(){
    //     $(function(){
    //       $('#example').DataTable();
    //   });
    //   },2000);
    }

  ngOnInit() {
    this.animals = this.animalService.getAnimal();
    // setTimeout(function(){
    //   $(function(){
    //     $('#example').DataTable();
    // });
    // },2000);

  }


//   deleteAnimal(animal_id: number) {
//     this.animalService.deleteAnimal(animal_id)
//       .subscribe(
//         data => {
//           console.log(data);
//           this.animal = this.animalService.getAnimal();
//         },
//         error => console.log(error));
//   }

  updateAnimal(animal_id: number){
    this.router.navigate(['atualiza/animal', animal_id]);
  }



}
