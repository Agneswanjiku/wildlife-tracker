package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalsTest {


    @Rule
    public DatabaseRule database = new DatabaseRule();

    @Test
    public void animals_instantiatesCorrectly_true() {
        Animals testAnimal = setUpNewAnimal();
        assertTrue(testAnimal instanceof Animals);
    }

    @Test
    public void getName_animalsInstantiatesWithName_true() {
        Animals testAnimal = setUpNewAnimal();
        assertEquals("Baboon", testAnimal.getName());

    }

    @Test
    public void returnsTrueIfNamesAreTheSame_true() {
        Animals testAnimal = setUpNewAnimal();
        Animals anotherAnimal = new Animals("Baboon");
        assertTrue(testAnimal.equals(anotherAnimal));
    }

//    @Test
//    public void save_insertsObjectIntoDatabase_true() {
//        Animals testAnimal = setUpNewAnimal();
//        testAnimal.save();
//        assertTrue(Animals.all().getName(0).equals(testAnimal));
//    }

//    @Test
//    public void all_returnsAllInstancesOfAnimals_true() {
//        Animals testAnimal = setUpNewAnimal();
//        testAnimal.save();
//        Animals secondAnimal = new Animals("Lion");
//        secondAnimal.save();
//        assertEquals(true,Animals.all().get(0).equals(testAnimal));
//        assertEquals(true, Animals.all().get(1).equals(secondAnimal));
//    }

//    @Test
//    public void save_assignsIdToObject_true() {
//        Animals testAnimal = setUpNewAnimal();
//        testAnimal.save();
//        Animals savedAnimal = (Animals) Animals.all().get(0);
//        assertEquals(testAnimal.getId(),savedAnimal.getId());
//
//    }

//    @Test
//    public void find_returnsAnimalWithSameId() {
//        Animals testAnimal = setUpNewAnimal();
//        testAnimal.save();
//        Animals anotherAnimal = new Animals("Dog");
//        anotherAnimal.save();
//        assertEquals(Animals.find(anotherAnimal.getId()),anotherAnimal);
//    }




    public Animals setUpNewAnimal(){
        return new Animals ("Baboon");
    }

    @Test
    public void all() {
    }

    @Test
    public void find() {
    }

    @Test
    public void testEquals() {
    }

    @Test
    public void save() {
    }

    @Test
    public void getAnimalType() {
    }

    @Test
    public void getName() {
    }

    @Test
    public void getId() {
    }

    @Test
    public void getType() {
    }

    @Test
    public void testSave() {
    }
}