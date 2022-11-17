package com.estudos.entities;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Produto {
    private String nome;
    private BigDecimal preco = BigDecimal.ZERO;

    NumberFormat nf = NumberFormat.getCurrencyInstance();

    public Produto() {
    }

    public Produto(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public void etiquetaPreco() {
        System.out.println(nome + " " + nf.format(preco));
    }
}
