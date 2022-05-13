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
public class Documentario {

    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    @Max(value = 100, message = "O título não pode ter mais de 100 caracteres")
    private String titulo;

    private String urlTrailer;

    @NotEmpty
    private String urlCapa;

    @NotNull
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

    @NotEmpty
    @Max(value = 100, message = "A produtora não pode ter mais de 100 caracteres")
    private String produtora;

}
