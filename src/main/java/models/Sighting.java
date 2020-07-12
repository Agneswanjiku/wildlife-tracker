package models;

import java.sql.Timestamp;

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
    }  public Timestamp getTime_sighted() {
        return time_sighted;
    }

    public Sighting(String name, String location, int animalId, String type, String age, String health){
        this.location = location;
        this.name = name;
        this.animalId = animalId;
        this.type = type;
        this.age = age;
        this.health = health;
    }

}
