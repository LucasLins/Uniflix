package br.uniflix.api.resource;

import br.uniflix.api.model.Plano;
import br.uniflix.api.service.PlanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plano")
public class PlanoResource {

    @Autowired
    private PlanoService service;


    @PostMapping
    public Plano salvar(@RequestBody Plano plano){
        return service.salvar(plano);
    }

    @GetMapping
    public List<Plano> listar(){
        return service.listar();
    }

    @GetMapping("{id}")
    public Plano buscar(@PathVariable Integer id){
        return service.buscar(id);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable Integer id){
        service.deletar(id);
    }

    @PutMapping
    public Plano atualizar(@RequestBody Plano plano) throws Exception {
        return service.atualizar(plano);
    }

}
