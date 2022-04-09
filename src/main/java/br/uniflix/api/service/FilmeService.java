package br.uniflix.api.service;

import br.uniflix.api.model.Filme;
import br.uniflix.api.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {


    @Autowired
    private FilmeRepository repository;

    public Filme salvar(Filme filme) {
        return repository.save(filme);
    }

    public void deletar(Integer id) { repository.deleteById(id);}

    public List<Filme> listar() {
        return repository.findAll();
    }

    public Filme buscar(Integer id) {
        return repository.findById(id).get();
    }

    public Filme atualizar(Filme filme) throws Exception {
        if(filme.getId() == null) {
            throw new Exception("Filme não encontrado");
        }
        return repository.save(filme);
    }

}
