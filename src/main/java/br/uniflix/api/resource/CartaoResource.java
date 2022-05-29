package br.uniflix.api.resource;

import br.uniflix.api.model.Cartao;
import br.uniflix.api.service.CartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cartao")
public class CartaoResource {

    @Autowired
    private CartaoService service;

    @PostMapping
    public Cartao salvar(@RequestBody Cartao cartao) {
        return service.salvar(cartao);
    }

    @GetMapping
    public List<Cartao> listar() {
        return service.listar();
    }

    @GetMapping("{id}")
    public Cartao buscar(@PathVariable Integer id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable Integer id) {
        service.deletar(id);
    }

    @PutMapping
    public Cartao atualizar(@RequestBody Cartao cartao) throws Exception {
        return service.atualizar(cartao);
    }
}