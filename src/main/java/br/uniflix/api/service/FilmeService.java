package br.uniflix.api.service;

import br.uniflix.api.model.Filme;
import br.uniflix.api.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmeService {


    @Autowired
    private FilmeRepository repository;

    public Filme salvar(Filme trailer) {
        return repository.save(trailer);
    }

    public Filme salvarTitulo(Filme titulo) { return repository.save(titulo);}

    public Filme atualizar(Filme trailer) throws Exception {
        if(trailer.getId()==null){
            throw new Exception(("Id não encontrado"));
        }
        return repository.save(trailer);
    }

    public Filme atualizarSinopse(Filme sinopese) {
        return repository.save(sinopese);
    }

    public Filme atualizarTitulo(Filme titulo) {
        return repository.save(titulo);
    }

    public void deletar(Integer id) { repository.deleteById(id);}



}
