package br.com.queijo.challenge1;

public class IdadePessoa {
    private int idade;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String verificarIdade() {
        return (idade < 18) ? "Menor Idade" : "Maior Idade";


    }


}
