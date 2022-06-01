import { Genero } from './genero';
import { Ator } from './ator';
import { Video } from './video';
export interface Filme {
  id: number;
  titulo: string;
  sinopse: string;
  urlTrailer: string;
  urlCapa: string;
  anoLancamento: number;
  elenco: Ator[];
  genero: Genero;
  video: Video;
}
