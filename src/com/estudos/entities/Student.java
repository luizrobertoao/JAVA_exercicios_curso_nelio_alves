package com.estudos.entities;

public class Student {
    public String name;
    public Double notaPrimeiroTrimestre;
    public Double notaSegundoTrimestre;
    public Double notaTerceiroTrimestre;
    public Double media;

    public Double calculaMedia() {
        return this.media = (this.notaSegundoTrimestre + this.notaPrimeiroTrimestre + this.notaTerceiroTrimestre) / 3;
    }

    public void foiAprovado() {
        if (this.media > 6) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }

    public void calculaPontosFaltantes() {
        if (media < 6) {
            System.out.println("Fatam " + (10 - this.media) + " para aprovação.");
        }
    }
}
