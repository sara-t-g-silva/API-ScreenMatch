package br.com.alura.ScreenMatch.models;

import br.com.alura.ScreenMatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    public Filme(String nome, int anoDeLancamento){
        super(nome, anoDeLancamento);

    }

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia()/2;
    }
}
