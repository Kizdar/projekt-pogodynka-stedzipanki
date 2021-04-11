package pogodynka.forecast;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import pogodynka.httpClient.HttpClient;

public class ConstantOpenWeatherForecast {
    HttpClient client = new HttpClient();

    private String getTemp() throws Exception {

        String myJSONString = client.getOpenWeather();
        JsonObject jobj = new Gson().fromJson(myJSONString, JsonObject.class);

        String result = jobj.get("coord").toString();
        System.out.println("Dane potrzebne to : " + result);

        JsonObject jobj2 = new Gson().fromJson(result, JsonObject.class);
        String result2 = jobj2.get("lon").toString();
        System.out.println();
        System.out.println("lon = " + result2);
        return null;
    }
}
