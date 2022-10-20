package com.estudos.entities;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Conta {

    private final BigDecimal taxaSaque = BigDecimal.valueOf(5.00) ;

    private Integer numeroDaConta;
    private String nomeTitularConta;
    private BigDecimal saldoConta = BigDecimal.ZERO;

    public Conta(Integer numeroDaConta, String nomeTitularConta) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitularConta = nomeTitularConta;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeTitularConta() {
        return nomeTitularConta;
    }

    public void setNomeTitularConta(String nomeTitularConta) {
        this.nomeTitularConta = nomeTitularConta;
    }

    public BigDecimal getSaldoConta() {
        return saldoConta;
    }

    public BigDecimal depositar(BigDecimal valor) {
        return this.saldoConta = saldoConta.add(valor);
    }

    public BigDecimal sacar(BigDecimal valor) {
        return this.saldoConta = saldoConta.subtract(valor.add(taxaSaque));
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return "\nDados da conta:" + "\n" +
                "Número: " + numeroDaConta +
                ", Titular: " + nomeTitularConta +
                ", Saldo: " + nf.format(saldoConta);
    }
}