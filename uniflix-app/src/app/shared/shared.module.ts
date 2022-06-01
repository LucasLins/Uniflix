import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';

import { AppMaterialModule } from './app-material/app-material.module';
import { ErrorDialogComponent } from './components/error-dialog/error-dialog.component';
import { VideoDialogComponent } from './components/video-dialog/video-dialog.component';
import { YouTubePlayerModule } from '@angular/youtube-player';
import { EpisodiosDialogComponent } from './components/episodios-dialog/episodios-dialog.component';



@NgModule({
  declarations: [
    ErrorDialogComponent,
    VideoDialogComponent,
    EpisodiosDialogComponent
  ],
  imports: [
    CommonModule,
    AppMaterialModule,
    YouTubePlayerModule

  ],
  exports: [ErrorDialogComponent, YouTubePlayerModule]

})
export class SharedModule { }
