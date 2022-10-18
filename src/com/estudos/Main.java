package com.estudos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        int auxiliar;

        System.out.println("Digite um valor entre 0 e 100:");
        valor = sc.nextDouble();

        auxiliar = (int)valor;


        if (auxiliar < 25 && auxiliar >= 0) {
            System.out.println("O valor está no intervalo (0, 25)");
        } else if (auxiliar >= 25 && auxiliar < 50) {
            System.out.println("O valor está no intervalo (25, 50)");
        } else if (auxiliar >= 50 && auxiliar < 75) {
            System.out.println("O valor está no intervalo (50, 75)");
        } else if (auxiliar >= 75 && auxiliar <= 100) {
            System.out.println("O valor está no intervalo (75, 100)");
        } else {
            System.out.println("O valor está fora do intervalo.");
        }
    }
}