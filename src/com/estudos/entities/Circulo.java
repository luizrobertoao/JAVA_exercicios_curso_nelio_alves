package com.estudos.entities;

import com.estudos.entities.enunms.Cor;

public class Circulo extends Forma{

    private Double raio;

    public Circulo() {
        super();
    }

    public Circulo(Cor cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * raio * raio;
    }
}
