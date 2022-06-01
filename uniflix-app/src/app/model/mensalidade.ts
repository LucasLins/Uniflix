import { Plano } from './plano';
export interface Mensalidade {
  id: number;
  dataPagamento: Date;
  pago: boolean;
  plano: Plano;
}
