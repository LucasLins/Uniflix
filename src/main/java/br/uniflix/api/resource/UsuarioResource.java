package br.uniflix.api.resource;


import br.uniflix.api.model.Usuario;
import br.uniflix.api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/usuario")
public class UsuarioResource {

    @Autowired
    private UsuarioService service;


    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Usuario salvar(@RequestBody Usuario usuario){
        return service.salvar(usuario);
    }

    @GetMapping
    public List<Usuario> listar(){
        return service.listar();
    }

    @GetMapping("{id}")
    public Usuario buscar(@PathVariable Integer id){
        return service.buscar(id);
    }

    @GetMapping("/autenticar/{email}/{senha}")
    public Usuario buscarPorEmailESenha(@PathVariable String email, @PathVariable String senha) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        return service.buscarPorEmailESenha(email, senha);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable Integer id){
        service.deletar(id);
    }

    @PutMapping
    public Usuario atualizar(@RequestBody Usuario usuario) throws Exception {
        return service.atualizar(usuario);
    }

}