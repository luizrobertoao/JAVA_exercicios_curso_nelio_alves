package com.estudos.entities;

import java.math.BigDecimal;

public class EmpregadoTerceirizado extends Empregado{
    private BigDecimal taxaAdicional = BigDecimal.ZERO;

    public EmpregadoTerceirizado() {
        super();
    }

    public EmpregadoTerceirizado(String nome, Integer horas, BigDecimal valorHora, BigDecimal taxaAdicional) {
        super(nome, horas, valorHora);
        this.taxaAdicional = taxaAdicional;
    }

    public BigDecimal getTaxaAdicional() {
        return taxaAdicional;
    }

    public void setTaxaAdicional(BigDecimal taxaAdicional) {
        this.taxaAdicional = taxaAdicional;
    }

    @Override
    public BigDecimal pagamento() {
        return taxaAdicional.multiply(BigDecimal.valueOf(1.1)).add(super.getValorHora().multiply(BigDecimal.valueOf(super.getHoras())));
    }
}
