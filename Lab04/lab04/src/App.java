import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // exercise1();
        exercise2();
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
        
    }
}
