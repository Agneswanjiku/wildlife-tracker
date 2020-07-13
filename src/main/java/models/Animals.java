package models;

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


