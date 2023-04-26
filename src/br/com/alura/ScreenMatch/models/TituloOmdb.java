package br.com.alura.ScreenMatch.models;

public record TituloOmdb(String title, String year, String runtime) {
    //Record terá uma conexão com a class Titulo para recuperar o json
}
