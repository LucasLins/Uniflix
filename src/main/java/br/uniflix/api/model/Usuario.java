package br.uniflix.api.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    @Max(value = 50, message = "O nome não pode ter mais que 50 caracteres")
    private String nome;

    @NotEmpty
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    @Email
    private String email;

    @NotEmpty
    @Max(value = 50, message = "A senha não pode ter mais que 50 caracteres")
    private String senha;

    @CPF
    private String cpf;

    @NotEmpty
    private String endereco;

    @NotNull
    @OneToOne
    private Cartao cartao;

    @OneToOne
    private Favoritos favoritos;

    private Integer visualizacoes;

}
