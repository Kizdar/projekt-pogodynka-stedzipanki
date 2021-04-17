import pogodynka.forecast.Json;
import pogodynka.forecast.OpenWeatherForecast;
import pogodynka.forecast.OpenWeatherLocation;
import pogodynka.interaction.User;
import pogodynka.model.Location;
import pogodynka.open_weather_http_client.HttpClient;
import pogodynka.open_weather_http_client.ReadFromFile;


public class Main {
    public static void main(String[] args) throws Exception {
  //      HttpClient client = new HttpClient();
        System.out.println("Witaj w programie Pogodynka - aplikacji do wyświetlania pogody :)");
        OpenWeatherForecast forecast = newJson();



       startApp(forecast.getCityName(),forecast.getForecast()); //Rozpoczęcie programy od podania pogody miasta rzeszów




    }
    public static void startApp(String city,StringBuilder wather) throws Exception {
      //  System.out.println("Witaj w programie Pogodynka - aplikacji do wyświetlania pogody :)");
      //  System.out.println("Proszę wpisać miasto:");
       // newJson();
        System.out.print("Aktualna pogoda dla miasta: ");
        System.out.print(city);
        System.out.println(wather);

    }
    public  static void showWeather(){

    }

    private static OpenWeatherForecast newJson() throws Exception {
        OpenWeatherForecast forecast = new OpenWeatherForecast();
        forecast.setJson();

        return forecast;
    }

}
