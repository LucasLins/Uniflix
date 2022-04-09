package br.uniflix.api.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Serie {

    @Id
    @GeneratedValue
    private Integer id;

    private String nome;
    private String sinopse;
    private Integer numeroTemporadas;
    private String urlTrailer;
    private String urlCapa;

    @OneToMany
    private List<Ator> elenco;

    @OneToMany
    private List<Episodio> episodios;

    @ManyToOne
    private Genero genero;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Integer getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(Integer numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getUrlTrailer() {
        return urlTrailer;
    }

    public void setUrlTrailer(String urlTrailer) {
        this.urlTrailer = urlTrailer;
    }

    public String getUrlCapa() {
        return urlCapa;
    }

    public void setUrlCapa(String urlCapa) {
        this.urlCapa = urlCapa;
    }

    public List<Ator> getElenco() {
        return elenco;
    }

    public void setElenco(List<Ator> elenco) {
        this.elenco = elenco;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(List<Episodio> episodios) {
        this.episodios = episodios;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
