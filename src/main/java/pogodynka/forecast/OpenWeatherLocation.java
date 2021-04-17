package pogodynka.forecast;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import pogodynka.open_weather_http_client.HttpClient;

public class OpenWeatherLocation {
Json json = new Json();

    public void setJson() throws Exception {
        json.setJson();
    }

    public String getCityName() throws Exception {
        String myJSONString = json.getJson();
        JsonObject jobj = new Gson().fromJson(myJSONString, JsonObject.class);
        return jobj.get("name").toString();
    }

    public double getLatitude() throws Exception {
        String myJSONString = json.getJson();
        JsonObject jobj = new Gson().fromJson(myJSONString, JsonObject.class);
        String result = jobj.getAsJsonObject("coord").get("lat").toString();
        return Double.parseDouble(result);
    }

    public double getLongitude() throws Exception {
        String myJSONString = json.getJson();
        JsonObject jobj = new Gson().fromJson(myJSONString, JsonObject.class);
        String result = jobj.getAsJsonObject("coord").get("lon").toString();
        return Double.parseDouble(result);
    }

    public String getCityCountry() throws Exception {
        String myJSONString = json.getJson();
        JsonObject jobj = new Gson().fromJson(myJSONString, JsonObject.class);
        return jobj.getAsJsonObject("sys").get("country").toString();
    }

}
