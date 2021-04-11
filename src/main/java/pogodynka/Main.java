package pogodynka;

import pogodynka.forecast.ConstantOpenWeatherForecast;
import pogodynka.forecast.OpenWeatherLocation;
import pogodynka.interaction.User;


public class Main {
    public static void main(String[] args) throws Exception {

        OpenWeatherLocation location = new OpenWeatherLocation();
        System.out.println("Witaj w programie Pogodynka - aplikacji do wyświetlania pogody :)");
        User user =  new User();
        user.getYourChoice();
        System.out.println("Wybrałeś pogodę dla miejscowości: " + location.getCityName());

        ConstantOpenWeatherForecast weatherForecast = new ConstantOpenWeatherForecast();
        weatherForecast.getTemperature();


    }


}
