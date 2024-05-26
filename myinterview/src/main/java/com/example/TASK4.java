package com.example;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.credenciais.Credenciais;

/**
 * Create an implementation of a Rest API client.
 * Prints out how many records exists for each gender and save this file to s3 bucket
 * API endpoint=> https://3ospphrepc.execute-api.us-west-2.amazonaws.com/prod/RDSLambda 
 * AWS s3 bucket => interview-digiage
 *
 */
public class TASK4 {
public static String URL = "https://3ospphrepc.execute-api.us-west-2.amazonaws.com/prod/RDSLambda";
    public static String BUCKET = "interview-digiage";

    public static void main(String[] args) {
        try {
            String nomeArquivo = "registros.txt";
            URI uri = URI.create(URL);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(uri).build();
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            String jsonString = response.body();

            Pattern p = Pattern.compile("\"M\"");
            Matcher matcher = p.matcher(jsonString);
            int m = 0;
            while (matcher.find()){
                m++;
            }

            p = Pattern.compile("\"F\"");
            matcher = p.matcher(jsonString);
            int f = 0;
            while (matcher.find()){
                f++;
            }

            PrintWriter arquivo = new PrintWriter(nomeArquivo, "UTF-8");

            arquivo.println("Registros do gênero \"M\": " + m + 
                            "\nRegistros do gênero \"F\":  " + f );
            arquivo.close();

            BasicAWSCredentials credenciais = new BasicAWSCredentials(
                Credenciais.ACCESS_KEY,
                Credenciais.SECRET_KEY);

            AmazonS3 s3 = AmazonS3ClientBuilder
                        .standard()
                        .withCredentials(new AWSStaticCredentialsProvider(credenciais))
                        .withRegion(Regions.DEFAULT_REGION)
                        .build();

            String destino = "" + nomeArquivo;
            //s3.putObject(BUCKET, destino, nomeArquivo);

        } catch (IOException e){
            System.out.println(e.getMessage());
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}