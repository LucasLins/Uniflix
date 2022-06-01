package br.uniflix.api.service;

import br.uniflix.api.model.Usuario;
import br.uniflix.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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

    public Usuario buscarPorEmailESenha(String email, String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
        byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));

        StringBuilder hexString = new StringBuilder();
        for (byte b : messageDigest) {
            hexString.append(String.format("%02X", 0xFF & b));
        }
        String senhahex = hexString.toString();
        return repository.findByEmailAndSenha(email, senhahex);
    }

    public Usuario atualizar(Usuario usuario) throws Exception {
        if(usuario.getId() == null) {
            throw new Exception("Usuário não encontrado");
        }
        return repository.save(usuario);
    }

}
