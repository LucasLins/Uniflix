package br.uniflix.api.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Filme {

    @Id
    @GeneratedValue
    private Integer id;

    private String sinopse;

    private String trailer;

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getSinopse() {return sinopse;}

    public void setSinopse(String sinopse) {this.sinopse = sinopse;}

    public String getTrailer() {return trailer;}

    public void setTrailer(String trailer) {this.trailer = trailer;}
}
