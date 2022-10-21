package com.estudos;

import com.estudos.entities.Funcionario;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer numeroFuncionarios = 0;

        System.out.println("Quantos funcionarios serao registrados?");
        numeroFuncionarios = sc.nextInt();

        List<Funcionario> listaFuncionarios = new ArrayList<>();

        for (int i = 0; i < numeroFuncionarios; i++) {
            String nome = "";
            Integer id = 0;
            BigDecimal salario = BigDecimal.ZERO;
            Funcionario funcionario = new Funcionario();

            System.out.println("Funcionario #" + (i + 1) + ":");
            System.out.print("Id: ");
            id = sc.nextInt();

            System.out.print("Nome: ");
            nome = sc.next();

            System.out.print("Salario: ");
            salario = sc.nextBigDecimal();

            funcionario = new Funcionario(nome, id, salario);

//            Funcionario finalFuncionario = funcionario;
//            Integer finalId = id;
            if (listaFuncionarios.stream().map(Funcionario::getId).filter(id::equals).findFirst().isPresent()) {
                System.out.println("Este Id já existe.");
            } else {
                listaFuncionarios.add(funcionario);
            }
        }
        System.out.print("Digite o id do funcionario que recebera o aumento: ");
        System.out.println();
        Integer idFuncionario = sc.nextInt();
        System.out.println("Digite a porcentagem do aumento:");
        Double aumento = sc.nextDouble();

        Funcionario funcionarioAtualizado = listaFuncionarios.stream()
                .filter(f -> f.getId() == idFuncionario)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Funcionario não existe"));

        funcionarioAtualizado.aumentarSalario(aumento, funcionarioAtualizado);

        System.out.println("Lista de funcionarios atualizada:");

        for (Funcionario f : listaFuncionarios
             ) {
            System.out.println(f.toString());
        }

    }
}