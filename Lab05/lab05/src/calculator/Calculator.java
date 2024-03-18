package calculator;
import java.util.Scanner;

public class Calculator {
    public void start() {

        boolean choice = true;

        while (choice) {
            System.out.println("Wybierz rodzaj figury\n" +
            "1 - Kwadrat\n" + 
            "2 - Prostokat\n" + 
            "3 - Koło\n" + 
            "4 - Trójkąt\n" + 
            "5 - Sześcian\n" +
            "6 - Prostopadłościan\n" + 
            "7 - Kula\n" + 
            "8 - Stożek\n" +
            "0 - EXIT");
            int userInput = inputInt("");

            switch (userInput) {
                case 0:
                    choice = false;
                    break;

                case 1:
                    System.out.println("Wybrano kwadrat");
                    Square square = new Square(inputString("nazwę kwadratu"), inputDouble("a"));
                    printShape(square);
                    break;
                
                case 2:
                    System.out.println("Wybrano prostokąt");
                    Rectangle rectangle = new Rectangle(inputString("nazwe prostokatu"), inputDouble("a"), inputDouble("b"));
                    printShape(rectangle);
                    break;

                case 3:
                    System.out.println("Wybrano koło");
                    Circle circle = new Circle(inputString("nazwe koła"), inputDouble("r"));
                    printShape(circle);
                    break;

                case 4:
                    System.out.println("Wybrano trójkąt");
                    Triangle triangle = new Triangle(inputString("nazwe trojkata"), inputDouble("a"), inputDouble("b"), inputDouble("h"));
                    printShape(triangle);
                    break;

                case 5:
                    System.out.println("Wybrano szescian");
                    Cube cube = new Cube(inputString("nazwe szescianu"), inputDouble("a"));
                    printShape(cube);
                    break;

                case 6:
                    System.out.println("Wybrano prosopadloscian");
                    Cuboid cuboid = new Cuboid(inputString("nazwe prostopadloscianu"), inputDouble("a"), inputDouble("b"), inputDouble("c"));
                    printShape(cuboid);
                    break;

                case 7:
                    System.out.println("Wybrano kule");
                    Sphere sphere = new Sphere(inputString("nazwe kuli"), inputDouble("r"));
                    printShape(sphere);
                    break;

                case 8:
                    System.out.println("Wybrano stozek");
                    Cone cone = new Cone("nazwe stozka", inputDouble("r"), inputDouble("h"));
                    printShape(cone);
                    break;

                default:
                    break;
            }
        }

        // Triangle triangle = new Triangle("Triangle", 2.5, 5, 8);

        // System.out.println("Hello! initializing triangle");
        // System.out.println(triangle.getNameOfShape());
        // triangle.printAllFields();

        // Square square = new Square("Square", 5);
        // square.printAllFields();
        // square.getArea();

        // Rectangle rectangle = new Rectangle("Rectangle", 10, 5);
        // rectangle.printAllFields();
        // rectangle.getArea();

        // rectangle.setNameOfShape("Red Rectangle");
        // rectangle.printAllFields();

        // Cube cube = new Cube("Cuuube", 10);
        // cube.getArea();
        // cube.printAllFields();

        // Circle circle = new Circle("Blue circle", 5);
        // circle.getArea();
        // circle.printAllFields();

        // Sphere sphere = new Sphere("Black sphere", 4.5);
        // sphere.getArea();
        // sphere.printAllFields();

        // Cone cone = new Cone("Green Cone", 3.5, 6.2);
        // cone.getArea();
        // cone.printAllFields();

        // Cuboid cuboid = new Cuboid("Yellow cuboid", 5.3, 1, 6.2);
        // cuboid.getArea();
        // cuboid.printAllFields();
    }

    public void printShape(Shape shape) {
        shape.getArea();
        shape.printAllFields();
    }

    public double inputDouble(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj " + name + ": ");
        return scanner.nextDouble();
    }

    public int inputInt(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj " + name + ": ");
        return scanner.nextInt();
    }

    public String inputString(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj " + name + ": ");
        return scanner.nextLine();
    }
}
