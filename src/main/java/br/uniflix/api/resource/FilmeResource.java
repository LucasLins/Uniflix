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

    @GetMapping("/titulo")
    public Filme titulo(){
        Filme titulo = new Filme();
        titulo.setTrailer("Filme Titulo1");
        return titulo;
    }

    @GetMapping("/trailer")
    public Filme trailer(){
        Filme trailer = new Filme();
        trailer.setTrailer("Filme Trailer1");
        return trailer;
    }

    @GetMapping("/sinopse")
    public Filme sinopse(){
        Filme sinopse = new Filme();
        sinopse.setSinopse("Filme Sinopse1");
        return sinopse;
    }

    @PostMapping("/salvar-titulo")
    public String salvarTitulo(){ return "Salvou o titulo do Filme";}

    @PostMapping("/salvar-trailer")
    public String salvar(){ return "Salvou o trailer";}

    @PostMapping("/salvar-sinopse")
    public String salvarSinopse(){ return "Salvou a sinopse";}

    @PostMapping
    public Filme salvarTitulo(@RequestBody Filme titulo){
        titulo =  service.salvarTitulo(titulo);
        return titulo;
    }
    @PostMapping
    public Filme salvar(@RequestBody Filme trailer){
        trailer = service.salvar(trailer);
        return trailer;
    }

    @PostMapping
    public Filme salvarSinopse(@RequestBody Filme sinopse){
        sinopse = service.salvar(sinopse);
        return sinopse;
    }



    @DeleteMapping("{id}")
    public void remover(@PathVariable int id){service.deletar(id);}

    @PutMapping
    public Filme atualizar(@RequestBody Filme trailer) throws Exception{
        return service.atualizar(trailer);
    }

    @PutMapping
    public Filme atualizarSinopse(@RequestBody Filme sinopese) throws  Exception{
        return service.atualizarSinopse(sinopese);
    }

    @PutMapping
    public Filme atualizarTitulo(@RequestBody Filme titulo) throws Exception{
        return service.atualizarTitulo(titulo);
    }






}
