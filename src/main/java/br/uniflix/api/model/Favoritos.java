package br.uniflix.api.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Favoritos {


    @Id
    @GeneratedValue
    private Integer id;
    private List<Integer> listaFavoritosId = new ArrayList<>();

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public List<Integer> getListaFavoritosId() {return listaFavoritosId;}

    public void setListaFavoritosId(List<Integer> listaFavoritosId) {this.listaFavoritosId = listaFavoritosId;}
}
