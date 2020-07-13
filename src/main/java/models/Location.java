package models;
import java.util.List;
import java.util.Objects;

public class Location {
    private String name;
    private int id;





    public Location(int id, String name) {
        this.id = id;
        this.name = name;


    }




public String getName() {
    return name;
}

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
