package pogodynka.database.dao;

import pogodynka.model.Location;
import pogodynka.model.Weather;

import java.util.List;

public interface WeatherDao {
    void save(Weather weather);
    Weather findById (Long id);
    List<Weather> findAll();
    void deleteById(Long id);
    List<Weather> findByName (Weather weather);
}
