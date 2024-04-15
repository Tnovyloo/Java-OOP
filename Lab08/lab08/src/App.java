import exceptions.IncorrectValueException;
import zad1.SqrtCalculator;
import zad2.FactorialCalculator;
import zad3.Adress;
import zad3.CreateAdresses;

public class App {
    public static void main(String[] args) throws Exception {
        // To make this program more complex and better we should persist in SOLID principles.
        // For making this exercises i created an Input class that catches all user Input errors.
        Input input = new Input();
        
        // Exercise 1
        new SqrtCalculator(input.inputInteger());
        
        // Exercise 2
        try {
            System.out.println(FactorialCalculator.factorial(input.inputPositiveInteger()));   
        } catch (IncorrectValueException e) {
            System.out.println("Obsluga wlasnego Exception");
            System.out.println(e);
        }
        
        // Exercise 3
        CreateAdresses createAdresses = new CreateAdresses();
        createAdresses.createAdressObjects("Hello", "Hello", 3);
        createAdresses.createAdressObjects(null, null, 0);
        createAdresses.createAdressObjects("string", "", 3);
        createAdresses.createAdressObjects(null, "string", 3);
        createAdresses.createAdressObjects("string", "string", -5);
    }

}
