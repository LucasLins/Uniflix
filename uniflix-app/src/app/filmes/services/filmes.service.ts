import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { delay, first, tap } from 'rxjs/operators';

import { Filme } from '../../model/filme';

@Injectable({
  providedIn: 'root'
})
export class FilmesService {

  private readonly API = 'api/filme';

  constructor(private httpClient: HttpClient) { }

  list() {
    return this.httpClient.get<Filme[]>(this.API)
    .pipe(
      first(),
      tap(filmes => console.log(filmes))
    );
  }
}
