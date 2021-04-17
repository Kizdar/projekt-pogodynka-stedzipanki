package pogodynka.forecast;

import pogodynka.interaction.User;
import pogodynka.open_weather_http_client.HttpClient;

public class Json {
    User user = new User();
    public String json;
    HttpClient client = new HttpClient();

    public String getJson() throws Exception {
        return json;
    }


    public void setJson() throws Exception {
        this.json = client.getResponseOpenWeather(user.inputCityName());
    }
}
