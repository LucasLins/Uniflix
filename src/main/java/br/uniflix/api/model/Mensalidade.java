package br.uniflix.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@Entity
public class Mensalidade {


    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;

    @NotNull
    private Boolean pago;

    @NotNull
    @OneToOne
    private Usuario usuario;

    @NotNull
    @OneToOne
    private Plano plano;

}
