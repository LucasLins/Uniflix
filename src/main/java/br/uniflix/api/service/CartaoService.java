package br.uniflix.api.service;

import br.uniflix.api.model.Cartao;
import br.uniflix.api.repository.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartaoService {

    @Autowired
    private CartaoRepository repository;

    public Cartao salvar(Cartao cartao) {
        return repository.save(cartao);
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

    public List<Cartao> listar() {
        return repository.findAll();
    }

    public Cartao buscarPorId(Integer id) {
        return repository.findById(id).get();
    }

    public Cartao atualizar(Cartao cartao) throws Exception {
        if(cartao.getId() == null) {
            throw new Exception("Cartão não encontrado");
        }
        return repository.save(cartao);
    }
}
