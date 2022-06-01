import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CadastroFormRoutingModule } from './cadastro-form-routing.module';
import { AppMaterialModule } from '../shared/app-material/app-material.module';
import { SharedModule } from '../shared/shared.module';
import { ReactiveFormsModule } from '@angular/forms';
import { CadastroFormComponent } from './cadastro-form.component';


@NgModule({
  declarations: [
    CadastroFormComponent
  ],
  imports: [
    CommonModule,
    CadastroFormRoutingModule,
    AppMaterialModule,
    SharedModule,
    ReactiveFormsModule
  ]
})
export class CadastroFormModule { }
