package com.estudos.entities;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa() {
    }
    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String filtrarPessoaMaisVelha(Pessoa[] pessoas) {

        List<Pessoa> pessoaList = Arrays.asList(pessoas);
        Pessoa pessoaMaisVelha = pessoaList.stream().max(Comparator.comparingInt(Pessoa::getIdade)).get();
        return pessoaMaisVelha.getNome();
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
