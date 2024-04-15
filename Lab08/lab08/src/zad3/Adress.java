package zad3;

import zad3.address_exceptions.IncorrectAdressException;

public class Adress {
    String city, street;
    int number;
    
    public Adress(String city, String street, int number) throws IncorrectAdressException {
        if (city == "" || city == null) {
            throw new IncorrectAdressException("Miasto nie powinno byc puste");
        } else if (street == "" || street == null) {
            throw new IncorrectAdressException("Ulica nie powinna byc pusta");
        } else if (number < 1) {
            throw new IncorrectAdressException("Numer domu/mieszkania nie powinien byc mnniejszy od 1");
        }
        System.out.println("Zainicjalizowano klase Adress poprawnie");
        this.city = city;
        this.street = street;
        this.number = number;
    }
}
