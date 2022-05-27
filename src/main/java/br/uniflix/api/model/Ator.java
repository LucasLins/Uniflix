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
import javax.validation.constraints.Size;
import java.text.SimpleDateFormat;
import java.util.Date;

@Getter
@Setter
@Entity
public class Ator {

    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    @Size(max = 50, message = "O nome não pode ter mais de 50 caracteres")
    private String nome;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;

    @Size(max = 50, message = "Nacionalidade não pode ter mais de 50 caracteres")
    private String nacionalidade;

}
