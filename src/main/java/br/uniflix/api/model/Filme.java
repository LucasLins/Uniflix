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
public class Filme {

    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    @Max(value = 100, message = "O título não pode ter mais que 100 caracteres")
    private String titulo;

    @NotEmpty
    @Max(value = 1000, message = "A sinopse não pode ter mais que 1000 caracteres")
    private String sinopse;

    private String urlTrailer;

    @NotEmpty
    private String urlCapa;

    @NotEmpty
    @Positive
    private Integer anoLancamento;

    @OneToMany
    private List<Ator> elenco;

    @NotNull
    @ManyToOne
    private Genero genero;

    @NotNull
    @OneToOne
    private Video video;

}
