import { Component, OnInit } from '@angular/core';
import { FormTutor } from './form-tutor';
import { FormTutorService } from './form-tutor.service';

@Component({
    templateUrl: './form-tutor-list.component.html'
})
// @ts-ignore
export class FormTutorListComponent implements OnInit {

    filteredTutor: FormTutor[] = [];

    _tutor: FormTutor[] = [];

    _filterBy: string;

    constructor(private formTutorService: FormTutorService) { }

    ngOnInit(): void {
        this.retrieveAll();
    }

    retrieveAll(): void {
        this.formTutorService.retrieveAll().subscribe({
            next: (tutor: FormTutor[]) => {
                this._tutor = tutor;
                this.filteredTutor = this._tutor;
            },
            error: err => console.log('Error', err)
        })
    }

    // deleteById(courseId: number): void {
    //     this.formTutorService.deleteById(courseId).subscribe({
    //         next: () => {
    //             console.log('Deleted with success');
    //             this.retrieveAll();
    //         },
    //         error: err => console.log('Error', err)
    //     })
    // }

    set filter(value: string) {
        this._filterBy = value;

        this.filteredTutor = this._tutor.filter((tutor: FormTutor) => tutor.name.toLocaleLowerCase().indexOf(this._filterBy.toLocaleLowerCase()) > -1);
    }

    get filter() {
        return this._filterBy;
    }

}
