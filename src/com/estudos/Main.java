package com.estudos;

import com.estudos.Exceptions.DomainException;
import com.estudos.entities.Reserva;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.println("DIGITE OS DADOS DA RESERVA:");
            System.out.print("Quarto: ");
            Integer numeroQuarto = sc.nextInt();
            System.out.print("Data do check-in (dd/mm/aaaa): ");
            LocalDate checkIn = LocalDate.parse(sc.next(), formatoData);
            System.out.print("Data do check-out (dd/mm/aaaa): ");
            LocalDate checkOut = LocalDate.parse(sc.next(), formatoData);

            Reserva reserva = new Reserva(numeroQuarto, checkIn, checkOut);
            System.out.println(reserva);

            System.out.println();
            System.out.println("ATUALIZE OS DADOS DA RESERVA:");
            System.out.print("Data do check-in (dd/mm/aaaa): ");
            checkIn = LocalDate.parse(sc.next(), formatoData);
            System.out.print("Data do check-out (dd/mm/aaaa): ");
            checkOut = LocalDate.parse(sc.next(), formatoData);

            reserva.atualizarDatas(checkIn, checkOut);

            System.out.println(reserva);
        } catch (DomainException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Os dados digitados são invalidos.");
        }
    }
}