package models;

import java.util.Objects;

public class Ranger {
    public String name;
    public int id;
    public  String Health;

    public  static String health;



@Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Ranger ranger = (Ranger) object;
        return id == ranger.id &&
                Objects.equals(name, ranger.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    public String getName() {
        return name ;
    }

    public int getId() {
        return id;
    }
}

