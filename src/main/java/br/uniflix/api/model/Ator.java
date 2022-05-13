package br.uniflix.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@Entity
public class Ator {

    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    @Max(value = 50, message = "O nome não pode ter mais que 50 caracteres")
    private String nome;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;

    @Max(value = 50, message = "Nacionalidade não pode ter mais que 50 caracteres")
    private String nacionalidade;

}
