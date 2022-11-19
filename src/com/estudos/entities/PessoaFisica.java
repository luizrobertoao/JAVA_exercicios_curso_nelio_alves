package com.estudos.entities;

import java.math.BigDecimal;

public class PessoaFisica extends Pessoa {

    private BigDecimal gastosSaude = BigDecimal.ZERO;


    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, BigDecimal rendaAnual, BigDecimal gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public BigDecimal getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(BigDecimal gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public BigDecimal calcularImposto() {

        BigDecimal valorImposto = BigDecimal.ZERO;

        if (getRendaAnual().intValue() < 20000) {

            valorImposto = getRendaAnual().multiply(BigDecimal.valueOf(0.15));

        } else {

            valorImposto = getRendaAnual().multiply(BigDecimal.valueOf(0.25));

        }

        valorImposto = valorImposto.subtract(getGastosSaude().multiply(BigDecimal.valueOf(0.50)));

        if (valorImposto.intValue() < 0) {

            valorImposto = BigDecimal.ZERO;
        }

        return valorImposto;

    }
}
