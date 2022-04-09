package br.uniflix.api.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Favoritos {


    @Id
    @GeneratedValue
    private Integer id;

    @OneToMany
    private List<Filme> filmes;

    @OneToMany
    private List<Documentario> documentarios;

    @OneToMany
    private List<Serie> series;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public List<Documentario> getDocumentarios() {
        return documentarios;
    }

    public void setDocumentarios(List<Documentario> documentarios) {
        this.documentarios = documentarios;
    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }
}
