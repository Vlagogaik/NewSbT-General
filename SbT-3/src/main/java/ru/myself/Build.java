package ru.myself;

import java.util.Arrays;

import static ru.myself.AnimalConverter.convertPetToAnimal;

public class Build {
    public static void main(String[] args) throws Exception {
        Pet pet = new Pet("Рина", Status.AVAILABLE, Arrays.asList(
                new Photo("Рина жует воробья", "http://example.com/photo1.jpg"),
                new Photo("Рина дует ветер", "http://example.com/photo2.jpg")
        ));

        Animal animal = convertPetToAnimal(pet);
        System.out.println(animal.toString());
    }

}
