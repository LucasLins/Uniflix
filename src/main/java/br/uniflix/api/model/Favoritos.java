package br.uniflix.api.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
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

}
