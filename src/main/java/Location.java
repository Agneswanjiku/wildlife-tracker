import org.sql2o.Connection;

import java.util.List;

public class Location {
    private String name;
    private int id;





    public Location(int id, String name) {
        this.id = id;
        this.name = name;


    }


    public static List <Location> all() {
        String sql = "SELECT * FROM locations  ORDER BY id ASC";
        try(Connection con = DB.sql2o.open()){
            return con.createQuery(sql).executeAndFetch(Location.class);
        }
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
