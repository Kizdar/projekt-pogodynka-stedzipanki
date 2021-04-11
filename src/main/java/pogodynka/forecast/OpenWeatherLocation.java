package pogodynka.forecast;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import pogodynka.open_weather_http_client.HttpClient;

public class OpenWeatherLocation {
    HttpClient client = new HttpClient();


    public String getCityName() throws Exception {
        String myJSONString = client.getResponseOpenWeather();
        JsonObject jobj = new Gson().fromJson(myJSONString, JsonObject.class);
        return jobj.get("name").toString();
    }

    public String getCityCoordinates()  throws Exception {
        String myJSONString = client.getResponseOpenWeather();
        JsonObject jobj = new Gson().fromJson(myJSONString, JsonObject.class);
        return jobj.get("coord").toString();
    }

    public String getCityCountry() throws Exception {
        String myJSONString = client.getResponseOpenWeather();
        JsonObject jobj = new Gson().fromJson(myJSONString, JsonObject.class);
        String result = jobj.get("sys").toString();

        JsonObject jobj2 = new Gson().fromJson(result, JsonObject.class);
        return jobj2.get("country").toString();
    }

}
