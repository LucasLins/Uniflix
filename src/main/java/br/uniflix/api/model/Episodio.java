package br.uniflix.api.model;

import javax.persistence.*;

@Entity
public class Episodio {

    @Id
    @GeneratedValue
    private Integer id;
    private String nome;

    @ManyToOne
    private Serie idSerie;

    @OneToOne
    private Video video;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(Serie idSerie) {
        this.idSerie = idSerie;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
