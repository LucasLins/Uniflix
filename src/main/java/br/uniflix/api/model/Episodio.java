package br.uniflix.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
@Setter
@Entity
public class Episodio {

    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    @Positive
    private Integer numero;

    @NotEmpty
    @Max(value = 100, message = "O nome não pode ter mais que 100 caracteres")
    private String nome;

    @NotNull
    @ManyToOne
    private Serie idSerie;

    @NotNull
    @OneToOne
    private Video video;

}
