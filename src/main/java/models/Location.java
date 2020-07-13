package models;

public class Location {
    private String name;
    private int id;


    public String getName() {
        return name;
    }



    public Location(int id, String name) {
        this.id = id;
        this.name = name;


    }

    public int getId() {
        return id;
    }

}
