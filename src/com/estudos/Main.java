package com.estudos;


import com.estudos.entities.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Digite o nome do aluno:");
        student.name = sc.nextLine();
        System.out.println("Digite a nota no primeiro trimestre");
        student.notaPrimeiroTrimestre = sc.nextDouble();
        System.out.println("Digite a nota no segundo trimestre");
        student.notaSegundoTrimestre = sc.nextDouble();
        System.out.println("Digite a nota no terceiro trimestre");
        student.notaTerceiroTrimestre = sc.nextDouble();

        student.calculaMedia();

        System.out.println("O aluno " + student.name + " obteve media: " + student.media);

        student.foiAprovado();

        student.calculaPontosFaltantes();

    }
}