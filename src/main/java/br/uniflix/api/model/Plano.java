package br.uniflix.api.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Currency;

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
public class Plano {


    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    @Max(value = 50, message = "O nome deve ter no máximo 50 caracteres")
    private String nome;

    @NotNull
    @Positive
    private Float valor;

    @NotEmpty
    @Max(value = 100, message = "A descrição deve ter no máximo 100 caracteres")
    private String descricao;

    @NotEmpty
    private Integer maxVideos;

}
