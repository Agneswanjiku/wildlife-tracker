package models;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;
class endangeredAnimalTest {

    @Rule
    public DatabaseRule database = new DatabaseRule();
    private String name;

    @Test
    public void animals_instantiatesCorrectly_true() {
        endangeredAnimal testEndangered = setUpNewEndangered();
        assertTrue(testEndangered instanceof endangeredAnimal);
    }

    @Test
    public void getName_animalsInstantiatesWithName_true() {
        endangeredAnimal testEndangered = setUpNewEndangered();
        assertEquals("Baboon", testEndangered.getName(name));

    }

//    @Test
//    public void returnsTrueIfNamesAreTheSame_true() {
//        endangeredAnimal testEndangered = setUpNewEndangered();
//        endangeredAnimal anotherEndangered = new endangeredAnimal("Baboon","healthy","adult");
//        assertTrue(testEndangered.equals(anotherEndangered));
//    }

//    @Test
//    public void save_insertsObjectIntoDatabase_true() {
//        endangeredAnimal testEndangered = setUpNewEndangered();
//        testEndangered.save();
//        System.out.println(testEndangered);
//        assertTrue(endangeredAnimal.getAll().get(0).equals(testEndangered));
//    }

//    @Test
//    public void getAll_returnsAllInstancesOfAnimals_true() {
//        endangeredAnimal testEndangered = setUpNewEndangered();
//        testEndangered.save();
//        endangeredAnimal secondEndangered = new endangeredAnimal("Lion","ill","newborn");
//        secondEndangered.save();
//        assertEquals(true,endangeredAnimal.getAll().get(0).equals(testEndangered));
//        assertEquals(true, endangeredAnimal.getAll().get(1).equals(secondEndangered));
//    }

//    @Test
//    public void save_assignsIdToObject_true() {
//        endangeredAnimal testEndangered = setUpNewEndangered();
//        testEndangered.save();
//        endangeredAnimal secondEndangered = (endangeredAnimal) endangeredAnimal.getAll().get(0);
//        assertEquals(testEndangered.getId(),secondEndangered.getId());
//
//    }












    public endangeredAnimal setUpNewEndangered(){
        return new endangeredAnimal ("Baboon","ill","adult");
    }


    private static class endangeredAnimal {
        private String name;

        public endangeredAnimal(String baboon, String ill, String adult) {
        }

        public static void getAll() {
            assertEquals(0);
        }

        private static void assertEquals(int i) {
        }

        public String getName(String name) {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void save() {
        }

//        public double getId() {
//            return id;
//        }

//        public void setId(double id) {
//            this.id = id;
//        }
    }
}