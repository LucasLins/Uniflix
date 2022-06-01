import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { AppMaterialModule } from '../shared/app-material/app-material.module';
import { SharedModule } from '../shared/shared.module';

import { DocumentariosRoutingModule } from './documentarios-routing.module';
import { DocumentariosComponent } from './documentarios/documentarios.component';


@NgModule({
  declarations: [
    DocumentariosComponent
  ],
  imports: [
    CommonModule,
    DocumentariosRoutingModule,
    AppMaterialModule,
    SharedModule
  ]
})
export class DocumentariosModule { }
