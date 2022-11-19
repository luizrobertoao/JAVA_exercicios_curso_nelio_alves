package com.estudos;

import com.estudos.entities.Pessoa;
import com.estudos.entities.PessoaFisica;
import com.estudos.entities.PessoaJuridica;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        List<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Digite a quantidade de contribuintes que vai cadastrar: ");
        Integer numeroContribuintes = sc.nextInt();

        for (int i = 0; i < numeroContribuintes; i++) {

            System.out.println("Digite os dados do contribuinte #" + (i + 1) + ": ");
            System.out.print("Pessoa fisica ou juridica (f/j): ");
            char tipoPessoa = sc.next().charAt(0);

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Renda anual: ");
            BigDecimal rendaAnual = sc.nextBigDecimal();

            if (tipoPessoa == 'f') {
                System.out.print("Gastos com saude: ");
                BigDecimal gastosSaude = sc.nextBigDecimal();
                pessoas.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            } else {
                System.out.print("Numero de funcionarios: ");
                Integer numeroFuncionarios = sc.nextInt();
                pessoas.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
            }
        }

        System.out.println("IMPOSTOS PAGOS: ");

        final BigDecimal[] impostoTotal = {BigDecimal.ZERO};

        pessoas.forEach(pessoa -> {

            impostoTotal[0] = impostoTotal[0].add(pessoa.calcularImposto());

            System.out.println(pessoa.getNome() + ": " + nf.format(pessoa.calcularImposto()));
        });

        System.out.println("TOTAL DE IMPOSTOS PAGOS: " + nf.format(impostoTotal[0]));

    }
}
