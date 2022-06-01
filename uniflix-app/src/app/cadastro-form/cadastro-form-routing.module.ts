import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { CadastroFormComponent } from './cadastro-form.component';
import { FilmesComponent } from '../filmes/filmes/filmes.component';

const routes: Routes = [
  { path: '', component: CadastroFormComponent },
  { path: 'filmes', component: FilmesComponent }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CadastroFormRoutingModule { }
