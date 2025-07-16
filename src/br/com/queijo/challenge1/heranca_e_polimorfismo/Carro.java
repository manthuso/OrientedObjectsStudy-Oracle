package br.com.queijo.challenge1.heranca_e_polimorfismo;

public class Carro {
    protected String modeloCarro;
    private double precoAno1, precoAno2, precoAno3;


    public void definirModelo (String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public void definirPrecos (double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public void infoCarro() {
        System.out.println(modeloCarro);
        System.out.println("R$" + precoAno1);
        System.out.println("R$" + precoAno2);
        System.out.println("R$" + precoAno3);
        System.out.println("O maior valor é R$: " + calcularMaiorPreco());
        System.out.println("O menor valor é R$: " + calcularMenorPreco());
    }

    private double calcularMenorPreco() {
        double promocao = precoAno1;
        if (promocao > precoAno2) {
            promocao = precoAno2;
        }
        if (promocao > precoAno3) {
            promocao = precoAno3;
        }
        return promocao;
    }
    private double calcularMaiorPreco() {
        double promocao = precoAno1;
        if (promocao < precoAno2) {
            promocao = precoAno2;
        }
        if (promocao < precoAno3) {
            promocao = precoAno3;
        }
        return promocao;
    }


}
