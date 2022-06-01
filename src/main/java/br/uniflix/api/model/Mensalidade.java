package br.uniflix.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Mensalidade {


    @Id
    @GeneratedValue
    private Integer id;

    @Temporal(TemporalType.DATE)
    private Date dataPagamento;

    private Boolean pago;

    @OneToOne(cascade = CascadeType.MERGE)
    private Plano plano;

}
