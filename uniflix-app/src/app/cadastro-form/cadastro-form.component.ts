import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';

import { CadastroFormService } from './services/cadastro-form.service';
import { Filme } from '../model/filme';
import { Serie } from '../model/serie';
import { Documentario } from '../model/documentario';

@Component({
  selector: 'app-cadastro-form',
  templateUrl: './cadastro-form.component.html',
  styleUrls: ['./cadastro-form.component.scss']
})
export class CadastroFormComponent implements OnInit {

  form: FormGroup;
  hide = true;

  constructor(private formBuilder: FormBuilder, private service: CadastroFormService, private snackBar: MatSnackBar, private router: Router) {
    this.form = this.formBuilder.group({
      nome: [''],
      dataNascimento: [''],
      email: [''],
      senha: [''],
      confirmarSenha: [''],
      cpf: [''],
      endereco: [''],
      cartao: this.formBuilder.group({
        numero: [''],
        portador: [''],
        validade: [''],
        cvv: ['']
      }),
      favoritos: this.formBuilder.group({
        filmes: Array<Filme>(),
        documentarios: Array<Documentario>(),
        series: Array<Serie>()
      }),
      mensalidade: this.formBuilder.group({
        dataPagamento: new Date(),
        pago: true,
        plano: this.formBuilder.group({
          id: [''],
        })
      }),
      visualizacoes: ['0']
    });
  }

  onSubmit() {
    this.service.save(this.form.value)
    .subscribe(result => this.onSuccess(), error => this.onError());
  }

  private onError() {
    this.snackBar.open("Erro ao cadastrar usuário.", 'Fechar', {duration: 5000});
  }

  private onSuccess() {
    this.router.navigate(['/filmes']);
    this.snackBar.open("Usuário cadastrado com sucesso.", 'Fechar', {duration: 5000});
  }

  ngOnInit(): void {
  }

}
