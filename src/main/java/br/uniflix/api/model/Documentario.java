package br.uniflix.api.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Documentario {

    @Id
    @GeneratedValue
    private Integer id;

    private String titulo;

    private String trailer;

    private String produtora;

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public String getTrailer() {return trailer;}

    public void setTrailer(String trailer) {this.trailer = trailer;}

    public String getProdutora() {return produtora;}

    public void setProdutora(String produtora) {this.produtora = produtora;}
}
