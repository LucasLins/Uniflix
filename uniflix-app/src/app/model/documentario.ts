import { Ator } from "./ator";
import { Genero } from "./genero";
import { Video } from "./video";

export interface Documentario {
  id: number;
  titulo: string;
  sinopse: string;
  urlTrailer: string;
  urlCapa: string;
  anoLancamento: number;
  elenco: Ator[];
  genero: Genero;
  produtora: string;
  video: Video;
}
