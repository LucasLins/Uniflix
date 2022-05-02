package br.uniflix.api.resource;


import br.uniflix.api.model.Filme;
import br.uniflix.api.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmeResource {

    @Autowired
    private FilmeService service;

    @PostMapping
    public Filme salvar(@RequestBody Filme filme){
        return service.salvar(filme);
    }

    @GetMapping
    public List<Filme> listar(){
        return service.listar();
    }

    @GetMapping("{id}")
    public Filme buscar(@PathVariable Integer id){
        return service.buscar(id);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable Integer id){
        service.deletar(id);
    }

    @PutMapping
    public Filme atualizar(@RequestBody Filme filme) throws Exception {
        return service.atualizar(filme);
    }

}
