package com.estudos;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero1;
        double numero2;
        double verificador;
        int auxiliar;

        System.out.println("Digite o valor para o numero1:");
        numero1 = sc.nextInt();
        System.out.println("Digite o valor para o numero2:");
        numero2 = sc.nextInt();

        verificador = numero1 / numero2;
        auxiliar = (int) verificador;

        if (verificador == auxiliar && verificador > 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }
    }
}