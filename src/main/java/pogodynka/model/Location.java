package pogodynka.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Location")
public class Location {

    @OneToMany(mappedBy = "location", fetch = FetchType.EAGER)
    private Set<Weather> weathers = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name  = "city_name")
    private String name;

    private String country;
    private double longitude;
    private double latitude;

    public Location() {
    }

    public Set<Weather> getWeathers() {
        return weathers;
    }

    public Location(int id, String name, String country, Double longitude, Double latitude) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
}
