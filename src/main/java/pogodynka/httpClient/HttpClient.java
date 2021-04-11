package pogodynka.httpClient;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClient {

    private static final URI OPEN_WEATHER =
            URI.create("https://api.openweathermap.org/data/2.5/weather?q=London&appid=38d62a1915e8917528881f48e4995ce0");

    public String getOpenWeather() throws Exception {

        java.net.http.HttpClient client = java.net.http.HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(OPEN_WEATHER)
                .GET()
                .build();
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
