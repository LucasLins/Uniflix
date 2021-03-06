package br.uniflix.api.resource;


import br.uniflix.api.model.Filme;
import br.uniflix.api.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/filme")
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

    @GetMapping("/genero/{genero}")
    public List<Filme> buscarPorGenero(@PathVariable String genero) {
        return service.listarPorGenero(genero);
    }

    @GetMapping("/nome/{titulo}")
    public List<Filme> buscarPorTitulo(@PathVariable String titulo) {
        return service.listarPorNome(titulo);
    }

    @GetMapping("/ano/{ano}")
    public List<Filme> buscarPorAno(@PathVariable Integer ano) {
        return service.listarPorAno(ano);
    }

}
