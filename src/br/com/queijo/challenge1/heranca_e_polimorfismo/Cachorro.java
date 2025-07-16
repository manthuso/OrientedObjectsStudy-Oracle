package br.com.queijo.challenge1.heranca_e_polimorfismo;

public class Cachorro extends Animal{
    public void AbanarRabo() {
        System.out.println("Abanando Rabo");
    }

    @Override
    public void emitirSom() {
        System.out.println("AU AU AU");
    }
}
