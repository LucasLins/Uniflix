package br.uniflix.api.service;


import br.uniflix.api.repository.FavoritosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoritosService {

    @Autowired
    private FavoritosRepository repository;
}
