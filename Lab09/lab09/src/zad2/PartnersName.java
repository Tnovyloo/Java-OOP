package zad2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PartnersName {
    ArrayList<ArrayList<String>> partnersList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public PartnersName(Integer count) {
        for (int i = 0; i < count; i++) {
            inputNames();
        }

        System.out.println("Lista ludzi:");
        System.out.println(this.partnersList);

        System.out.println("Podaj imię i podam Ci partnera tej osoby.");
        String userInput = this.scanner.nextLine();
        findPartnerName(userInput);

    }

    public void inputNames() {
        System.out.println("Podaj imie pierwszej osoby: ");
        String firstPerson = this.scanner.nextLine();
        System.out.println("Podaj imie drugiej osoby: ");
        String secondPerson = this.scanner.nextLine();

        ArrayList<String> partners = new ArrayList<>(Arrays.asList(firstPerson, secondPerson));

        this.partnersList.add(partners);
        System.out.println(partners);   
    }

    public void findPartnerName(String searchedName) {
        System.out.println("Znalezione pary z imionem jednego parnera: " + searchedName);
        for (ArrayList<String> namesArray : this.partnersList) {
            if (namesArray.contains(searchedName)) {
                System.out.println(namesArray);
            }
        }
    }
}
