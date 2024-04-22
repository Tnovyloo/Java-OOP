package zad1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class NameInputter {
    ArrayList<String> namesList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public NameInputter() {
        this.namesList = inputName();
        System.out.println(hasDuplicates());
    }
    
    public ArrayList<String> inputName() {
        System.out.println("Wpisz imiona (Oddziel je '-' pauzą): ");
        String namesString = this.scanner.nextLine();

        String[] namesStrings = namesString.split("-");
        ArrayList<String> namesList = new ArrayList<>();

        for (String name : namesStrings) {
            namesList.add(name.trim());
        }

        return namesList;
    } 

    public boolean hasDuplicates() {
        Set<String> uniqueNames = new HashSet<>();
        for (String name : this.namesList) {
            if (!uniqueNames.add(name)) {
                // From Docs:
                // Returns true if this set did not already contain the specified element
                System.out.println("Powtórzono: " + name + "\n Lista posiada te same imiona!");
                return true;
            }
        }
        System.out.println("Każde imie jest unikalne.");
        return false;
    };
    
}
