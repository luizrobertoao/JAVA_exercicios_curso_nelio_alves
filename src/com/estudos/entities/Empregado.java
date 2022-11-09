package com.estudos.entities;

import java.math.BigDecimal;

public class Empregado {
    private String nome;
    private Integer horas;
    private BigDecimal valorHora = BigDecimal.ZERO;

    public Empregado() {
    }

    public Empregado(String nome, Integer horas, BigDecimal valorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public BigDecimal getValorHora() {
        return valorHora;
    }

    public void setValorHora(BigDecimal valorHora) {
        this.valorHora = valorHora;
    }

    public BigDecimal pagamento() {
        return valorHora.multiply(BigDecimal.valueOf(horas));
    }
}
