
import pogodynka.forecast.OpenWeatherForecast;
import pogodynka.forecast.OpenWeatherLocation;
import pogodynka.interaction.User;
import pogodynka.open_weather_http_client.HttpClient;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {

        OpenWeatherLocation weatherLocation = new OpenWeatherLocation();
        User user = new User();
        HttpClient client = new HttpClient();
        OpenWeatherForecast forecast = new OpenWeatherForecast();

        System.out.println("Witaj w programie Pogodynka - aplikacji do wyświetlania pogody!)");
        System.out.println(forecast.getForecast());




    }
}


