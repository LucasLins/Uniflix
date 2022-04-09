package br.uniflix.api.service;


import br.uniflix.api.model.Favoritos;
import br.uniflix.api.repository.FavoritosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritosService {

    @Autowired
    private FavoritosRepository repository;


    public Favoritos salvar(Favoritos favoritos) {
        return repository.save(favoritos);
    }

    public void deletar(Integer id) { repository.deleteById(id);}

    public List<Favoritos> listar() {
        return repository.findAll();
    }

    public Favoritos buscar(Integer id) {
        return repository.findById(id).get();
    }

    public Favoritos atualizar(Favoritos favoritos) throws Exception {
        if(favoritos.getId() == null) {
            throw new Exception("Favorito não encontrado");
        }
        return repository.save(favoritos);
    }
}
