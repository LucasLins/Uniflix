package br.uniflix.api.resource;

import br.uniflix.api.model.Video;
import br.uniflix.api.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/video")
public class VideoResource {

    @Autowired
    private VideoService service;

    @PostMapping
    public Video salvar(@RequestBody Video video) {
        return service.salvar(video);
    }

    @GetMapping
    public List<Video> listar() {
        return service.listar();
    }

    @GetMapping("{id}")
    public Video buscar(@PathVariable Integer id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable Integer id) {
        service.deletar(id);
    }

    @PutMapping
    public Video atualizar(@RequestBody Video video) throws Exception {
        return service.atualizar(video);
    }

}
