package pogodynka.interaction;

import pogodynka.model.Location;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class User {
    Scanner input = new Scanner(System.in);

    public int inputIdOfCity() {
        System.out.println("Wpisz id miasta: ");
        return input.nextInt();
    }

    public String inputCityName() {
        System.out.println("Wpisz nazwę miasta : ");
        return input.nextLine();
    }

    public String inputCountry() {
        System.out.println("Wpisz kraj: ");
        return input.nextLine();
    }

    public double inputLongitude() {
        System.out.println("Wpisz długość: ");
        return input.nextDouble();
    }

    public double inputLatitude() {
        System.out.println("Wpisz szerokość: ");
        return input.nextDouble();
    }

    public Location getYourChoice() {
//        System.out.println("Wpisz dane lokalizacji: ");

        return new Location(inputIdOfCity(), inputCityName(), inputCountry(), inputLongitude(), inputLatitude());
    }
}


