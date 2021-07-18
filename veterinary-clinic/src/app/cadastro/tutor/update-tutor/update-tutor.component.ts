import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Tutor } from 'src/app/cadastro/model/tutor.model';
import { TutorService } from 'src/app/cadastro/service/tutor.service';
import { ApiResponse } from 'src/app/cadastro/model/api.response';

@Component({
  selector: 'app-update-tutor',
  templateUrl: './update-tutor.component.html',
  styleUrls: ['./update-tutor.component.css']
})
export class UpdateTutorComponent implements OnInit {

  tutor_id!: number;
  tutor!: Tutor;
  apiResponse!:ApiResponse;

  constructor(private route: ActivatedRoute,private router: Router,
    private tutorService: TutorService) { }

  ngOnInit() {
    this.tutor = new Tutor();

    this.tutor_id = this.route.snapshot.params['tutor_id'];
    this.tutorService.getTutorById(this.tutor_id)
      .subscribe(data => {
        console.log(data)
        this.tutor = data;
      }, error => console.log(error));
  }

  onSubmit() {
    this.tutorService.updateTutor(this.tutor_id, this.tutor)
      .subscribe(data => console.log(data), error => console.log(error));
    this.tutor = new Tutor();
    this.router.navigate(['/cadastro']);
    }

  
  list(){
    this.router.navigate(['/cadastro']);
  }
}