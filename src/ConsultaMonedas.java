import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMonedas {
    public MonedasApi convertirMonedasConMonto(String monedaBase,
                                               String monedaDestino,
                                               double monto){


       URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" +
               "1ac8ba2dec5a7ca6c79b7463/pair/"+monedaBase+"/"+monedaDestino+"/"+monto);



        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());


            return new Gson().fromJson(response.body(),MonedasApi.class) ;

        } catch (IOException |InterruptedException e) {
            System.out.println("❌ Error al conectar con la API: " + e.getMessage());
        } catch ( Exception e) {
            throw new RuntimeException("Hubo un error "+e);

        }
        return null;


    }

}
