package br.com.alura.ScreenMatch.testes;

import br.com.alura.ScreenMatch.calculos.CalculadoraDeTempo;
import br.com.alura.ScreenMatch.models.Filme;
import br.com.alura.ScreenMatch.models.Serie;

public class Main {

    public static void main(String[] args) {
        Filme filme1 = new Filme("Mulher Maravilha",1987);


        Filme favorito = new Filme("Filme favorito",1999);favorito.setNome("Filme favorito");
        favorito.setAnoDoLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        Filme outro = new Filme("John Wick",2004);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        Serie serie = new Serie("La Casa de Papel",2007);


        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodioPorTemporadas(10);
        serie.setMinutosPorEpisodio(45);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(serie);

        System.out.println("Tempo total: " +calculadora.getTempoTotal());
    }

}
