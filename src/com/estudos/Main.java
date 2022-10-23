package com.estudos;

import com.estudos.entities.ContratoHora;
import com.estudos.entities.Departamento;
import com.estudos.entities.Empregado;
import com.estudos.entities.NivelEmpregadoEnum;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre o nome do departamento: ");
        Departamento departamento = new Departamento(sc.next());
        System.out.println();

        sc.nextLine();
        System.out.println("Digite os dados do empregado: ");
        System.out.print("Nome: ");
        String nomeEmpregado = sc.nextLine();
        System.out.print("Nivel: ");
        NivelEmpregadoEnum nivel = NivelEmpregadoEnum.valueOf(sc.nextLine());
        System.out.print("Salario base: ");
        BigDecimal salarioBase = sc.nextBigDecimal();

        Empregado empregado = new Empregado(nomeEmpregado, nivel, salarioBase, departamento);

        sc.nextLine();
        System.out.print("Quantos contratos o empregado tera? ");
        Integer numeroContratos = sc.nextInt();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (int i = 0; i < numeroContratos; i++) {

            sc.nextLine();
            System.out.println("Digite os dados do contrato #" + (i + 1) + ":");
            System.out.print("Data: ");
            LocalDate dataContrato = LocalDate.parse(sc.nextLine(), formatoData);
            System.out.print("Valor por hora: ");
            Double valorPorHora = sc.nextDouble();
            System.out.print("Duracao em horas: ");
            Integer horas = sc.nextInt();

            ContratoHora contrato = new ContratoHora(dataContrato, valorPorHora, horas);

            empregado.adicionarContrato(contrato);

        }

        sc.nextLine();
        System.out.print("Digite o mes e o ano para calcular a receita (MM/YYYY): ");
        String dataReceita = sc.nextLine();
        LocalDate data = LocalDate.parse(("01/" + dataReceita), formatoData);

        BigDecimal receita = empregado.receitaMensal(data);
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Departamento: " + empregado.getDepartamento().getNome());
        System.out.println("Receita em " + dataReceita + ": " + nf.format(receita));
    }
}
