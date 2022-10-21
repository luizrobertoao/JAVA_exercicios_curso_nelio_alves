package com.estudos.entities;

public class Pessoa {
    private String nome;
    private Integer idade;
    private Double altura;

    public Pessoa(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
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

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public static Double calcularMediaAltura(Pessoa[] pessoas) {
        Double media = 0.0;
        Double soma = 0.0;
        for (int i = 0; i < pessoas.length; i++) {
            Double altura = pessoas[i].altura;
            soma = altura + soma;
        }
        media = soma / pessoas.length;
        return media;
    }

    public static Double calcularPorcentagemMenores16(Pessoa[] pessoas) {
        Integer quantidadeMenores16 = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].idade < 16) {
                quantidadeMenores16++;
            }
        }
        return (quantidadeMenores16 * 100) / Double.valueOf(pessoas.length);
    }

    public static void imprimirNomesMenores16(Pessoa[] pessoas) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].idade < 16) {
                System.out.println(pessoas[i].nome);
            }
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
