package com.estudos;

import com.estudos.entities.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Empregado> empregados = new ArrayList<>();

        System.out.println("Digite o numero de funcionarios:");
        Integer numeroFuncionarios = sc.nextInt();

        for (int i = 0; i < numeroFuncionarios; i++) {
            System.out.println("Dados do Empregado #" + (i + 1) + ":");
            System.out.print("Terceirizado (s/n)? ");
            sc.nextLine();
            char terceirizacao = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Horas trabalhadas: ");
            Integer horas = sc.nextInt();
            System.out.print("Valor por hora: ");
            BigDecimal valorHora = sc.nextBigDecimal();
            Empregado empregado;

            if (terceirizacao == 's') {
                System.out.print("Taxa Adicional: ");
                BigDecimal taxaAdicional = sc.nextBigDecimal();
                empregado = new EmpregadoTerceirizado(nome, horas, valorHora, taxaAdicional);
                empregados.add(empregado);
            } else {
                empregado = new Empregado(nome, horas, valorHora);
                empregados.add(empregado);
            }
        }
    }
}
