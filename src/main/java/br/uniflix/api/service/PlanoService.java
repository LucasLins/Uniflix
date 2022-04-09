package br.uniflix.api.service;

import br.uniflix.api.repository.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanoService {

    @Autowired
    private PlanoRepository repository;

    public void deletar(Integer id) { repository.deleteById(id);}
}
