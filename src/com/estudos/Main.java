package com.estudos;

import com.estudos.entities.*;
import com.estudos.entities.enunms.Cor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de formas: ");
        Integer quantidadeFormas = sc.nextInt();
        List<Forma> formas = new ArrayList<>();

        for (int i = 0; i < quantidadeFormas; i++) {
            System.out.print("Dados da forma #" + (i + 1) + ": ");
            System.out.print("Retangulo ou circulo (r/c): ");
            char tipoForma = sc.next().charAt(0);
            System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
            Cor cor = Cor.valueOf(sc.next());

            if (tipoForma == 'r') {
                System.out.print("Largura: ");
                Double largura = sc.nextDouble();
                System.out.print("Altura: ");
                Double altura = sc.nextDouble();
                Forma forma = new Retangulo(cor, largura, altura);
                formas.add(forma);
            } else {
                System.out.print("Raio: ");
                Double raio = sc.nextDouble();
                Forma forma = new Circulo(cor, raio);
                formas.add(forma);
            }
        }
        System.out.println("AREA DAS FORMAS:");
        formas.forEach(forma -> {
            System.out.println(String.format("%.2f", forma.calcularArea()));
        });
    }
}
