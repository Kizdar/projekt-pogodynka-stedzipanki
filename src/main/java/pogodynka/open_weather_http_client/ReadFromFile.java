package pogodynka.open_weather_http_client;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {

    public String readKeyFromFile() {
        String cosTam = null;
        try {
            FileReader fileReader = new FileReader("myKey.txt");
            Scanner scanner = new Scanner(fileReader);
            cosTam = scanner.nextLine();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cosTam;
    }
}
