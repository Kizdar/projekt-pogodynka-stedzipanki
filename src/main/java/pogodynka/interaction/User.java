package pogodynka.interaction;

import pogodynka.forecast.OpenWeatherLocation;
import pogodynka.model.Location;

import java.util.Scanner;

public class User {
    Scanner input = new Scanner(System.in);

    public String inputIdOfCity() throws Exception {
        System.out.println("Wpisz id miasta: ");
        String id = input.nextLine();
        return id;
    }

    public String inputCityName() throws Exception {
        System.out.println("Wpisz nazwę miasta: ");
        String miasto = input.nextLine();
        return miasto.trim();
    }
    public String inputCountry() throws Exception{
        System.out.println("Wpisz kraj: ");
        String kraj = input.nextLine();
        return kraj;
    }

    public double inputLongitude() throws Exception {
        System.out.println("Wpisz długość: ");
        double longitude = input.nextDouble();
        return longitude;
    }

    public double inputLatitude() throws Exception {
        System.out.println("Wpisz szerokość: ");
        double latitude = input.nextDouble();
        return latitude;
    }


    public Location getYourChoice() throws Exception {
//        System.out.println("Wpisz dane lokalizacji: ");

        return new Location(inputIdOfCity(), inputCityName(),inputCountry(),inputLongitude(),inputLatitude() );
    }


}


