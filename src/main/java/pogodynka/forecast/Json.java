package pogodynka.forecast;

import pogodynka.open_weather_http_client.HttpClient;

public class Json {
    public String json;
    HttpClient client = new HttpClient();

    public String getJson() throws Exception {
        return json;
    }


    public void setJson() throws Exception {
        this.json = client.getResponseOpenWeather();
    }
}
