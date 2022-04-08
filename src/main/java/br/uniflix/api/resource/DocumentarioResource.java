package br.uniflix.api.resource;


import br.uniflix.api.model.Documentario;
import br.uniflix.api.service.DocumentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/documentario")
public class DocumentarioResource {

    @Autowired
    private DocumentarioService service;

    @GetMapping("/titulo")
    public Documentario titulo(){
        Documentario titulo = new Documentario();
        titulo.setTitulo("Documentario titulo1");
        return titulo;
    }

    @GetMapping("/trailer-documentario")
    public  Documentario trailer(){
        Documentario trailer = new Documentario();
        trailer.setTrailer("Trailer documentario1");
        return trailer;
    }

    @GetMapping("/produtora")
    public Documentario produtora(){
        Documentario produtora = new Documentario();
        produtora.setProdutora("Produtora1");
        return produtora;
    }

    @PostMapping("/salvar")
    public String salvar(){return "Salvou o titulo do documentario";}

    @PostMapping("/salvar-produtora")
    public String salvarProdutora(){return "Salvou a produtora documentario";}

    @PostMapping
    public Documentario salvarTitulo(@RequestBody Documentario titulo){
        titulo = service.salvarTitulo(titulo);
        return titulo;
    }

    @PostMapping
    public Documentario salvarTrailer(@RequestBody Documentario trailer){
        trailer = service.salvarTrailer(trailer);
        return trailer;
    }

    @PostMapping
    public Documentario salvarProdutora(@RequestBody Documentario produtora){
        produtora = service.salvarProdutora(produtora);
        return produtora;
    }

}
