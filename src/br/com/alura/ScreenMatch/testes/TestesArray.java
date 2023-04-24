package br.com.alura.ScreenMatch.testes;

import br.com.alura.ScreenMatch.models.Filme;
import br.com.alura.ScreenMatch.models.Serie;
import br.com.alura.ScreenMatch.models.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class TestesArray {

    public static void main(String[] args) {
        Filme favorito = new Filme("Avatar", 2023);
        favorito.avalia(9);
        Filme outro = new Filme("Mulher Maravilha",1997);
        outro.avalia(10);
        Serie serie = new Serie("Dog",2010);
        serie.avalia(8);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(favorito);
        lista.add(outro);
        lista.add(serie);

        for (Titulo item: lista) {
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: "+filme.getClassificacao());
            }

        }

        Collections.sort(lista);
        System.out.println(lista);
    }
}
