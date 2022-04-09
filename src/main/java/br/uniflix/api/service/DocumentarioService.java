package br.uniflix.api.service;


import br.uniflix.api.model.Documentario;
import br.uniflix.api.repository.DocumentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentarioService {

    @Autowired
    private DocumentarioRepository repository;

    public Documentario salvar(Documentario documentario) {
        return repository.save(documentario);
    }

    public void deletar(Integer id) { repository.deleteById(id);}

    public List<Documentario> listar() {
        return repository.findAll();
    }

    public Documentario buscar(Integer id) {
        return repository.findById(id).get();
    }

    public Documentario atualizar(Documentario documentario) throws Exception {
        if(documentario.getId() == null) {
            throw new Exception("Documentário não encontrado");
        }
        return repository.save(documentario);
    }
}
