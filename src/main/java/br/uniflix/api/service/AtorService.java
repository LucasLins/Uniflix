package br.uniflix.api.service;

import br.uniflix.api.repository.AtorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtorService {

    @Autowired
    private AtorRepository repository;

    public void deletar(Integer id) { repository.deleteById(id);}
}
