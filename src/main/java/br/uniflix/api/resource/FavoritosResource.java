package br.uniflix.api.resource;


import br.uniflix.api.model.Favoritos;
import br.uniflix.api.service.FavoritosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favoritos")
public class FavoritosResource {

    @Autowired
    private FavoritosService service;


    @PostMapping
    public Favoritos salvar(@RequestBody Favoritos favoritos){
        return service.salvar(favoritos);
    }

    @GetMapping
    public List<Favoritos> listar(){
        return service.listar();
    }

    @GetMapping("{id}")
    public Favoritos buscar(@PathVariable Integer id){
        return service.buscar(id);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable Integer id){
        service.deletar(id);
    }

    @PutMapping
    public Favoritos atualizar(@RequestBody Favoritos favoritos) throws Exception {
        return service.atualizar(favoritos);
    }
}
