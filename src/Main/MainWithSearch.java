package Main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import calculators.Params;
import exceptions.YearConversionErrorException;
import models.Title;
import models.TitleOmdb;

public class MainWithSearch {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        String search = "";
        List<Title> titles = new ArrayList<>();

        Gson gson = new GsonBuilder()
        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
        .setPrettyPrinting()
        .create();


        while (!search.equalsIgnoreCase("exit")) {

            System.out.println("Which movie do you want to search for?");
            search = sc.nextLine();

            if(search.equalsIgnoreCase("exit")) {
                break;
            }
            String apiPath = "https://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=" + apiKey;

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiPath))
                    .build();

            HttpResponse<String> response = client
                    .send(request, BodyHandlers.ofString());

            String json = response.body();
            // System.out.println(json);

            // Gson
            // Gson gson = new Gson();
            // Title searchTitle = gson.fromJson(json, Title.class);

            
            TitleOmdb searchTitleOmdb = gson.fromJson(json, TitleOmdb.class);
            // System.out.println(searchTitleOmdb);
            try {
                Title searchTitle = new Title(searchTitleOmdb);
                System.out.println(searchTitle);
                System.out.println("Duração: " + searchTitle.getDurationInMinutes() + " min");

                // FileWriter searchLogs = new FileWriter("searchLogs.txt");
                // searchLogs.write(searchTitle.toString());
                // searchLogs.close();


                titles.add(searchTitle);
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca.");
            } catch (YearConversionErrorException e) {
                System.out.println("Algum erro de argumento na busca.");
            } catch (Exception e) { // Não faça isso.
                System.out.println("Algo inesperado deu errado.");
            }


            System.out.println(titles);


            FileWriter writeList = new FileWriter("movies.json");
            writeList.write(gson.toJson(titles));
            writeList.close();

            System.out.println("Programa finalizou corretamente");

            System.out.println();

            // sc.close();
        }
    }

    private static String apiKey = Params.apiKey;
}
