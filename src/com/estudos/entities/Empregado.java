package com.estudos.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Empregado {
    String nome;
    NivelEmpregadoEnum nivel;
    BigDecimal salarioBase;
    Departamento departamento;
    List<ContratoHora> contratos = new ArrayList<>();

    public Empregado(String nome, NivelEmpregadoEnum nivel, BigDecimal salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelEmpregadoEnum getNivel() {
        return nivel;
    }

    public void setNivel(NivelEmpregadoEnum nivel) {
        this.nivel = nivel;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHora> getContratos() {
        return contratos;
    }

    public void adicionarContrato(ContratoHora contrato) {
        contratos.add(contrato);
    }

    public void removerContrato(ContratoHora contrato) {
        contratos.remove(contrato);
    }

    public BigDecimal receitaMensal(LocalDate data) {

        AtomicReference<BigDecimal> receita = new AtomicReference<>(BigDecimal.ZERO);
        List<ContratoHora> contratosNoMes = new ArrayList<>();

        contratos.forEach(c -> {
            if ((c.getData().getYear() == data.getYear()) && (c.getData().getMonth() == data.getMonth())) {
                contratosNoMes.add(c);
            }
        });

        final BigDecimal[] somaReceita = {BigDecimal.ZERO};

        contratosNoMes.forEach(c -> {

            Integer quantidadeHoras = c.getHoras();
            Double valorDaHora = c.getValorPorHora();
            BigDecimal valorContrato = BigDecimal.valueOf(quantidadeHoras * valorDaHora);
            somaReceita[0] = somaReceita[0].add(valorContrato);


        });
        return somaReceita[0].add(salarioBase);
    }

}
