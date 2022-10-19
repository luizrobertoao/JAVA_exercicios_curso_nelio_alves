package com.estudos;

import com.estudos.entities.Pedido;
import java.util.Scanner;

import static com.estudos.util.CalculoDePedido.calculaIof;
import static com.estudos.util.CalculoDePedido.calculaTotalPedido;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pedido pedido = new Pedido();

        System.out.println("Digite o nome da moeda:");
        pedido.moeda.name = sc.nextLine();
        System.out.println("Qual a cotação atual da moeda?");
        pedido.moeda.cotacaoEmReal = sc.nextBigDecimal();
        System.out.println("Qual a quantidade a ser comprada?");
        pedido.quantidade = sc.nextDouble();


        System.out.println("O valor a ser pago é de: R$" + calculaTotalPedido(pedido));
        System.out.println("O valor do IOF nessa transação é de: " +  pedido.moeda.cotacaoEmReal.multiply(calculaIof(pedido.quantidade)));

    }
}