package br.uniflix.api.repository;

import br.uniflix.api.model.Documentario;
import br.uniflix.api.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentarioRepository extends JpaRepository<Documentario,Integer> {

    List<Documentario> findByGenero_Nome(String nome);

    List<Documentario> findByNomeContainsIgnoreCase(String nome);

    List<Documentario> findByAnoLancamento(Integer ano);

}
