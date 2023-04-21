package ru.myself;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalConverter {

    public static Animal convertPetToAnimal(Pet pet) throws Exception {
        Class<?> petClass = pet.getClass();
        Field nameField = petClass.getDeclaredField("name");
        nameField.setAccessible(true);
        String name = (String) nameField.get(pet);

        Field statusField = petClass.getDeclaredField("status");
        statusField.setAccessible(true);
        Status status = (Status) statusField.get(pet);

        Field photosListField = petClass.getDeclaredField("photosList");
        photosListField.setAccessible(true);
        List<Photo> photosList = (List<Photo>) photosListField.get(pet);

        Animal animal = new Animal();

        Field titleField = animal.getClass().getDeclaredField("title");
        titleField.setAccessible(true);
        titleField.set(animal, name);

        Field isAvailableField = animal.getClass().getDeclaredField("isAvailable");
        isAvailableField.setAccessible(true);
        isAvailableField.setBoolean(animal, status == Status.AVAILABLE);

        Field isSoldField = animal.getClass().getDeclaredField("isSold");
        isSoldField.setAccessible(true);
        isSoldField.setBoolean(animal, status == Status.SOLD);

        Field photosMapField = animal.getClass().getDeclaredField("photosMap");
        photosMapField.setAccessible(true);
        Map<String, String> photosMap = new HashMap<>();
        for (Photo photo : photosList) {
            photosMap.put(photo.getName(), photo.getURL());
        }
        photosMapField.set(animal, photosMap);

        return animal;
    }
}


