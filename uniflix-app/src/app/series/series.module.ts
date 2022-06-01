import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';

import { AppMaterialModule } from '../shared/app-material/app-material.module';
import { SharedModule } from '../shared/shared.module';
import { SeriesRoutingModule } from './series-routing.module';
import { SeriesComponent } from './series/series.component';


@NgModule({
  declarations: [
    SeriesComponent
  ],
  imports: [
    CommonModule,
    SeriesRoutingModule,
    AppMaterialModule,
    SharedModule
  ]
})
export class SeriesModule { }
