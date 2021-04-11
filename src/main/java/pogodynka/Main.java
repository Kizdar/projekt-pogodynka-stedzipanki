package pogodynka;

import pogodynka.forecast.ConstantOpenWeatherForecast;
import pogodynka.forecast.OpenWeatherLocation;
import pogodynka.interaction.User;
import pogodynka.model.Location;


public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Witaj w programie Pogodynka - aplikacji do wyświetlania pogody :)");
        User user =  new User();
        Location lokalizacja = user.getYourChoice();
        System.out.println("Wybrałeś pogodę dla miejscowości: " + lokalizacja.getName());







        ConstantOpenWeatherForecast weatherForecast = new ConstantOpenWeatherForecast();
        weatherForecast.getTemperature();


    }


}
