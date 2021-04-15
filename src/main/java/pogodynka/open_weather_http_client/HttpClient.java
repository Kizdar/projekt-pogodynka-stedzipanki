package pogodynka.open_weather_http_client;

import pogodynka.interaction.User;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClient {
    ReadFromFile readFromFile = new ReadFromFile();

    public URI openWeatherUri() throws Exception {
       User user = new User();
        String https ="";
        final  URI OPEN_WEATHER =
                URI.create(new StringBuilder(https)
                        .append("https://api.openweathermap.org/data/2.5/weather?q=")
                        .append( user.inputCityName())
                        .append("&appid=")
                        .append(readFromFile.readKeyFromFile())
                        .toString());
        return OPEN_WEATHER;
    }
    public String getResponseOpenWeather() throws Exception {

        java.net.http.HttpClient client = java.net.http.HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(openWeatherUri())
                .GET()
                .build();
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}

