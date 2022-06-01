import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Usuario } from '../../model/usuario';
import { first, map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})


export class CadastroFormService {

  private readonly API = 'api/usuario';

  constructor(private httpClient: HttpClient) { }

  save(record: Usuario) {
    return this.httpClient.post<Usuario>(this.API, record).pipe();
  }
}
