package br.com.queijo.challenge1.polimorfismo_interface;

public class ConversorMoeda implements ConversaoFinanceira{
double dolar = 5.57;

    @Override
    public double converterDolarParaReal(double valorDolar) {
        return valorDolar * dolar;
    }
}
