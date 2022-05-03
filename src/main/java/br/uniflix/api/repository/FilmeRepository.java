package br.uniflix.api.repository;

import br.uniflix.api.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Integer> {
    List<Filme> findByGenero_Nome(String nome);

    List<Filme> findByTituloContainsIgnoreCase(String titulo);

    List<Filme> findByAnoLancamento(Integer ano);
}
