import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { MatTableDataSource } from '@angular/material/table';
import { catchError, map, Observable, of } from 'rxjs';
import { Ator } from 'src/app/model/ator';
import { Episodio } from 'src/app/model/episodio';
import { Genero } from 'src/app/model/genero';
import { Video } from 'src/app/model/video';
import { EpisodiosDialogComponent } from 'src/app/shared/components/episodios-dialog/episodios-dialog.component';
import { ErrorDialogComponent } from 'src/app/shared/components/error-dialog/error-dialog.component';
import { VideoDialogComponent } from 'src/app/shared/components/video-dialog/video-dialog.component';
import { Serie } from '../../model/serie';
import { SeriesService } from '../services/series.service';

@Component({
  selector: 'app-series',
  templateUrl: './series.component.html',
  styleUrls: ['./series.component.scss']
})
export class SeriesComponent implements OnInit {
  displayedColumns = [
    'nome',
    'sinopse',
    'numeroTemporadas',
    'urlTrailer',
    'urlCapa',
    'anoLancamento',
    'elenco',
    'genero',
    'episodios'
  ];

  seriesSource$: Observable<MatTableDataSource<Serie>>;

  dataSource = new MatTableDataSource<Serie>();

  constructor(private seriesService: SeriesService, public dialog: MatDialog) {
    this.seriesSource$ = this.seriesService.list().pipe(
      catchError((error) => {
        this.onError('Ocorreu um erro ao carregar os series.');
        return of([]);
      }),
      map((series) => {
        series.forEach((serie) => {
          serie.genero = serie.genero.nome as unknown as Genero;
          serie.elenco = serie.elenco.map(
            (ator) => ator.nome as unknown as Ator
          );
        });
        this.dataSource.data = series;
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

  onEpisodios(episodios: Episodio[]) {
    this.dialog.open(EpisodiosDialogComponent, {
      data: episodios,
    });
  }

  ngOnInit(): void {}
}
