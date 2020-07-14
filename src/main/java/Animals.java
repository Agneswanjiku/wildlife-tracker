import org.sql2o.Connection;

public class Animals {
    public String name;
    public int id;

    public String type;    public static final String ANIMAL_TYPE = "Common";


    public Animals(String name){
        if(name.equals("")){
            throw new IllegalArgumentException("Please enter an animal name.");
        }
        this.name = name;

        this.type = ANIMAL_TYPE;
        this.id = id;

    }

    public static Object all() {
        return all();
    }

    public static int find(int animalId) {
        return animalId;
    }

    public void save(){
        try(Connection con = DB.sql2o.open()) {
            String sql = "INSERT INTO animals (name,type) VALUES (:name,:type)";
            this.id = (int) con.createQuery(sql,true)
                    .addParameter("name",this.name)
                    .addParameter("type",this.type)
                    .throwOnMappingFailure(false)
                    .executeUpdate()
                    .getKey();


        }
    }



public String getName() {

        return name;
}

    public int getId() {

        return id;
    }



    public String getType() {

        return type;
    }



}


