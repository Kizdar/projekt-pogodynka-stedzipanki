package pogodynka.forecast;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import pogodynka.httpClient.HttpClient;

public class ConstantOpenWeatherForecast {
    HttpClient client = new HttpClient();

    public String getInfo() throws Exception {
        String myJSONString = client.getOpenWeather();
        JsonObject jobj = new Gson().fromJson(myJSONString, JsonObject.class);
        return jobj.get("main").toString();

    }

    public String getPressure() throws Exception {
        JsonObject jobj2 = new Gson().fromJson(getInfo(), JsonObject.class);
        return jobj2.get("pressure").toString();

    }

    public String getTemperature() throws Exception {
        JsonObject jobj2 = new Gson().fromJson(getInfo(), JsonObject.class);
        return jobj2.get("temp").toString();

    }

    public String getHumidity() throws Exception {
        JsonObject jobj2 = new Gson().fromJson(getInfo(), JsonObject.class);
        return jobj2.get("humidity").toString();

    }

    public String getWindInfo() throws Exception {
        String myJSONString = client.getOpenWeather();
        JsonObject jobj = new Gson().fromJson(myJSONString, JsonObject.class);
        return jobj.get("wind").toString();

    }

    public String getCloudsInfo() throws Exception {
        String myJSONString = client.getOpenWeather();
        JsonObject jobj = new Gson().fromJson(myJSONString, JsonObject.class);
        return jobj.get("clouds").toString();
    }
}