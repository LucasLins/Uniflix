package br.uniflix.api.service;


import br.uniflix.api.model.Documentario;
import br.uniflix.api.repository.DocumentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentarioService {

    @Autowired
    private DocumentarioRepository repository;

    public Documentario salvarTitulo(Documentario titulo) { return repository.save(titulo);}

    public Documentario salvarTrailer(Documentario trailer) {return repository.save(trailer);}

    public Documentario salvarProdutora(Documentario produtora) { return repository.save(produtora);}

    public void deletar(Integer id) { repository.deleteById(id);}
}
