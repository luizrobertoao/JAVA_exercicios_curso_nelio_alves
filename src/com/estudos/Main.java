package com.estudos;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial;
        int horaFinal;
        int duracao;

        System.out.println("Digite a hora inical:");
        horaInicial = sc.nextInt();
        System.out.println("Digite a hora final:");
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
            System.out.println("A duração do jogo foi de " + duracao + " horas.");
        } else {
            duracao = 24 - horaInicial + horaFinal;
            System.out.println("A duração do jogo foi de " + duracao + " horas.");
        }
    }
}