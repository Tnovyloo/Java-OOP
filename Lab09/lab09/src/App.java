import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import zad1.NameInputter;
import zad2.PartnersName;
import zad3.EventParticipant;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Exercise 1
        // NameInputter nameInputter = new NameInputter();

        // Exercise 2
        // System.out.println("Podaj liczbe par");
        // Integer count = scanner.nextInt();
        // PartnersName partnersName = new PartnersName(count);

        // Exercise 3
        ArrayList<EventParticipant> participants = new ArrayList<>();

        EventParticipant firstPerson = new EventParticipant(20, 1, "Thomas");
        EventParticipant secondPerson = new EventParticipant(20, 1, "Thomas");
        EventParticipant thirdPerson = new EventParticipant(4, 2, "Uma");

        participants.add(firstPerson);
        participants.add(secondPerson);
        participants.add(thirdPerson);

        // Just checkin' if equals method works properly.
        if (firstPerson.equals(secondPerson)) {
            System.out.println("Hello");
            firstPerson.hashCode();
            secondPerson.hashCode();
        } else {
            System.out.println("This is not the same.");
        }

        // Method to filter users that age is less than 18 years.
        Iterator<EventParticipant> iterator = participants.iterator();
        while (iterator.hasNext()) {
            EventParticipant eventParticipant = iterator.next();
            if (eventParticipant.hashCode() < 18) {
                iterator.remove();
            }
        }

        for (EventParticipant eventParticipant : participants) {
            System.out.println(eventParticipant);
        }


        // Exercise 4
        EventParticipant[] paritcipantsList = {
            new EventParticipant(20, 15, "Renata Blis"),
            firstPerson,
            secondPerson,
            thirdPerson,
        };

        List<EventParticipant> paritcipantsList1 = new ArrayList<>(Arrays.asList(paritcipantsList));


        // Exercise 5
        List<Integer> firstList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            firstList.add(i);
        }
        System.out.println(firstList);

        List<Integer> secondList = new ArrayList<>();
        for (int i = firstList.size(); i >= 0; i--) {
            secondList.add(firstList.get(i));
        }
    }
}
