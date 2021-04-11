import pogodynka.forecast.ConstantOpenWeatherForecast;

public class Main {
    public static void main(String[] args) throws Exception {
        ConstantOpenWeatherForecast forecast = new ConstantOpenWeatherForecast();
//        System.out.println(forecast.getInfo());
//        System.out.println(forecast.getTemperature());
//        System.out.println(forecast.getHumidity());
        System.out.println(forecast.getPressure());
    }
}
