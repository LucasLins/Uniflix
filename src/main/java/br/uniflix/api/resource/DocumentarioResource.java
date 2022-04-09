package br.uniflix.api.resource;


import br.uniflix.api.model.Documentario;
import br.uniflix.api.service.DocumentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/documentario")
public class DocumentarioResource {

    @Autowired
    private DocumentarioService service;


    @PostMapping
    public Documentario salvar(@RequestBody Documentario documentario){
        return service.salvar(documentario);
    }

    @GetMapping
    public List<Documentario> listar(){
        return service.listar();
    }

    @GetMapping("{id}")
    public Documentario buscar(@PathVariable Integer id){
        return service.buscar(id);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable Integer id){
        service.deletar(id);
    }

    @PutMapping
    public Documentario atualizar(@RequestBody Documentario documentario) throws Exception {
        return service.atualizar(documentario);
    }

}
