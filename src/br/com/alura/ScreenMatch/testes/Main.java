package br.com.alura.ScreenMatch.testes;

import br.com.alura.ScreenMatch.calculos.CalculadoraDeTempo;
import br.com.alura.ScreenMatch.calculos.FiltroRecomendacao;
import br.com.alura.ScreenMatch.models.Episodio;
import br.com.alura.ScreenMatch.models.Filme;
import br.com.alura.ScreenMatch.models.Serie;

import java.util.ArrayList;

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

        filme1.exibirFichaTecnica();
        filme1.avalia(10);
        filme1.avalia(10);
        filme1.avalia(10);
        System.out.println(filme1.pegaMedia());
        System.out.println(filme1.getTotalDeAvaliacoes());



        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(favorito);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalDeVisualizacoes(300);
        filtro.filtra(episodio);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(outro);
        listaDeFilmes.add(favorito);

        System.out.println(listaDeFilmes);
        System.out.println(listaDeFilmes.contains(filme1));
        System.out.println(listaDeFilmes.size());

    }

}
