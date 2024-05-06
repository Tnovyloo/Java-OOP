package zad1;

import java.util.Scanner;

public class Inputter {
    Scanner scanner = new Scanner(System.in);

    // Returns String
    public String inputString() {
        String userText = scanner.nextLine();
        // scanner.close();
        return userText;
    }
}
