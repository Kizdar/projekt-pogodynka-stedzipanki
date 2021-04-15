import pogodynka.forecast.ConstantOpenWeatherForecast;
import pogodynka.forecast.OpenWeatherLocation;
import pogodynka.interaction.User;
import pogodynka.model.Location;
import pogodynka.open_weather_http_client.HttpClient;
import pogodynka.open_weather_http_client.ReadFromFile;


public class Main {
    public static void main(String[] args) throws Exception {
        HttpClient client = new HttpClient();
        ConstantOpenWeatherForecast forecast = new ConstantOpenWeatherForecast();
        OpenWeatherLocation location = new OpenWeatherLocation();



        startApp(location.getCityName(),forecast.getForecast()); //Rozpoczęcie programy od podania pogody miasta rzeszów

   //     System.out.println(forecast.getInfo());
//        System.out.println(forecast.getTemperature());
//        System.out.println(forecast.getHumidity());
//        System.out.println(forecast.getPressure());
//        System.out.println(location.getCityName());
//        System.out.println(location.getCityCountry());
//        System.out.println(location.getCityCoordinates());
//        System.out.println(forecast.getForecast());
//        System.out.println(client.getResponseOpenWeather());
//


        User user = new User();
        user.inputCityName();
//        Location lokalizacja = user.getYourChoice();
//        System.out.println("Wybrałeś pogodę dla miejscowości: " + lokalizacja.getName());
    }
    public static void startApp(String city,StringBuilder wather){
        System.out.println("Witaj w programie Pogodynka - aplikacji do wyświetlania pogody :)");
        System.out.print("Aktualna pogoda dla miasta: ");
        System.out.print(city);
        System.out.println(wather);

    }
    public  static void showWeather(){

    }

}
