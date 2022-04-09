package br.uniflix.api.resource;

import br.uniflix.api.service.MensalidadeService;
import br.uniflix.api.service.PlanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensalidadeResource {

    @Autowired
    private MensalidadeService service;


    @DeleteMapping("{id}")
    public void remover(@PathVariable int id){service.deletar(id);}
}
