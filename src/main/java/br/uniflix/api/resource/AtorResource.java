package br.uniflix.api.resource;

import br.uniflix.api.model.Ator;
import br.uniflix.api.service.AtorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ator")
public class AtorResource {

    @Autowired
    private AtorService service;


    @PostMapping
    public Ator salvar(@RequestBody Ator ator){
        return service.salvar(ator);
    }

    @GetMapping
    public List<Ator> listar(){
        return service.listar();
    }

    @GetMapping("{id}")
    public Ator buscar(@PathVariable Integer id){
        return service.buscar(id);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable Integer id){
        service.deletar(id);
    }

    @PutMapping
    public Ator atualizar(@RequestBody Ator ator) throws Exception {
        return service.atualizar(ator);
    }

}
