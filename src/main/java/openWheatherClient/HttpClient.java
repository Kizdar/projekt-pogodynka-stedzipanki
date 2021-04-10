package openWheatherClient;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClient {
    public static void main(String[] args) throws Exception {
        System.out.println(getLoremIpsum());
    }

    private static final URI LOREM_URI =
            URI.create("https://api.openweathermap.org/data/2.5/weather?q=London&appid=38d62a1915e8917528881f48e4995ce0");

    private static String getLoremIpsum() throws Exception {

        java.net.http.HttpClient client = java.net.http.HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(LOREM_URI)
                .GET()
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}

