package br.com.queijo.challenge1.heranca_e_polimorfismo;

public class MainHP {
    public static void main(String[] args) {
        ModeloCarro Sedan = new ModeloCarro();

        Sedan.definirModelo("Sedan Teste");
        Sedan.definirPrecos(7000, 8000, 9000);

        Sedan.infoCarro();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.AbanarRabo();

        Animal gnose = new Animal();
        gnose.emitirSom();

    }

}
