package com.estudos;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer valor;

        System.out.println("Digite o valor:");
        valor = sc.nextInt();
  Valor vc = new Valor();
  vc.verificaValor(valor);
    }
}