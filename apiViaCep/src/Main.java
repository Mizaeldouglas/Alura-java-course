import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import exception.MinhaException;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        ProcuraCep procuraCep = new ProcuraCep();

        try {
            System.out.print("Buscar CEP: ");
            procuraCep.Procura(sc.nextLine());
        } catch (MinhaException | IOException | InterruptedException  e) {
            System.out.println(e.getMessage());
        }catch (JsonSyntaxException e){
            System.out.println(e.getMessage());
            throw new JsonSyntaxException("Cep invalido, digite apenas numeros!");
        }

    }
}