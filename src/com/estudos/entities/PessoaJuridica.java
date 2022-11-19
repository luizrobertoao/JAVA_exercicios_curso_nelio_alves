package com.estudos.entities;

import java.math.BigDecimal;

public class PessoaJuridica extends Pessoa {

    private Integer numeroFuncionarios;


    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, BigDecimal rendaAnual, Integer numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public BigDecimal calcularImposto() {

        BigDecimal valorImposto = BigDecimal.ZERO;

        if (numeroFuncionarios > 10) {
            valorImposto = getRendaAnual().multiply(BigDecimal.valueOf(0.14));
        } else {
            valorImposto = getRendaAnual().multiply(BigDecimal.valueOf(0.16));
        }
        return valorImposto;
    }
}
