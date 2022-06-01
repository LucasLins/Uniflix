import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { first, tap } from 'rxjs';
import { Serie } from '../../model/serie';

@Injectable({
  providedIn: 'root'
})
export class SeriesService {
  private readonly API = 'api/serie';

  constructor(private httpClient: HttpClient) { }

  list() {
    return this.httpClient.get<Serie[]>(this.API)
    .pipe(
      first(),
      tap(series => console.log(series))
    );
  }
}
