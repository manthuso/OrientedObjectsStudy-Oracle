package br.com.queijo.challenge1.encapsulamento;

public class Aluno {
    private String nome;
    private double nota;
    private double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String calcularMedia() {
        double media = (nota + nota2)/2;
        return (media < 5) ? "Reprovado" : "Aprovado";

    }
}
