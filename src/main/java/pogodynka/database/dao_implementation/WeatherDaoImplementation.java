package pogodynka.database.dao_implementation;

public class WeatherDaoImplementation {
    private double temperature;
    private double pressure;
    private double wind;
    private int clouds;
    private int humidity;

    public WeatherDaoImplementation(double temperature, double pressure, double wind, int clouds, int humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.wind = wind;
        this.clouds = clouds;
        this.humidity = humidity;
    }

    public WeatherDaoImplementation() {
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getWind() {
        return wind;
    }

    public void setWind(double wind) {
        this.wind = wind;
    }

    public int getClouds() {
        return clouds;
    }

    public void setClouds(int clouds) {
        this.clouds = clouds;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
