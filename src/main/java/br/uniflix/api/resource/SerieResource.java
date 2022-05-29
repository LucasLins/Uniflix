package br.uniflix.api.resource;

import br.uniflix.api.model.Serie;
import br.uniflix.api.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/serie")
public class SerieResource {

    @Autowired
    private SerieService service;

    @PostMapping
    public Serie salvar(@RequestBody Serie serie) {
        return service.salvar(serie);
    }

    @GetMapping
    public List<Serie> listar() {
        return service.listar();
    }

    @GetMapping("{id}")
    public Serie buscar(@PathVariable Integer id) {
        return service.buscarPorId(id);
    }

    @GetMapping("/genero/{genero}")
    public List<Serie> buscarPorGenero(@PathVariable String genero) {
        return service.listarPorGenero(genero);
    }

    @GetMapping("/nome/{nome}")
    public List<Serie> buscarPorNome(@PathVariable String nome) {
        return service.listarPorNome(nome);
    }

    @GetMapping("/ano/{ano}")
    public List<Serie> buscarPorAno(@PathVariable Integer ano) {
        return service.listarPorAno(ano);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable Integer id) {
        service.deletar(id);
    }

    @PutMapping
    public Serie atualizar(@RequestBody Serie serie) throws Exception {
        return service.atualizar(serie);
    }

}