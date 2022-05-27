package br.uniflix.api.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
public class Cartao {

    @Id
    @GeneratedValue
    private Integer id;

    @CreditCardNumber
    private String numero;

    @NotEmpty
    @Size(max = 50, message = "O nome do titular não pode ter mais de 50 caracteres")
    private String portador;

    @NotEmpty
    private String validade;

    @NotEmpty
    private String cvv;

}
