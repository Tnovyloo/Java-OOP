import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zad1.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Maps
        // Exercise 1
        Kangaroo kangaroo = new Kangaroo(1);
        Kangaroo kangaroo1 = new Kangaroo(2);
        Kangaroo kangaroo2 = new Kangaroo(3);
        Kangaroo kangaroo3 = new Kangaroo(4);
        Kangaroo kangaroo4 = new Kangaroo(5);
        Kangaroo kangaroo5 = new Kangaroo(6);
        Kangaroo kangaroo6 = new Kangaroo(7);
        Kangaroo kangaroo7 = new Kangaroo(8);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(kangaroo);
        animalList.add(kangaroo1);
        animalList.add(kangaroo2);
        animalList.add(kangaroo3);
        animalList.add(kangaroo4);
        animalList.add(kangaroo5);

        for (Animal animal : animalList) {
            animal.jumpTo("B2");
        }

        for (int i = 0; i < animalList.size(); i++) {
            Animal iteratedAnimal = animalList.get(i);
            iteratedAnimal.jumpTo("b3");
        }
        
        Map<String, Animal> animalOwners = new HashMap<>();
        List<String> names = new ArrayList<>();
        names.add("Maciek");names.add("Karol");names.add("Agnieszka");names.add("Wojtek");names.add("Olek");names.add("Kacper");names.add("Roman");

        for (Animal animal : animalList) {
            try {
                Kangaroo currentKangaroo = (Kangaroo) animal;
                String kangarooOwner = names.get(currentKangaroo.kangarooID);

                animalOwners.put(kangarooOwner, currentKangaroo);
            } catch (Exception e) {
                if (e instanceof ClassCastException) {
                    System.out.println("Cannot cast animal to Kangaroo.");
                }
                if (e instanceof IndexOutOfBoundsException) {
                    System.out.println("Index is beyond namelist mindset hehe");
                }
            }
        }

        System.out.println(animalOwners);


    }
}
