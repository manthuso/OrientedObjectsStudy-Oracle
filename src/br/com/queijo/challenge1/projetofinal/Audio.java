package br.com.queijo.challenge1.projetofinal;

public class Audio {

    private String nome;
    private int totalVisualizacoes;
    private int duracaoEmMinutos;
    private int totalCurtidas;
    private int totalComentarios;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getTotalComentarios() {
        return totalComentarios;
    }

    public void curtir() {
        this.totalCurtidas++;
    }

    public void visualizar() {
        this.totalVisualizacoes++;
    }
}
