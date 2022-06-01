package br.uniflix.api.service;

import br.uniflix.api.model.Plano;
import br.uniflix.api.repository.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanoService {

    @Autowired
    private PlanoRepository repository;

    public Plano salvar(Plano plano) {
        return repository.save(plano);
    }

    public void deletar(Integer id) { repository.deleteById(id);}

    public List<Plano> listar() {
        return repository.findAll();
    }

    public Plano buscar(Integer id) {
        return repository.findById(id).get();
    }

    public Plano atualizar(Plano plano) throws Exception {
        if(plano.getId() == null) {
            throw new Exception("Plano não encontrado");
        }
        return repository.save(plano);
    }
}
