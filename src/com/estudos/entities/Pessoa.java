package com.estudos.entities;

import java.math.BigDecimal;

public abstract class Pessoa {
    private String nome;
    private BigDecimal rendaAnual = BigDecimal.ZERO;

    public Pessoa() {
    }

    public Pessoa(String nome, BigDecimal rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(BigDecimal rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public abstract BigDecimal calcularImposto();
}
