import { Component, Inject, OnInit } from '@angular/core';
import { MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { MatTableDataSource } from '@angular/material/table';
import { Video } from 'src/app/model/video';
import { Episodio } from '../../../model/episodio';
import { VideoDialogComponent } from '../video-dialog/video-dialog.component';

@Component({
  selector: 'app-episodios-dialog',
  templateUrl: './episodios-dialog.component.html',
  styleUrls: ['./episodios-dialog.component.scss']
})
export class EpisodiosDialogComponent implements OnInit {
  displayedColumns = [
    'nome',
    'numeroTemporada',
    'video'
  ];

  episodiosSource = new MatTableDataSource<Episodio>(this.data);

  constructor(@Inject(MAT_DIALOG_DATA) public data: Episodio[], public dialog: MatDialog) {
  }

  onAssistir(video: Video) {
    this.dialog.open(VideoDialogComponent, {
      data: video,
    });
  }

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.episodiosSource.filter = filterValue.trim().toLowerCase();
  }

  ngOnInit(): void {
  }

}
