package br.uniflix.api.service;

import br.uniflix.api.model.Mensalidade;
import br.uniflix.api.repository.MensalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensalidadeService {

    @Autowired
    private MensalidadeRepository repository;

    public Mensalidade salvar(Mensalidade mensalidade) {
        return repository.save(mensalidade);
    }

    public void deletar(Integer id) { repository.deleteById(id);}

    public List<Mensalidade> listar() {
        return repository.findAll();
    }

    public Mensalidade buscar(Integer id) {
        return repository.findById(id).get();
    }

    public Mensalidade atualizar(Mensalidade mensalidade) throws Exception {
        if(mensalidade.getId() == null) {
            throw new Exception("Mensalidade não encontrado");
        }
        return repository.save(mensalidade);
    }
}
