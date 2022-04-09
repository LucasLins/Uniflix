package br.uniflix.api.service;

import br.uniflix.api.model.Ator;
import br.uniflix.api.repository.AtorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtorService {

    @Autowired
    private AtorRepository repository;

    public Ator salvar(Ator ator) {
        return repository.save(ator);
    }

    public void deletar(Integer id) { repository.deleteById(id);}

    public List<Ator> listar() {
        return repository.findAll();
    }

    public Ator buscar(Integer id) {
        return repository.findById(id).get();
    }

    public Ator atualizar(Ator ator) throws Exception {
        if(ator.getId() == null) {
            throw new Exception("Ator não encontrado");
        }
        return repository.save(ator);
    }
}
