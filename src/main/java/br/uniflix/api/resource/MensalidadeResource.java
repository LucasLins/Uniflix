package br.uniflix.api.resource;

import br.uniflix.api.model.Mensalidade;
import br.uniflix.api.service.MensalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mensalidade")
public class MensalidadeResource {

    @Autowired
    private MensalidadeService service;


    @PostMapping
    public Mensalidade salvar(@RequestBody Mensalidade mensalidade){
        return service.salvar(mensalidade);
    }

    @GetMapping
    public List<Mensalidade> listar(){
        return service.listar();
    }

    @GetMapping("{id}")
    public Mensalidade buscar(@PathVariable Integer id){
        return service.buscar(id);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable Integer id){
        service.deletar(id);
    }

    @PutMapping
    public Mensalidade atualizar(@RequestBody Mensalidade mensalidade) throws Exception {
        return service.atualizar(mensalidade);
    }
}
