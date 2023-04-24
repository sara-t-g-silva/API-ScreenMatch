package br.com.alura.ScreenMatch.calculos;

import br.com.alura.ScreenMatch.models.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;


    public void inclui(Titulo titulo){
        tempoTotal+= titulo.getDuracaoEmMinutos();
    }


    public int getTempoTotal(){
        return tempoTotal;
    }
}
