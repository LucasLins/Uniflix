package br.uniflix.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;

@Getter
@Setter
@Entity
public class Episodio {

    @Id
    @GeneratedValue
    private Integer id;

    @Positive
    private Integer numeroTemporada;

    @NotEmpty
    @Size(max = 100, message = "O nome não pode ter mais que 100 caracteres")
    private String nome;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Video video;

}
