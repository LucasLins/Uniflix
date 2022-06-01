import { Documentario } from "./documentario";
import { Filme } from "./filme";
import { Serie } from "./serie";

export interface Favoritos {
  id: number;
  filmes: Filme[];
  documentarios: Documentario[];
  series: Serie[];
}
