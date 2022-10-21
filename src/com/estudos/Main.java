package com.estudos;

import com.estudos.entities.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
    }



}