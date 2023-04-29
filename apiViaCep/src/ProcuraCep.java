import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import exception.MinhaException;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ProcuraCep {

    public Endereco Procura(String cep) throws IOException, InterruptedException {
        String endereco = "https://viacep.com.br/ws/" + cep + "/json/";
        if (cep.length() > 8){
            throw new MinhaException("Cep invalido, por favor digite apenas 9 numeros");
        } else if (cep.length() < 8) {
            throw new MinhaException("Cep invalido, por favor digite o CEP com 9 numeros");
        }
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();


        MeuCep meuEndereco = gson.fromJson(json, MeuCep.class);
        Endereco meuCep = new Endereco(meuEndereco);
        System.out.println(meuCep);
        FileWriter writer = new FileWriter(meuEndereco.cep() + ".json");
        writer.write(gson.toJson(meuCep));
        writer.close();
        return meuCep;
    }
}
