package com.estudos.entities;

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

        Integer idade = 0;
        String nome = "";

        for (int i = 0; i < pessoas.length; i++) {

            if (pessoas[i].idade > idade) {
                idade = pessoas[i].getIdade();
                nome = pessoas[i].getNome();
            }
        }
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
