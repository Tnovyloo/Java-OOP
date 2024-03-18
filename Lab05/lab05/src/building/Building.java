package building;

import java.lang.reflect.Field;
import java.time.LocalDate;

/**
 * Building
 */
public class Building {
    int year, floors;
    String name;

    public Building(int year, int floors, String name) {
        this.year = year;
        this.floors = floors;
        this.name = name;
    }

    public void printAllFields() {
        this.getClass().getDeclaredFields();

        for (Field field : this.getClass().getDeclaredFields()) {
            // This line of code allows accessing private fields.
            field.setAccessible(true);
            System.out.println(field + ":");
            try {
                Object value = field.get(this);
                System.out.println(field.getName() + ": " + value);
            } catch (Exception e) {
                System.out.println("Cannot access field: " + field.getName());
            }
        }

        int buildingAge = LocalDate.now().getYear() - year;
        System.out.println("Wiek budynku to:" + buildingAge);

        System.out.println();
    }
    
}