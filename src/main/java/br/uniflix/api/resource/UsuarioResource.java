package br.uniflix.api.resource;


import br.uniflix.api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioResource {

    @Autowired
    private UsuarioService service;


    @DeleteMapping("{id}")
    public void remover(@PathVariable int id){service.deletar(id);}

}
