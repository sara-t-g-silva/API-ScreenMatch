package br.com.alura.ScreenMatch.testes;

import br.com.alura.ScreenMatch.models.Titulo;
import br.com.alura.ScreenMatch.models.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BuscaOMDB {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o filme que deseja buscar: ");
        var busca = leitura.nextLine();

        String conexao = "https://www.omdbapi.com/?t="+ busca + "&apikey=2b8577df"; //String de conexão da API

        HttpClient client = HttpClient.newHttpClient(); // criou um clienteHttp

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(conexao))
                .build(); // faz a requisição httpResquest a string de conexão

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body(); // recupera a conexão e retorna um corpo json
        System.out.println(json); //retorna um arquivo json


        Gson  gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create(); // desconsidera as letras maiusculas do json

        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);
        Titulo meuTitulo = new Titulo(meuTituloOmdb); // necessário criar um construtor na classe Titulo (chave/ valor)
        System.out.println("Titulo já convertido");
        System.out.println(meuTitulo);





    }





}
