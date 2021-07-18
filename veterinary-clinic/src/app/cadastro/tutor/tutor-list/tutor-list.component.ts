import { Component, OnInit, ViewChild } from '@angular/core';
import { Tutor } from 'src/app/cadastro/model/tutor.model';
import { TutorService } from 'src/app/cadastro/service/tutor.service';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';
import { ApiResponse } from 'src/app/cadastro/model/api.response';

@Component({
  selector: 'app-tutor-list',
  templateUrl: './tutor-list.component.html',
  styleUrls: ['./tutor-list.component.css']
})
export class TutorListComponent implements OnInit {

  tutors!: Observable<any>;
  // tutor_id!: Observable<ApiResponse>;
  //dtOptions: DataTables.Settings = {};
  //@ViewChild('dtOptions', {static: true}) table;

  constructor(
    private tutorService: TutorService,
    private router: Router) 
    {
      // setTimeout(function(){
      //   // @ts-ignore
      //   $(function(){
      //     // @ts-ignore
      //     let dataTable = $('#example').DataTable();
      // });
      // },2000);

    }

  ngOnInit() {
    this.tutors = this.tutorService.getTutor();
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

  // updateTutor(tutor_id: number){
  //   this.router.navigate(['atualiza/tutor', tutor_id]);
  // }


}
