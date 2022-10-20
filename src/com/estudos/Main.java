package com.estudos;

import com.estudos.entities.Conta;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer quantidadeDeNumeros;

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
    }
}