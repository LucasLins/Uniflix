package br.uniflix.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
@Setter
@Entity
public class Video {

    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    @Max(value = 100, message = "O título não pode ter mais que 100 caracteres")
    private String titulo;

    @NotEmpty
    @Positive
    private Integer duracao;

    @NotEmpty
    private String url;

    @NotEmpty
    private String thumbnail;

}
