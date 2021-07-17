import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { FormTutor } from './form-tutor';
import { FormTutorService } from './form-tutor.service';

// noinspection AngularMissingOrInvalidDeclarationInModule
@Component({
    selector: 'form-tutor-root',
    templateUrl: './form-tutor.component.html'
})
// @ts-ignore
export class FormTutorComponent implements OnInit {

    tutor!: FormTutor;
  // form: any;

    constructor(private activatedRoute: ActivatedRoute, private formTutorService: FormTutorService) { }

    ngOnInit(): void {
        this.formTutorService.retrieveById(Number('tutor_id')).subscribe({
            next: tutor => this.tutor = tutor,
            error: err => console.log('Error', err)
        });
    }

    save(): void {
        this.formTutorService.save(this.tutor).subscribe({
            next: tutor => console.log('Saved with success', tutor),
            error: err => console.log('Error', err)
        });
    }

}
