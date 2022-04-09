package br.uniflix.api.resource;


import br.uniflix.api.model.Usuario;
import br.uniflix.api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioResource {

    @Autowired
    private UsuarioService service;


    @PostMapping
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

    @DeleteMapping("{id}")
    public void remover(@PathVariable Integer id){
        service.deletar(id);
    }

    @PutMapping
    public Usuario atualizar(@RequestBody Usuario usuario) throws Exception {
        return service.atualizar(usuario);
    }

}