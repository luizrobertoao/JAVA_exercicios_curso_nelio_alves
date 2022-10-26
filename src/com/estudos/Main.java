package com.estudos;

import com.estudos.entities.*;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite os dados do cliente: ");
        System.out.print("Nome: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Email: ");
        String emailCliente = sc.nextLine();
        System.out.print("Data de nascimento: ");
        LocalDate dataNascimento = LocalDate.parse(sc.nextLine(), formatoData);

        Cliente cliente = new Cliente(nomeCliente, emailCliente, dataNascimento);

        System.out.println("Digite os dados do pedido: ");
        System.out.print("Status do pedido: ");
        StatusPedidoEnum statusPedido = StatusPedidoEnum.valueOf(sc.nextLine());
        System.out.println("Quantos itens contem esse pedido? ");
        Integer quantidadeItens = sc.nextInt();

        LocalDateTime dataPedido = LocalDateTime.now();

        Pedido pedido = new Pedido(dataPedido, statusPedido, cliente);
        Produto produto;

        for (int i = 0; i < quantidadeItens; i++) {
            System.out.println("Digite os dados do item #" + (i + 1) + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.print("Preco: ");
            BigDecimal precoProduto = sc.nextBigDecimal();
            System.out.print("Quantidade: ");
            Integer quantidadeProduto = sc.nextInt();

            produto = new Produto(nomeProduto, precoProduto);
            pedido.adicionarItem(new ItemPedido(quantidadeProduto, produto));
        }

        DateTimeFormatter formatoDataPedido = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.println("RESUMO DO PEDIDO:");
        System.out.println("Momento: " + pedido.getMomento().format(formatoDataPedido));
        System.out.println("Status: " + pedido.getStatus());
        System.out.println("Cliente: " + cliente.getNome() + " "
                + cliente.getDataNascimento().format(formatoData) + " "
                + "- "
                + cliente.getEmail());
        System.out.println("Itens do pedido:");
        pedido.getItensPedido().forEach(i -> {
            System.out.println(i.getProduto().getNome() + ", "
                    + "Quantidade: " + i.getQuantidade() + ", "
                    + "Subtotal: " + nf.format(i.subTotal(i)));
        });
        System.out.println("Total: " + nf.format(pedido.totalPedido()));
    }
}
