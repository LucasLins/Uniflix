package br.uniflix.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Mensalidade {


    @Id
    @GeneratedValue
    private Integer id;

    private Integer data_pagamento;

    private Boolean pago;

    private Integer FK_id_usuario;

    private Integer FK_plano;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(Integer data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }

    public Integer getFK_id_usuario() {
        return FK_id_usuario;
    }

    public void setFK_id_usuario(Integer FK_id_usuario) {
        this.FK_id_usuario = FK_id_usuario;
    }

    public Integer getFK_plano() {
        return FK_plano;
    }

    public void setFK_plano(Integer FK_plano) {
        this.FK_plano = FK_plano;
    }

}
