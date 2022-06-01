import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { DocumentariosComponent } from './documentarios/documentarios.component';

const routes: Routes = [
  { path: '', component: DocumentariosComponent }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class DocumentariosRoutingModule { }
