package com.estudos;

import com.estudos.entities.Conta;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer numeroDaConta;
        String nomeTitularConta;
        String depositoInicial;

        System.out.println("Digite o número da conta:");
        numeroDaConta = sc.nextInt();

        System.out.println("Digite o nome do titular da conta:");
        sc.nextLine();
        nomeTitularConta = sc.nextLine();

        System.out.println("Existe um depósito inicial (s/n)?");
        depositoInicial = sc.nextLine();

        Conta conta = new Conta(numeroDaConta, nomeTitularConta);

        if(depositoInicial.equalsIgnoreCase("s")) {
            System.out.println("Digite um valor para depósito inicial:");
            conta.depositar(sc.nextBigDecimal());
            System.out.println(conta);
        } else {
            System.out.println(conta);
        }

        System.out.println("\nDigite um valor para depósito:");
        conta.depositar(sc.nextBigDecimal());
        System.out.println(conta);

        System.out.println("\nDigite um valor para saque:");
        conta.sacar(sc.nextBigDecimal());
        System.out.println(conta);
    }
}