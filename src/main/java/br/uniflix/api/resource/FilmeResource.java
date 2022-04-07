package br.uniflix.api.resource;


import br.uniflix.api.model.Filme;
import br.uniflix.api.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trailer")
public class FilmeResource {

    @Autowired
    private FilmeService service;

    @GetMapping("/trailer")
    public Filme trailer(){
        Filme trailer = new Filme();
        trailer.setTrailer("Trailer1");
        return trailer;
    }

    @PostMapping("/salvar_trailer")
    public String salvar(){ return "Salvou o trailer";}

    @PostMapping
    public Filme salvar(@RequestBody Filme trailer){
        trailer = service.salvar(trailer);
        return trailer;
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id){service.deletar(id);}

    @PutMapping
    public Filme atualizar(@RequestBody Filme trailer) throws Exception{
        return service.atualizar(trailer);
    }




}
