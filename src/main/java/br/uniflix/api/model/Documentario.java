package br.uniflix.api.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class Documentario {

    @Id
    @GeneratedValue
    private Integer id;

    private String titulo;

    private String urlTrailer;

    private String urlCapa;

    private Integer anoLancamento;

    @OneToMany
    private List<Ator> elenco;

    @ManyToOne
    private Genero genero;

    @OneToOne
    private Video video;

    private String produtora;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public Integer getAnoLancamento() { return anoLancamento; }

    public void setAnoLancamento(Integer anoLancamento) { this.anoLancamento = anoLancamento; }

}
