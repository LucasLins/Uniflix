import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { first, tap } from 'rxjs';

import { Documentario } from '../../model/documentario';

@Injectable({
  providedIn: 'root',
})
export class DocumentariosService {
  private readonly API = 'api/documentario';

  constructor(private httpClient: HttpClient) {}

  list() {
    return this.httpClient.get<Documentario[]>(this.API).pipe(
      first(),
      tap((documentarios) => console.log(documentarios))
    );
  }
}
