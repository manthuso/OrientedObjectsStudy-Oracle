package br.com.queijo.challenge1.polimorfismo_interface;

public class TabuadaMultiplicacao implements Tabuada {
    double resultado;
    @Override
    public void mostrarTabuada(double x) {
        int i = 0;
        while (i < 10) {
            resultado = x * i;
            i++;
            System.out.println(x + "X" + i + "=" + resultado);
        }

    }
}
