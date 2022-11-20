package com.estudos;

import com.estudos.entities.Reserva;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("DIGITE OS DADOS DA RESERVA:");
        System.out.print("Quarto: ");
        Integer numeroQuarto = sc.nextInt();
        System.out.print("Data do check-in (dd/mm/aaaa): ");
        LocalDate checkIn = LocalDate.parse(sc.next(), formatoData);
        System.out.print("Data do check-out (dd/mm/aaaa): ");
        LocalDate checkOut = LocalDate.parse(sc.next(), formatoData);

        if(!checkOut.isAfter(checkIn)) {
            System.out.println("Erro na reserva: A data de check-out nao deve ser anterior a data de check-in");
        } else {
            Reserva reserva = new Reserva(numeroQuarto, checkIn, checkOut);
            System.out.println(reserva);

            System.out.println();
            System.out.println("ATUALIZE OS DADOS DA RESERVA:");
            System.out.print("Data do check-in (dd/mm/aaaa): ");
            checkIn = LocalDate.parse(sc.next(), formatoData);
            System.out.print("Data do check-out (dd/mm/aaaa): ");
            checkOut = LocalDate.parse(sc.next(), formatoData);

            String error = reserva.atualizarDatas(checkIn, checkOut);
            if(error != null) {
                System.out.println(error);
            } else {
                System.out.println(reserva);
            }



        }
    }
}