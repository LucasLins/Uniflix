package br.uniflix.api.repository;

import br.uniflix.api.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Integer> {

    List<Serie> findByGenero_Nome(String nome);

    List<Serie> findByNomeContainsIgnoreCase(String nome);

    List<Serie> findByAnoLancamento(Integer ano);

}
