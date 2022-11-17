package com.estudos.entities;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class ProdutoImportado extends Produto {
    private BigDecimal taxaAlfandega = BigDecimal.ZERO;

    NumberFormat nf = NumberFormat.getCurrencyInstance();

    public ProdutoImportado() {
        super();
    }

    public ProdutoImportado(String nome, BigDecimal preco, BigDecimal taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    public BigDecimal getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(BigDecimal taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }

    @Override
    public void etiquetaPreco() {
        System.out.println(super.getNome() + " " + nf.format(super.getPreco()) + " (Taxa alfandegaria: " + nf.format(taxaAlfandega) + ")");
    }
}
