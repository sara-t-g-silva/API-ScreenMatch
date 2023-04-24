package br.com.alura.ScreenMatch.models;

public class Titulo {
    private String nome;
    private int anoDoLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public Titulo(String nome, int anoDoLancamento) {
        this.nome = nome;
        this.anoDoLancamento = anoDoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDoLancamento() {
        return anoDoLancamento;
    }


    public void setAnoDoLancamento(int anoDoLancamento) {
        this.anoDoLancamento = anoDoLancamento;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibirFichaTecnica(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Ano de Lançamento: "+ this.anoDoLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;

    }

    public double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;

    }

    public  int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }
}