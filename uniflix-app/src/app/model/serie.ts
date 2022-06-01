import { Ator } from "./ator";
import { Episodio } from "./episodio";
import { Genero } from "./genero";

export interface Serie {
  id: number;
  nome: string;
  numeroTemporadas: number;
  urlTrailer: string;
  urlCapa: string;
  anoLancamento: number;
  elenco: Ator[];
  genero: Genero;
  episodios: Episodio[];
}
