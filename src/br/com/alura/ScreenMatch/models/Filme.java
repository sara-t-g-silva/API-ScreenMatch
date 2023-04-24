package br.com.alura.ScreenMatch.models;

public class Filme extends Titulo {

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
}
