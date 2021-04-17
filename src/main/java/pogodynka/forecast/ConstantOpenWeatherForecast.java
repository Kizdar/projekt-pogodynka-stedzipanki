package pogodynka.forecast;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import pogodynka.open_weather_http_client.HttpClient;

public class ConstantOpenWeatherForecast extends OpenWeatherLocation {
    HttpClient client = new HttpClient();
//    Json json = new Json();
//
//
//    public void setJson() throws Exception {
//        json.setJson();
//    }

    public String getInfo() throws Exception {
        String myJSONString = json.getJson();
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
        String myJSONString = json.getJson();
        JsonObject jobj = new Gson().fromJson(myJSONString, JsonObject.class);
        return jobj.get("wind").toString();
    }

    public String getCloudsInfo() throws Exception {
        String myJSONString = json.getJson();
        JsonObject jobj = new Gson().fromJson(myJSONString, JsonObject.class);
        return jobj.get("clouds").toString();
    }

    public StringBuilder getForecast() throws Exception {
        return new StringBuilder("\n")
                .append("Temperatura = " + getTemperature()+"'F")
                .append("\nCiśnienie = " + getPressure()+" hPa")
                .append("\nWilgotność = " + getHumidity()+"%")
                .append("\nPrzejrzystość = " + getCloudsInfo())
                .append("\nSiła wiatru = " + getWindInfo());
    }
}