package com.estudos;

import com.estudos.entities.Aluguel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluguel[] vectAlugueis = new Aluguel[10];
        Integer quantidadeAlugueis;

        System.out.println("Quantos alunos estão alugando quartos?");
        quantidadeAlugueis = sc.nextInt();

        System.out.println("Cadastre os aluguéis:");

        for (int i = 0; i < quantidadeAlugueis; i++) {
            String nome = "";
            String email = "";
            Integer quartoEscolhido = 0;

            System.out.print("Aluguel #" + (i + 1) + ":" + "\n" + "Nome: ");
            sc.nextLine();
            nome = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Quarto: ");
            quartoEscolhido = sc.nextInt();

            vectAlugueis[quartoEscolhido - 1] = new Aluguel(nome, email, quartoEscolhido);
        }

        System.out.println("Quartos ocupados:");

        Aluguel aluguel = new Aluguel();

        aluguel.gerarRelatorioOcupacao(vectAlugueis);

        /*
        Integer numeroPessoas;

        System.out.println("Quantas pessoas serao digitadas?");
        numeroPessoas = sc.nextInt();

        Pessoa[] vectPessoas = new Pessoa[numeroPessoas];

        for (int i = 0; i < vectPessoas.length; i++) {

            System.out.println("Dados da " + (i + 1) + "a pessoa:");

            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.println("Idade: ");
            Integer idade = sc.nextInt();

            vectPessoas[i] = new Pessoa(nome, idade);
        }

        Pessoa pessoa = new Pessoa();

        System.out.println("A pessoa mais velha é: " + pessoa.filtrarPessoaMaisVelha(vectPessoas));

         */
    }



}