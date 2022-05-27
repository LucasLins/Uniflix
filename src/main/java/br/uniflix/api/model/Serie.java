package br.uniflix.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Serie {

    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    @Size(max = 100, message = "O nome da série não pode ter mais que 100 caracteres")
    private String nome;

    @NotEmpty
    @Size(max = 1000, message = "A sinopse da série não pode ter mais que 1000 caracteres")
    private String sinopse;

    @Positive
    private Integer numeroTemporadas;


    private String urlTrailer;

    @NotEmpty
    private String urlCapa;

    private Integer anoLancamento;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Ator> elenco;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Episodio> episodios;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Genero genero;

}
