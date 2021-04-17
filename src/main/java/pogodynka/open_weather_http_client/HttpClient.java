package pogodynka.open_weather_http_client;

import pogodynka.interaction.User;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClient {
    String upId = new ReadFromFile().readKeyFromFile();

    public URI openWeatherUri(String query) throws Exception {
       User user = new User();
        String https ="";
        final  URI OPEN_WEATHER =
                URI.create(new StringBuilder(https)
                        .append("https://api.openweathermap.org/data/2.5/weather?q=")
                        .append( query)
                        .append("&appid=")
                        .append(upId)
                        .toString());
        return OPEN_WEATHER;
    }
    public String getResponseOpenWeather(String query) throws Exception {

        java.net.http.HttpClient client = java.net.http.HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(openWeatherUri(query))
                .GET()
                .build();
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}

