package zad3;
import zad3.Adress;

public class CreateAdresses {
    public void createAdressObjects(String city, String street, int number) {
        try {
            new Adress(city, street, number);
        } catch (Exception e) {
            System.out.println("Problem z utworzeniem klasy\n" + e);
        }
    }
}
