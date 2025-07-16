package br.com.queijo.challenge1.heranca_e_polimorfismo;

public class Gato extends Animal{
    public void arranharMoveis(){
        System.out.println("Arranhando Arranhando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("MIAU MIAU MIAU");
    }
}
