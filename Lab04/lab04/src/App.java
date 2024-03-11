import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // exercise1();
        // exercise2();
        // exercise3();
        // exercise4();
        // exercise5();
        // exercise6();
        exercise7();
    }

    // Help functions
    public static int inputInteger(String inputValue) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj " + inputValue + ":");
        int value = input.nextInt();
        
        return value;
    }

    public static String inputString(String inputValue) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj " + inputValue + ":");
        String value = input.nextLine();
        return value;
    }

    public static int randomNumber(int a, int b) {
        Random randint = new Random();
        return randint.nextInt(a, b);
    }

    // Factorial help function for exercise 6
    public static int factorial(int a) {
        int temp = 1;
        for (int i = 1; i <= a; i++) {
            temp *= i;
        }
        return temp;
    }

    // Function for exercise1
    public static void exercise1() {
        // Create an array of inputted length
        int length = inputInteger("dlugosc tablicy");
        int[] array = new int[length];
        
        // Get user input for getting random numbers from a to b
        int a = inputInteger("przedzial od");
        int b = inputInteger("przedzial do");

        // Counted variables
        int average = 0;
        int sum = 0;

        // Exercise should implement two for loops, for 'i' and foreach. So i count average in foreach loop and sum in normal for 'i' loop.
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber(a, b);
            System.out.println(array[i]);
            sum += array[i];
        }

        for (int i : array) {
            average += i;
        }

        average /= length;
        System.out.println("Srednia to: " + average);
        System.out.println("Suma to: " + sum);
    }

    // Function for exercise 2
    public static void exercise2() {
        int length = inputInteger("dlugosc tablicy");
        System.out.println("");

        // Creating even length array and odd length array.
        int[] evenArray = new int[length % 2 == 0 ? length : length + 1];
        int[] oddArray = new int[length % 2 != 0 ? length : length + 1];

        // Filling arrays with i to proper index, and printing even index value.
        for (int i = 0; i < evenArray.length; i++) {
            evenArray[i] = i;
            System.out.println(evenArray[i]);
        }

        System.out.println("");

        for (int i = 0; i < oddArray.length; i++) {
            oddArray[i] = i;
            System.out.println(oddArray[i]);
        }
    }

    // Function for exercise 3
    public static void exercise3() {
        String[] stringArray = {"Fucha się trafiła, to bierzemy. Co To za Sztuka Skrecic Dwa Kabelki", "Bogdan, tu są trzy fazy.", "No to trzy kabelki, wielka mi różnica..."};

        for (String string : stringArray) {
            System.out.println(string.toUpperCase());
        }
    }

    // Function for exercise 4
    public static void exercise4() {
        // Fill string with user inputs.
        String[] stringArray = new String[5];

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = inputString("tekst");
        }

        // Reverse this array.
        int lastIndex = stringArray.length - 1;

        for (int i = 0; i < stringArray.length / 2; i++) {
            String tempString = stringArray[i];
            stringArray[i] = stringArray[lastIndex];
            stringArray[lastIndex] = tempString;
            lastIndex--;
        }

        // Printing reversed array.
        System.out.println("Tablica po odwroceniu.");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
        System.out.println("\n");

        // Print reversed word in reversed array.
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = stringArray[i].length() - 1; j >= 0; j--) {
                System.out.print(stringArray[i].charAt(j));
            }
            System.out.println("");
        }

    }

    public static void exercise5() {
        System.out.println("Sortowanie tablicy int.");

        int[] intArray = new int[8];
        // int[] intArray = {5, 3, 2, 6, 1, 9, 10};

        // Input values
        for (int i = 0; i < intArray.length; i++) {
            String inputText = "Tablica[" + i + "]";
            intArray[i] = inputInteger(inputText);
        }

        System.out.println("");

        // Sort algorithm
        // In nested for loop (second one) i start over int j = i and not from j = 0 so the result of this algorhitm was wrong ;P
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j + 1];
                    intArray[j + 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }

        // Print values in array.
        for (int i : intArray) {
            System.out.println(i);
        }
    }

    public static void exercise6() {
        int[] intArray = new int[8];
        
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = inputInteger("Wartosc");
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(factorial(intArray[i]));
        }
    }

    public static void exercise7() {
        // Input length of arrays and values.
        int lengthOfArrays = inputInteger("wielkosc porownywanych tablicy");

        String[] stringArray = new String[lengthOfArrays];
        String[] stringArray2 = new String[lengthOfArrays];

        System.out.println("Podaj wartosci dla tablicy 1");
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = inputString("slowo");
        }

        System.out.println("Podaj wartosci dla tablicy 2");
        for (int i = 0; i < stringArray2.length; i++) {
            stringArray2[i] = inputString("slowo");
        }

        // Check if arrays are the same.
        System.out.println("Porownuje tablice");
        
        boolean isTheSame = true;

        for (int i = 0; i < stringArray.length; i++) {
            if (!(Objects.equals(stringArray[i], stringArray2[i]))) {
                isTheSame = false;
                break;
            }
        }

        System.out.println("Czy sa takie same? " + isTheSame);
    }
}
