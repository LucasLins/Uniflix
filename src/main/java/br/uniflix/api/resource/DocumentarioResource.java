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
    public Documentario buscar(@PathVariable Integer id){ return service.buscarPorId(id); }

    @GetMapping("/genero/{genero}")
    public List<Documentario> buscarPorGenero(@PathVariable String genero) {
        return service.listarPorGenero(genero);
    }

    @GetMapping("/nome/{nome}")
    public List<Documentario> buscarPorNome(@PathVariable String nome) {
        return service.listarPorNome(nome);
    }

    @GetMapping("/ano/{ano}")
    public List<Documentario> buscarPorAno(@PathVariable Integer ano) {
        return service.listarPorAno(ano);
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
