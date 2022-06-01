import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { MatTableDataSource } from '@angular/material/table';
import { catchError, map, Observable, of } from 'rxjs';
import { Ator } from 'src/app/model/ator';
import { Genero } from 'src/app/model/genero';
import { Video } from 'src/app/model/video';
import { ErrorDialogComponent } from 'src/app/shared/components/error-dialog/error-dialog.component';
import { VideoDialogComponent } from 'src/app/shared/components/video-dialog/video-dialog.component';
import { Documentario } from '../../model/documentario';
import { DocumentariosService } from '../services/documentarios.service';

@Component({
  selector: 'app-documentarios',
  templateUrl: './documentarios.component.html',
  styleUrls: ['./documentarios.component.scss']
})
export class DocumentariosComponent implements OnInit {
  displayedColumns = [
    'titulo',
    'sinopse',
    'urlTrailer',
    'urlCapa',
    'anoLancamento',
    'elenco',
    'genero',
    'produtora',
    'video',
  ];

  documentariosSource$: Observable<MatTableDataSource<Documentario>>;

  dataSource = new MatTableDataSource<Documentario>();

  constructor(private documentariosService: DocumentariosService, public dialog: MatDialog) {
    this.documentariosSource$ = this.documentariosService.list().pipe(
      catchError((error) => {
        this.onError('Ocorreu um erro ao carregar os filmes.');
        return of([]);
      }),
      map((documentarios) => {
        documentarios.forEach((documentario) => {
          documentario.genero = documentario.genero.nome as unknown as Genero;
          documentario.elenco = documentario.elenco.map(
            (ator) => ator.nome as unknown as Ator
          );
        });
        this.dataSource.data = documentarios;
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
