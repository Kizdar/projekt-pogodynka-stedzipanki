package pogodynka.forecast;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import pogodynka.httpClient.HttpClient;

public class OpenWeatherLocation {
    HttpClient client = new HttpClient();

    public String getCityName() throws Exception {
        String myJSONString = client.getOpenWeather();
        JsonObject jobj = new Gson().fromJson(myJSONString, JsonObject.class);
        return jobj.get("name").toString();
    }
    public String getCityCoordinates()  throws Exception {
        String myJSONString = client.getOpenWeather();
        JsonObject jobj = new Gson().fromJson(myJSONString, JsonObject.class);
        return jobj.get("coord").toString();
    }
}
