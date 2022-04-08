package br.uniflix.api.repository;

import br.uniflix.api.model.Documentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentarioRepository extends JpaRepository<Documentario,Integer> {
}
