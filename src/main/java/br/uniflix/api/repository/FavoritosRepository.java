package br.uniflix.api.repository;

import br.uniflix.api.model.Favoritos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoritosRepository extends JpaRepository<Favoritos, Integer> {
}
