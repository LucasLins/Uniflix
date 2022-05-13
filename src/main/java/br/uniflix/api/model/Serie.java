package br.uniflix.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.List;

@Getter
@Setter
@Entity
public class Serie {

    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    @Max(value = 100, message = "O nome da série não pode ter mais que 100 caracteres")
    private String nome;

    @NotEmpty
    @Max(value = 1000, message = "A sinopse da série não pode ter mais que 1000 caracteres")
    private String sinopse;

    @NotEmpty
    @Positive
    private Integer numeroTemporadas;


    private String urlTrailer;

    @NotEmpty
    private String urlCapa;
    private Integer anoLancamento;

    @OneToMany
    private List<Ator> elenco;

    @OneToMany
    private List<Episodio> episodios;

    @NotNull
    @ManyToOne
    private Genero genero;

}
