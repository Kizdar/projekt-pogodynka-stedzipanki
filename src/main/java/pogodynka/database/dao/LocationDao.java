package pogodynka.database.dao;

import pogodynka.model.Location;

import java.util.List;

public interface LocationDao {
    void save(Location location);
    Location findById (Long id);
    List<Location> findAll();
    void deleteById(Long id);
    List<Location> findByName (Location location);
}
