package br.uniflix.api.service;

import br.uniflix.api.model.Genero;
import br.uniflix.api.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepository repository;

    public Genero salvar(Genero genero) {
        return repository.save(genero);
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

    public List<Genero> listar() {
        return repository.findAll();
    }

    public Genero buscarPorId(Integer id) {
        return repository.findById(id).get();
    }

    public Genero atualizar(Genero genero) throws Exception {
        if(genero.getId() == null) {
            throw new Exception("Genero não encontrado");
        }
        return repository.save(genero);
    }
}
