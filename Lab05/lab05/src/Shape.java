import java.lang.reflect.Field;

public class Shape {
    String nameOfShape;

    Shape(String name) {
        this.nameOfShape = name;
    }

    public void setNameOfShape(String nameOfShape) {
        this.nameOfShape = nameOfShape;
    }

    public String getNameOfShape() {
        return this.nameOfShape;
    }

    public double getArea() {
        System.out.println("Shape is not a specific figure to have a area method.");
        return 0;
    }

    public void printAllFields() {
        System.out.println("Printing all fields and values of " + this.getNameOfShape() + " Class");
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

        System.out.println();
    }
}
