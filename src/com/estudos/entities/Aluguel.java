package com.estudos.entities;

public class Aluguel {
    private String nomeAluno;
    private String emailAluno;
    private Integer quartoEscolhido;

    public Aluguel() {
    }
    public Aluguel(String nomeAluno, String emailAluno, Integer quartoEscolhido) {
        this.nomeAluno = nomeAluno;
        this.emailAluno = emailAluno;
        this.quartoEscolhido = quartoEscolhido;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }

    public Integer getQuartoEscolhido() {
        return quartoEscolhido;
    }

    public void setQuartoEscolhido(Integer quartoEscolhido) {
        this.quartoEscolhido = quartoEscolhido;
    }

    public void gerarRelatorioOcupacao(Aluguel[] vectAlugueis) {
        for (int i = 0; i < vectAlugueis.length; i++) {
           if (vectAlugueis[i] != null) {
               System.out.println(vectAlugueis[i].quartoEscolhido + ": " + vectAlugueis[i].nomeAluno + ", " + vectAlugueis[i].emailAluno);
           }
        }
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "nomeAluno='" + nomeAluno + '\'' +
                ", emailAluno='" + emailAluno + '\'' +
                ", quartoEscolhido=" + quartoEscolhido +
                '}';
    }
}
