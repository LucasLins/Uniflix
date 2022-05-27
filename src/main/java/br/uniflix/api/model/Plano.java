package br.uniflix.api.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Currency;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Getter
@Setter
@Entity
public class Plano {


    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    @Size(max = 50, message = "O nome deve ter no máximo 50 caracteres")
    private String nome;

    @Positive
    private Float valor;

    @NotEmpty
    @Size(max = 100, message = "A descrição deve ter no máximo 100 caracteres")
    private String descricao;

    private Integer maxVideos;

}
