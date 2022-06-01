import { Cartao } from "./cartao";
import { Favoritos } from "./favoritos";
import { Mensalidade } from "./mensalidade";

export interface Usuario {
  id: number;
  nome: string;
  dataNascimento: Date;
  email: string;
  senha: string;
  cpf: string;
  endereco: string;
  cartao: Cartao;
  favoritos: Favoritos;
  visualizacoes: number;
  mensalidade: Mensalidade;
}
