package com.estudos;

import com.estudos.entities.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<Produto> produtos = new ArrayList<>();

        System.out.print("Digite o numero de produtos: ");
        Integer numeroProdutos = sc.nextInt();

        for (int i = 0; i < numeroProdutos; i++) {
            System.out.println("Dados do Produto #" + (i + 1) + ":");
            System.out.print("Comum, usado ou importado (c/u/i)? ");
            char condicao = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preco: ");
            BigDecimal preco = sc.nextBigDecimal();

            switch (condicao) {
                case 'c':
                    produtos.add(new Produto(nome, preco));
                    break;
                case 'u':
                    sc.nextLine();
                    System.out.print("Data de fabricacao (dd/mm/aaaa): ");
                    LocalDate dataFabricacao = LocalDate.parse(sc.nextLine(), formatoData);
                    produtos.add(new ProdutoUsado(nome, preco, dataFabricacao));
                    break;
                case 'i':
                    System.out.print("Taxa alfandegaria: ");
                    BigDecimal taxaAlfandega = sc.nextBigDecimal();
                    produtos.add(new ProdutoImportado(nome, preco, taxaAlfandega));
                    break;
            }
        }

        System.out.println("ETIQUETAS DE PRECO:");
        produtos.forEach(produto -> {
            produto.etiquetaPreco();
        });
    }
}
