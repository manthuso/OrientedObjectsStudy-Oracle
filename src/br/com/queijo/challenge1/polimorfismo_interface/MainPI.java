package br.com.queijo.challenge1.polimorfismo_interface;

public class MainPI {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        System.out.println("CONVERSÃO DOLAR PARA REAL: " + conversor.converterDolarParaReal(50));

        CalculadoraSalaRetangular calculoSala = new CalculadoraSalaRetangular();
        System.out.println("CALCULO DE ÁREA: " + calculoSala.calcularArea(5, 20));
        System.out.println("CALCULO DE PERIMETRO: " + calculoSala.calcularPerimetro(5, 20));

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(3);

    }
}
