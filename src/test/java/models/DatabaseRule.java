package models;
import org.sql2o.*;
import org.junit.rules.ExternalResource;

public class DatabaseRule extends ExternalResource {
    @Override
    protected void before() {
        DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", "moringa", "@aGNES1234");
    }
    @Override
    protected void after() {
        try(Connection con = DB.sql2o.open()) {
            String deleteAnimalsQuery = "DELETE FROM animals *;";
//            String deleteSightingQuery = "DELETE FROM sightings *;";
//            String deleteEndangeredAnimalQuery = "DELETE FROM endangeredanimals *;";
//            String deleteJoinsQuery = "DELETE FROM endangeredanimals_animals *";
            con.createQuery(deleteAnimalsQuery).executeUpdate();
//            con.createQuery(deleteSightingQuery).executeUpdate();
//            con.createQuery(deleteEndangeredAnimalQuery).executeUpdate();
//            con.createQuery(deleteJoinsQuery).executeUpdate();
        }
    }
}
