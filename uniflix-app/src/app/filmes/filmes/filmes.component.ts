import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { catchError, map, Observable, of } from 'rxjs';

import { Filme } from '../../model/filme';
import { ErrorDialogComponent } from '../../shared/components/error-dialog/error-dialog.component';
import { FilmesService } from '../services/filmes.service';
import { MatTableDataSource } from '@angular/material/table';
import { Genero } from '../../model/genero';
import { Ator } from '../../model/ator';
import { Video } from '../../model/video';
import { VideoDialogComponent } from '../../shared/components/video-dialog/video-dialog.component';

@Component({
  selector: 'app-filmes',
  templateUrl: './filmes.component.html',
  styleUrls: ['./filmes.component.scss'],
})
export class FilmesComponent implements OnInit {
  displayedColumns = [
    'titulo',
    'sinopse',
    'urlTrailer',
    'urlCapa',
    'anoLancamento',
    'elenco',
    'genero',
    'video',
  ];

  filmesSource$: Observable<MatTableDataSource<Filme>>;

  dataSource = new MatTableDataSource<Filme>();

  constructor(private filmesService: FilmesService, public dialog: MatDialog) {
    this.filmesSource$ = this.filmesService.list().pipe(
      catchError((error) => {
        this.onError('Ocorreu um erro ao carregar os filmes.');
        return of([]);
      }),
      map((filmes) => {
        filmes.forEach((filme) => {
          filme.genero = filme.genero.nome as unknown as Genero;
          filme.elenco = filme.elenco.map(
            (ator) => ator.nome as unknown as Ator
          );
        });
        this.dataSource.data = filmes;
        return this.dataSource;
      })
    );
  }

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }

  onError(errorMsg: string) {
    this.dialog.open(ErrorDialogComponent, {
      data: errorMsg,
    });
  }

  onAssistir(video: Video) {
    this.dialog.open(VideoDialogComponent, {
      data: video,
    });
  }

  ngOnInit(): void {}
}
