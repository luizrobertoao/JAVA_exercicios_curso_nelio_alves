package com.estudos.entities;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Funcionario {
    private String nome;
    private Integer id;
    private BigDecimal salario;

    public Funcionario() {
    }

    public Funcionario(String nome, Integer id, BigDecimal salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public BigDecimal getSalario() {
        return salario;
    }


    public void aumentarSalario(Double aumento, Funcionario funcionario) {

        BigDecimal salarioCorrigido = BigDecimal.ZERO;

        this.salario = funcionario.getSalario().multiply(BigDecimal.valueOf(aumento).divide(BigDecimal.valueOf(100))).add(funcionario.getSalario());
    }


    @Override
    public String toString() {

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return id + ", " + nome + ", " + nf.format(salario);
    }
}
