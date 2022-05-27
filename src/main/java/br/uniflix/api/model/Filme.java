package br.uniflix.api.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Filme {

    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    @Size(max = 100, message = "O título não pode ter mais que 100 caracteres")
    private String titulo;

    @NotEmpty
    @Size(max = 1000, message = "A sinopse não pode ter mais que 1000 caracteres")
    private String sinopse;

    private String urlTrailer;

    @NotEmpty
    private String urlCapa;

    @Positive
    private Integer anoLancamento;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Ator> elenco;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Genero genero;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Video video;

}
