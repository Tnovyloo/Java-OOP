import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        // exercise0();
        // exercise1();
        // exercise2();
        // exercise3();
        // exercise4();
        exercise5();
    }

    // Help function
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

    // Function for testing arrays
    public static void exercise0() {
        // One dimension array.
        // double[] data = new double[10];
        int[] arrayInt = {1, 2, 3, 4, 5};
        System.out.println("Dlugosc arrayInt: " + arrayInt.length);

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(i);
        }

        // Matrix
        // int[][] matrixA = new int[3][4];

        int[][] matrixB = {
            {1, 2, 3, 4, 5},
            {5, 4, 3, 2, 1}
        };

        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB.length; j++) {
                System.out.println(matrixB[i][j]);
            }
        }
    }

    // Function for first exercise - counting average of students points.
    public static void exercise1() {
        int numberOfStudents = inputInteger("liczbe studentów");

        // In college terms there is a rule that minimum number of students should not be less than 15.
        if (numberOfStudents >= 15) {
            // Creating an Array for studentsData
            double[] studentsData = new double[numberOfStudents];

            // For loop for inputting integers into our array.
            for (int i = 0; i < numberOfStudents; i++) {
                String inputText = "student[" + i + "]";
                studentsData[i] = inputInteger(inputText);
            }

            // Alghoritm for getting an average grade of students.
            double averageGrade = 0;

            // Doing it by for loop
            // for (int i = 0; i < studentsData.length; i++) {
            //     averageGrade += studentsData[i];
            // }

            // Doing it by while loop
            int i = 0;
            while (i < studentsData.length) {
                averageGrade += studentsData[i];
                i++;
            }

            averageGrade /= numberOfStudents;

            System.out.println("Srednia ocena studentów: " + averageGrade);
        }
    }

    // Function for exercise2 - input 10 values and sum negative and positive numbers
    public static void exercise2() {
        int[] inputtedData = new int[10];

        int positiveNumbersSum = 0, negativeNumbersSum = 0;

        for (int i = 0; i < inputtedData.length; i++) {
            String inputText = "Tablica[" + i + "]";
            int inputtedInteger = inputInteger(inputText);
            inputtedData[i] = inputtedInteger;

            // Check if inputtedInteger is less than 0;
            if (inputtedInteger < 0) {
                negativeNumbersSum += inputtedInteger;
            } else {
                positiveNumbersSum += inputtedInteger;
            }
        }

        // Print counted data.
        System.out.println("Suma liczb mniejszych od 0:" + negativeNumbersSum);
        System.out.println("Suma liczb wiekszych od 0:" + positiveNumbersSum);
    }

    // Function for exercise3 - 
    public static void exercise3() {
        // Assign inputted size of data into array.
        int sizeOfData = inputInteger("wielkosc tablicy");
        int[] inputtedData = new int[sizeOfData <= 0 ? 1 : sizeOfData];

        // Input user data into array
        for (int i = 0; i < inputtedData.length; i++) {
            String inputText = "data[" + i + "]";
            inputtedData[i] = inputInteger(inputText);
        }
        
        // ALghoritm for counting sum of even numbers.
        int sumOfEven = 0;
        for (int i = 0; i < inputtedData.length; i++) {
            if (inputtedData[i] % 2 == 0) {
                sumOfEven += inputtedData[i];
            }
        }
        
        System.out.println("Suma liczb parzystych w twoim ciagu to:" + sumOfEven);
    }

    // Function for exercise4 - get random numbers
    public static void exercise4() {
        // Assign inputted size of data into array using short if statement
        int sizeOfData = inputInteger("wielkosc tablicy");
        int[] inputtedData = new int[sizeOfData <= 0 ? 1 : sizeOfData];

        Random generator = new Random();
        
        // Input user data into array and count even numbers.
        int sumOfEven = 0;
        for (int i = 0; i < inputtedData.length; i++) {
            int randomNumber = generator.nextInt(-10, 45);
            inputtedData[i] = randomNumber;
            System.out.println("Liczba losowa to: " + randomNumber);
            // Count only even values in array
            if (randomNumber % 2 == 0) {
                sumOfEven += randomNumber;
            }
        }

        System.out.println("Suma losowych liczb parzystych z przedzialu -10; 45 to: " + sumOfEven);
    }

    // Function for checking if inputted String is a palindrome
    public static void exercise5() {
        String inputtedString = inputString("słowo aby sprawdzić czy jest palindromem");
        inputtedString = inputtedString.toLowerCase();

        boolean isPalindrome = true;
        int i = 0;
        int j = inputtedString.length() - 1;
        while (i < j) {
            if (inputtedString.charAt(i) != inputtedString.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        System.out.println("Czy slowo jest palindromem? " + isPalindrome);
    }

}
