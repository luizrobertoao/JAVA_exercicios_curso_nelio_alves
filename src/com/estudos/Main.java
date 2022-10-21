package com.estudos;

import com.estudos.entities.Pessoa;

import java.math.BigDecimal;
import java.util.Scanner;

import static com.estudos.entities.Pessoa.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer numeroPessoas;

        System.out.println("Quantas pessoas serao digitadas?");
        numeroPessoas = sc.nextInt();

        Pessoa[] vectPessoas = new Pessoa[numeroPessoas];

        for (int i = 0 ; i < vectPessoas.length ; i++) {

            System.out.println("Dados da " + (i + 1) + "a pessoa:");

            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.println("Idade: ");
            Integer idade = sc.nextInt();

            System.out.println("Altura: ");
            Double altura = sc.nextDouble();

            vectPessoas[i] = new Pessoa(nome, idade, altura);
        }

        System.out.println("Altura média: " + calcularMediaAltura(vectPessoas));
        System.out.println("Pessoas com menos de 16 anos: " + calcularPorcentagemMenores16(vectPessoas) + "%.");
        imprimirNomesMenores16(vectPessoas);
    }


        /*Integer quantidadeDeNumeros;

        System.out.print("Quantos números você vai digitar? ");
        quantidadeDeNumeros = sc.nextInt();

        Integer[] vectNumeros = new Integer[quantidadeDeNumeros];

        for (int i=0 ; i<vectNumeros.length ; i++) {
            System.out.print("Digite um número: ");
            vectNumeros[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS:");

        for (int i=0 ; i<vectNumeros.length ; i++) {
            if (vectNumeros[i] < 0) {
               System.out.println(vectNumeros[i]);
           }
        }
    }*/
}