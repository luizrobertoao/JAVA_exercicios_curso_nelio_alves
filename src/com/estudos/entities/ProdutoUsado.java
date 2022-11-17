package com.estudos.entities;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class ProdutoUsado extends Produto {
    private LocalDate dataFabricacao;

    NumberFormat nf = NumberFormat.getCurrencyInstance();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public ProdutoUsado() {
        super();
    }

    public ProdutoUsado(String nome, BigDecimal preco, LocalDate dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public void etiquetaPreco() {
        System.out.println(super.getNome() + " " + nf.format(super.getPreco()) + " (Data de fabricacao: " + dataFabricacao.format(formatter) + ")");
    }
}
