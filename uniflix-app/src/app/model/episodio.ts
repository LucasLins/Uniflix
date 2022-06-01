import { Serie } from './serie';
import { Video } from './video';
export interface Episodio {
  id: number;
  numeroTemporada: number;
  nome: string;
  idSerie: Serie;
  video: Video;
}
