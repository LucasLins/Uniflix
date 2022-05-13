package br.uniflix.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class Genero {

    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    @Max(value = 50, message = "O nome do gênero não pode ter mais que 50 caracteres")
    private String nome;

    @NotEmpty
    @Max(value = 200, message = "A descrição do gênero não pode ter mais que 200 caracteres")
    private String descricao;

}
