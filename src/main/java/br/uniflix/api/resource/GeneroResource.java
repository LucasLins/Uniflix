package br.uniflix.api.resource;

import br.uniflix.api.model.Genero;
import br.uniflix.api.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genero")
public class GeneroResource {

    @Autowired
    private GeneroService service;

    @PostMapping
    public Genero salvar(@RequestBody Genero genero) {
        return service.salvar(genero);
    }

    @GetMapping
    public List<Genero> listar() {
        return service.listar();
    }

    @GetMapping("{id}")
    public Genero buscarPorId(@PathVariable Integer id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable Integer id) {
        service.deletar(id);
    }

    @PutMapping
    public Genero atualizar(@RequestBody Genero genero) throws Exception {
        return service.atualizar(genero);
    }

}
