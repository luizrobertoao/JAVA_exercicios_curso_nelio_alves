package com.estudos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer numeroValores;

        System.out.println("Quantas valores terá cada vetor?");
        numeroValores = sc.nextInt();

        Integer[] vectA = new Integer[numeroValores];
        Integer[] vectB = new Integer[numeroValores];
        Integer[] vectC = new Integer[numeroValores];

        System.out.println("Digite os " + numeroValores + " valores do vetor A:");

        for (int i = 0; i < vectA.length; i++) {
            vectA[i] = sc.nextInt();
        }

        System.out.println("Digite os " + numeroValores + "valores do vetor B:");

        for (int i = 0; i < vectB.length; i++) {
            vectB[i] = sc.nextInt();
        }

        for (int i = 0; i < vectC.length; i++) {
            vectC[i] = vectA[i] + vectB[i];
        }

        System.out.println("Resultados das somas das posições correspondentes em A e B:");

        for (int i = 0; i < vectC.length; i++) {
            System.out.println(vectC[i]);
        }
    }
}