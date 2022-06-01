import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'cadastrar' },
  {
    path: 'filmes',
    loadChildren: () =>
      import('./filmes/filmes.module').then((m) => m.FilmesModule),
  },
  {
    path: 'cadastrar',
    loadChildren: () =>
      import('./cadastro-form/cadastro-form.module').then(
        (m) => m.CadastroFormModule
      ),
  },
  {
    path: 'documentarios',
    loadChildren: () =>
      import('./documentarios/documentarios.module').then(
        (m) => m.DocumentariosModule
      ),
  },
  {
    path: 'series',
    loadChildren: () =>
      import('./series/series.module').then(
        (m) => m.SeriesModule
      ),
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
