package br.uniflix.api.service;

import br.uniflix.api.repository.MensalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensalidadeService {

    @Autowired
    private MensalidadeRepository repository;

    public void deletar(Integer id) { repository.deleteById(id);}
}
