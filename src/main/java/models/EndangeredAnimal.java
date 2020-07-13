package models;
class EndangeredAnimal extends Animals {
    private String health;
    private String age;
    private String type;

    public static final String ANIMAL_TYPE = "Endangered";


    public EndangeredAnimal(String name, String health, String age) {
        super(name);
        if (name.equals("") || health.equals("") || age.equals("")) {
            throw new IllegalArgumentException("Please input all fields as required");
        }
        this.health = health;
        this.age = age;
        type = ANIMAL_TYPE;
    }
}
