import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Exercise 1
        // delta();

        // Exercise 2
        // calculator();

        // Exercise 3
        // arrayExercise();

        // Exercise 4
        // arrayExerciseNext();

        // Exercise 5;
        // showExerciseNumbers();

        // Exercise 6;
        // infiniteUserInterface();

        // Exercise 7;
        sortUserList();

    }
    
    // Help functions
    public static double inputDouble(char inputValue) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj " + inputValue + ":");
        double value = input.nextDouble();

        return value;
    }

    public static int inputInteger(String inputValue) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj " + inputValue + ":");
        int value = input.nextInt();
        
        return value;
    }
    
    // function for excercise 1
    public static void delta() {
        Scanner input = new Scanner(System.in);

        double a = inputDouble('a');
        double b = inputDouble('b');
        double c = inputDouble('c');

        double delta = b * b - (4*a*c);

        System.out.println("Delta = " + delta);
        double x1 = (b + Math.sqrt(delta)) / 2*a;
        double x2 = (-b + Math.sqrt(delta)) / 2*a;
        System.out.println("x1 = " + x1 + "\n" + "x2 = " + x2);
    }


    // fucntion for excercise 2
    public static void calculator() {
        boolean input = true;

        while (input) {
            System.out.println("Oblicz:\n[0] - wylacz program\n[1] - sumę\n[2]- rożnicę\n[3] - iloczyn\n[4] - iloraz\n[5] - potege\n[6] - pierwiastek \n[7] - wartosci sin(x)");
            int userChoice = inputInteger("działanie które chcesz wykonać");
            int a;
            int b;

            switch (userChoice) {
                case 0:
                    input = false;
                    break;
                case 1:
                    a = inputInteger("a");
                    b = inputInteger("b");
                    System.out.println("Wynik sumy to:" + (a + b));

                    break;
                case 2:
                    a = inputInteger("a");
                    b = inputInteger("b");
                    System.out.println("Wynik rożnicy to:" + (a - b));
                    break;
                case 3:
                    a = inputInteger("a");
                    b = inputInteger("b");
                    System.out.println("Wynik iloczynu to:" + (a * b));
                    break;
                case 4:
                    a = inputInteger("a");
                    b = inputInteger("b");
                    System.out.println("Wynik ilorazu to:" + (a / b));
                    break;
                case 5:
                    a = inputInteger("a");
                    b = inputInteger("b");
                    System.out.println("Wynik potegi to:" + (Math.pow(a, b)));
                    break;
                case 6:
                    a = inputInteger("a");
                    b = inputInteger("b");
                    System.out.println("Wynik pierwiastka to:" + (a * (1 / b) ));
                    break;
                case 7:
                    a = inputInteger("a");
                    System.out.println("Wynik sin(a) to:" + Math.sin(a));
                    break;
                default:
                    break;
            }
        }
    }

    // function for excercise 3:
    public static void arrayExcercise() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        boolean input = true;

        System.out.println("Podaj liczby, bedą one wpisane do tablicy");
        for (int i = 0; i < 10; i++) {
            int x = inputInteger("");
            numbers.add(x);
        }

        do {

            System.out.println("0 - wylacz\n1 - wszystkie\n2 - od ostatniego do pierwszego\n3 - nieparzyste indeksy\n4 - parzyste indeksy");
            int userChoice = inputInteger("wybor uzytkownika");
            
            switch (userChoice) {
                case 0:
                    input = false;
                    break;

                case 1:
                    System.out.println("Wyświetlam wszystkie elementy:");
                    for (Integer element : numbers) {
                        System.out.println(element);
                    }
                    break;

                case 2:
                    System.out.println("Wyświetlam tablice od ostatniego do pierwszego indeksu");
                    for (int i = numbers.size() - 1; i >= 0; i--) {
                        System.out.println(numbers.get(i));
                    }
                    break;

                case 3:
                    System.out.println("Wyświetlam nieparzyste indeksy");
                    for (int i = 0; i < numbers.size(); i++) {
                        if (i % 2 != 0) {
                            System.out.println(numbers.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Wyświetlam elementy o parzystych indeksach");
                    for (int i = 0; i < numbers.size(); i++) {
                        if (i % 2 == 0) {
                            System.out.println(numbers.get(i));
                        }
                    }
                    break;

                default:
                    break;
            }
            
        } while (input);


    }


    // Method for exercise 4
    public static void arrayExerciseNext() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        boolean input = true;

        System.out.println("Podaj liczby, bedą one wpisane do tablicy");
        for (int i = 0; i < 10; i++) {
            int x = inputInteger("");
            numbers.add(x);
        }

        do {

            System.out.println("0 - wylacz\n1 - suma\n2 - iloczyn\n3 - srednia\n4 - minimalna\n5 - maksymalna");
            int userChoice = inputInteger("wybor uzytkownika");
            
            switch (userChoice) {
                case 0:
                    input = false;
                    break;

                case 1:
                    int suma = 0;
                    
                    for (Integer element : numbers) {
                        suma += element;
                    }

                    System.out.println("Suma tej listy to: " + suma);
                    break;

                case 2:
                    int iloczyn = 1;
                    
                    for (Integer element : numbers) {
                        iloczyn *= element;
                    }

                    System.out.println("Iloczyn tej listy to: " + iloczyn);
                    break;

                case 3:
                    double srednia = 0;

                    for (Integer element : numbers) {
                        srednia += element;
                    }

                    System.out.println("Srednia to: " + (srednia / numbers.size()));
                    break;

                case 4:
                    int min = numbers.get(0);    

                    for (Integer element : numbers) {
                        if (element < min) {
                            min = element;
                        }
                    }

                    System.out.println("Minimalna to: " + min);
                    break;
                
                case 5:
                    int max = numbers.get(0);
                    for (Integer element : numbers) {
                        if (element > max) {
                            max = element;
                        }
                    }

                    System.out.println("Maksymalna to: " + max);
                    break;

                default:
                    break;
            }
            
        } while (input);

    }


    // Method for exercise 5
    public static void showExerciseNumbers() {
        ArrayList<Integer> numbers = new ArrayList<Integer>() {
            {
                add(2);
                add(6);
                add(9);
                add(15);
                add(19);
            }
        };

        for (int i = 0; i <= 20; i++) {
            if (numbers.contains(i)) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }

    // Method for exercise 6
    public static void infiniteUserInterface() {
        boolean continueProgram = true;
        
        while (continueProgram) {
            int userInput = inputInteger("wartosc");
            System.out.println(userInput);
            if (userInput < 0) {
                continueProgram = false;
            } else {
                continueProgram = true;
            }
        }
    }

    // Method for exercise 7
    public static void sortUserList() {
        ArrayList<Integer> userList = new ArrayList<>();
        int n = inputInteger("wielkosc tablicy");

        for (int i = 0; i < n; i++) {
            String text = "wartosc dla indeksu " + i;
            userList.add(inputInteger(text));
        }

        // Sorting alghoritm 
        n = userList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (userList.get(j) > userList.get(j + 1)) {
                    // Swap arr[j] and arr[j+1]
                    Collections.swap(userList, j, j + 1);
                }
            }
        }

        System.out.println(userList);
    }
}
