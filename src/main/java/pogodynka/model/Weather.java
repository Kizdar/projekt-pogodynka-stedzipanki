package pogodynka.model;

public class Weather {

    private double temperature;
    private double pressure;
    private double wind;
    private double clouds;

    public Weather(double temperature, double pressure, double wind, double clouds) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.wind = wind;
        this.clouds = clouds;
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

    public double getClouds() {
        return clouds;
    }

    public void setClouds(double clouds) {
        this.clouds = clouds;
    }

    @Override
    public String toString() {
        return "Weather: " +
                "temperature =" + temperature +
                ", pressure =" + pressure +
                ", wind =" + wind +
                ", clouds =" + clouds +
                '}';
    }
}
