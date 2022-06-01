package br.uniflix.api.service;

import br.uniflix.api.model.Episodio;
import br.uniflix.api.repository.EpisodioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EpisodioService {

    @Autowired
    private EpisodioRepository repository;

    public Episodio salvar(Episodio episodio) {
        return repository.save(episodio);
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

    public List<Episodio> listar() {
        return repository.findAll();
    }

    public Episodio buscarPorId(Integer id) {
        return repository.findById(id).get();
    }

    public Episodio atualizar(Episodio episodio) throws Exception {
        if(episodio.getId() == null) {
            throw new Exception("Episodio não existe");
        }
        return repository.save(episodio);
    }

}
