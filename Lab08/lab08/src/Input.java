import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.IncorrectValueException;

public class Input {
    Scanner scanner = new Scanner(System.in);

    public int inputInteger() throws IncorrectValueException {
        System.out.println("Podaj liczbe calkowita: ");
        try {
            int x = this.scanner.nextInt();
            return x;
        } catch (InputMismatchException e) {
            throw new IncorrectValueException("Podano wartość, która nie może być liczbą!");
        }
    }

    public String inputString() {
        System.out.println("Podaj tekst: ");
        return this.scanner.nextLine();
    }

    public String inputString(String text) {
        System.out.println(text);
        return this.scanner.nextLine();
    }

    public int outputPositiveInteger() throws IncorrectValueException {
        System.out.println("Podaj liczbe calkowita: ");
        return Math.abs(this.inputInteger());
    }

    public int inputPositiveInteger() throws IncorrectValueException {
        System.out.println("Podaj liczbe calkowita nieujemna: ");

        try {
            int userInput = this.scanner.nextInt();
            if (userInput < 1) {
                throw new IncorrectValueException("Podano wartosc mniejsza niz 1");
            } else {
                return userInput;
            }
        } catch (InputMismatchException e) {
            throw new IncorrectValueException("Nie podano liczby.");
        }
    }
}
