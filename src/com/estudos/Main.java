package com.estudos;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigoItem;
        int quantidadeItens;
        double preco;


        System.out.println("Digite o codigo do item:");
        codigoItem = sc.nextInt();
        System.out.println("Digite a quantidade de itens:");
        quantidadeItens = sc.nextInt();

        switch (codigoItem) {
            case 1:
                preco = quantidadeItens * 4.00;
                System.out.printf("O valor a ser pago é de R$%.2f", preco);
                break;
            case 2:
                preco = quantidadeItens * 4.50;
                System.out.printf("O valor a ser pago é de R$%.2f", preco);
                break;
            case 3:
                preco = quantidadeItens * 5.00;
                System.out.printf("O valor a ser pago é de R$%.2f", preco);
                break;
            case 4:
                preco = quantidadeItens * 2.00;
                System.out.printf("O valor a ser pago é de R$%.2f", preco);
                break;
            case 5:
                preco = quantidadeItens * 1.50;
                System.out.printf("O valor a ser pago é de R$%.2f", preco);
                break;
            default:
                System.out.println("Você não digitou um código válido.");
        }
    }
}