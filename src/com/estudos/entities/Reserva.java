package com.estudos.entities;

import com.estudos.Exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reserva {
    private Integer numeroQuarto;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public static DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reserva(Integer numeroQuarto, LocalDate checkIn, LocalDate checkOut) throws DomainException {
        if (!checkOut.isAfter(checkIn)) {
            throw new DomainException("Erro na reserva: A data de check-out nao deve ser anterior a data de check-in");
        }
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public Long duracao() {
        Long duracao = ChronoUnit.DAYS.between(checkIn, checkOut);
        return duracao;
    }

    public void atualizarDatas(LocalDate checkIn, LocalDate checkOut) throws DomainException {
        LocalDate hoje = LocalDate.now();
        if (checkIn.isBefore(hoje) || checkOut.isBefore(hoje)) {
            throw new DomainException("Erro na reserva: As datas para atualizacao da reserva devem ser futuras.");
        }
        if (!checkOut.isAfter(checkIn)) {
            throw new DomainException("Erro na reserva: A data de check-out nao deve ser anterior a data de check-in");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Reserva: Quarto: " +
                getNumeroQuarto() +
                ", check-in: " +
                getCheckIn().format(formatoData) +
                ", check-out: " +
                getCheckOut().format(formatoData) +
                ", " +
                duracao() +
                " noites.";

    }
}
