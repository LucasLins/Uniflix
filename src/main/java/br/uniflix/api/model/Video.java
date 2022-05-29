package br.uniflix.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Getter
@Setter
@Entity
public class    Video {

    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    @Size(max = 100, message = "O título não pode ter mais que 100 caracteres")
    private String titulo;

    @Positive
    private Integer duracao;

    @NotEmpty
    private String url;

    @NotEmpty
    private String thumbnail;

}
