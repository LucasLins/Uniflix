package br.uniflix.api.service;

import br.uniflix.api.model.Serie;
import br.uniflix.api.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieService {

    @Autowired
    private SerieRepository repository;

    public Serie salvar(Serie serie) {
        return repository.save(serie);
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

    public List<Serie> listar() {
        return repository.findAll();
    }

    public Serie buscarPorId(Integer id) {
        return repository.findById(id).get();
    }

    public List<Serie> listarPorGenero(String genero) {
        return repository.findByGenero_Nome(genero);
    }

    public List<Serie> listarPorNome(String nome) {
        return repository.findByNomeContainsIgnoreCase(nome);
    }

    public List<Serie> listarPorAno(Integer ano) {
        return repository.findByAnoLancamento(ano);
    }

    public Serie atualizar(Serie serie) throws Exception {
        if (serie.getId() == null) {
            throw new Exception("Não é possível encontrar a série");
        }
        return repository.save(serie);
    }

}
