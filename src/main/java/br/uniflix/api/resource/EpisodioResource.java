package br.uniflix.api.resource;

import br.uniflix.api.model.Episodio;
import br.uniflix.api.service.EpisodioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/episodio")
public class EpisodioResource {

    @Autowired
    private EpisodioService service;

    @PostMapping
    public Episodio salvar(@RequestBody Episodio episodio) {
        return service.salvar(episodio);
    }

    @GetMapping
    public List<Episodio> listar() {
        return service.listar();
    }

    @GetMapping("{id}")
    public Episodio buscar(@PathVariable Integer id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable Integer id) {
        service.deletar(id);
    }

    @PutMapping
    public Episodio atualizar(@RequestBody Episodio episodio) throws Exception {
        return service.atualizar(episodio);
    }

}