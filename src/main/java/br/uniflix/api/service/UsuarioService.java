package br.uniflix.api.service;

import br.uniflix.api.model.Usuario;
import br.uniflix.api.repository.FilmeRepository;
import br.uniflix.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;


    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }

    public void deletar(Integer id) { repository.deleteById(id);}

    public List<Usuario> listar() {
        return repository.findAll();
    }

    public Usuario buscar(Integer id) {
        return repository.findById(id).get();
    }

    public Usuario atualizar(Usuario usuario) throws Exception {
        if(usuario.getId() == null) {
            throw new Exception("Usuário não encontrado");
        }
        return repository.save(usuario);
    }

}
