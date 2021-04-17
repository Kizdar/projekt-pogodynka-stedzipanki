package pogodynka.database.dao_implementation;

import pogodynka.database.dao.WeatherDao;
import pogodynka.model.Weather;

import java.util.List;

public class WeatherDaoImplementation implements WeatherDao {
    private double temperature;
    private double pressure;
    private double wind;
    private int clouds;
    private int humidity;


    @Override
    public void save(Weather weather) {

    }

    @Override
    public Weather findById(Long id) {
        return null;
    }

    @Override
    public List<Weather> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Weather> findByName(Weather weather) {
        return null;
    }
}
