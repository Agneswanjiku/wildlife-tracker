import java.sql.Timestamp;
import java.util.Objects;

public class Sighting {
    private String location;
    private String name;
    private int animalId;
    private int id;
    private String type;
    private String age;
    private String health;
    public Timestamp time_sighted;

    public Sighting(String name, String location, int animalId, String type) {
        this.location = location;
        this.name = name;
        this.animalId = animalId;
        this.type = type;
    }

    public static Object all() {
        return all();
    }


    public Timestamp getTime_sighted() {
        return time_sighted;
    }

    public Sighting(String name, String location, int animalId, String type, String age, String health) {
        this.location = location;
        this.name = name;
        this.animalId = animalId;
        this.type = type;
        this.age = age;
        this.health = health;
    }




    @Override
    public boolean equals(Object otherSighting) {
        if (this == otherSighting) return true;
        if (otherSighting == null || getClass() != otherSighting.getClass()) return false;
        Sighting sighting = (Sighting) otherSighting;
        return Objects.equals(location, sighting.location) &&
                Objects.equals(name, sighting.name);
    }

    public Object save() {
       return null; 
    }
}