package pogodynka.forecast;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import pogodynka.open_weather_http_client.HttpClient;

public class OpenWeatherForecast extends OpenWeatherLocation{


    public Double getPressure() throws Exception {
        String myJSONString = json.getJson();
        JsonObject jsonObject = new Gson().fromJson(myJSONString, JsonObject.class);
        return Double.parseDouble(jsonObject.getAsJsonObject("main").get("pressure").toString());
    }

    public double getTemperature() throws Exception {
        String myJSONString = json.getJson();
        JsonObject jsonObject = new Gson().fromJson(myJSONString, JsonObject.class);
        String result = jsonObject.getAsJsonObject("main").get("temp").toString();
        return Double.parseDouble(result);
    }

    public double getHumidity() throws Exception {
        String myJSONString = json.getJson();
        JsonObject jsonObject = new Gson().fromJson(myJSONString, JsonObject.class);
        String result = jsonObject.getAsJsonObject("main").get("humidity").toString();
        return Double.parseDouble(result);
    }

    public double getWindSpeed() throws Exception {
        String myJSONString = json.getJson();
        JsonObject jsonObject = new Gson().fromJson(myJSONString, JsonObject.class);
        String result = jsonObject.getAsJsonObject("wind").get("speed").toString();
        return Double.parseDouble(result);
    }

    public double getCloudsInfo() throws Exception {
        String myJSONString = json.getJson();
        JsonObject jsonObject = new Gson().fromJson(myJSONString, JsonObject.class);
        String result = jsonObject.getAsJsonObject("clouds").get("all").toString();
        return Double.parseDouble(result);
    }

    public StringBuilder getForecast() throws Exception {
        String myJSONString = json.getJson();
        JsonObject jsonObject = new Gson().fromJson(myJSONString, JsonObject.class);
        try {
            StringBuilder forecast = new  StringBuilder("Temperatura = " + jsonObject.getAsJsonObject("main").get("temp").toString())
                    .append("\nCiśnienie = " + jsonObject.getAsJsonObject("main").get("pressure").toString())
                    .append("\nWiatr = " + jsonObject.getAsJsonObject("wind").get("speed").toString())
                    .append("\nPrzejrzystość = " + jsonObject.getAsJsonObject("clouds").get("all").toString())
                    .append("\nWilgotność = " + jsonObject.getAsJsonObject("main").get("humidity").toString());
            return forecast;
        } catch (Exception e) {
            return new StringBuilder("\"Takie miasto nie istnieje! ");
        }
    }
}