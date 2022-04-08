package br.uniflix.api.service;

import br.uniflix.api.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private FilmeRepository repository;

    public void deletar(Integer id) { repository.deleteById(id);}



}
