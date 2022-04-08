package br.uniflix.api.service;

import br.uniflix.api.model.Video;
import br.uniflix.api.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {

    @Autowired
    private VideoRepository repository;

    public Video salvar(Video video) {
        return repository.save(video);
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

    public List<Video> listar() {
        return repository.findAll();
    }

    public Video buscarPorId(Integer id) {
        return repository.findById(id).get();
    }

    public Video atualizar(Video video) throws Exception {
        if (video.getId() == null) {
            throw new Exception("Video não encontrado");
        }
        return repository.save(video);
    }
}
