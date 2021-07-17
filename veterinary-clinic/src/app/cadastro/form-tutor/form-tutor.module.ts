import { NgModule } from '@angular/core';
import { FormTutorListComponent } from './form-tutor-list.component';
import { FormTutorComponent } from './form-tutor.component';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { StarModule } from '../shared/component/star/star.module';
import { AppPipeModule } from '../shared/pipe/app-pipe.module';


@NgModule({
    declarations: [
        FormTutorListComponent,
        FormTutorComponent
    ],
    imports: [

        CommonModule,
        FormsModule,
        StarModule,
        AppPipeModule,
        RouterModule.forChild([
            {
                path: 'api/tutor', component: FormTutorListComponent
            },
            {
                path: 'api/tutor/:tutor_id', component: FormTutorComponent
            }
        ])
    ]
})
// @ts-ignore
export class FormTutorModule {

}
