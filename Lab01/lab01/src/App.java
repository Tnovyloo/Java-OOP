import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Podaj wartosc a;");
//        int a = input.nextInt();
//        System.out.printf("Podaj wartosc b;");
//        int b = input.nextInt();
//
//        System.out.println("Podaj wartosc imienia");
//        String imie = input.next();

//        System.out.println((a + b) + " " + imie);

        // Zadanie 1
        int returnedAge = returnAge(11);
        String firstName = returnFirstName("Tomasinho");

        System.out.println(returnedAge + firstName);

        // Zadanie 2
        double x = inputDouble();
        double y = inputDouble();

        calculator(x, y);

        // Zadanie 3
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + checkIfEven(i));
        }

        // Zadanie 4
        for (int i = 0; i <= 15; i++) {
            System.out.println(i + " " + checkIfBuzz(i));
        }

        // Zadanie 5
        System.out.println(powTo3(3));
        System.out.println(powTo3(5));

        // Zadanie 6
        System.out.println(returnDoubleSqrt(4));

        // Zadanie 7
        System.out.println(returnIfTriangle(5, 4, 3));

        Random rand = new Random();

        int inputtedA = inputInteger();
        int inputtedB = inputInteger();

        int a = rand.nextInt(inputtedA, inputtedB);
        int b = rand.nextInt(inputtedA, inputtedB);
        int c = rand.nextInt(inputtedA, inputtedB);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println(returnIfTriangle(a, b, c));

    }
//    Metoda do zwracania booleana jesli mozemy stworzyc trojkat
    public static boolean returnIfTriangle(int a, int b, int c) {
        return a * a == (b * b) + (c * c);
    }


//    Metoda do zwracania pierwiastka
    public static double returnDoubleSqrt(double a) {
        return Math.sqrt(a);
    }

    public static int returnAge(int age) {return age;}

//    Funkcja do zwracania zmiennej typu String
    public static String returnFirstName(String firstName) {return firstName;}

//    Funkcja Kalkulator
    public static void calculator(double a, double b) {
        System.out.println("a + b=" + (a+b));
        System.out.println("a - b=" + (a+b));
        System.out.println("a * b=" + (a*b));
        System.out.println("a / b=" + (a/b));
        System.out.println("a % b=" + (a%b));
    }

//

//    Funkcja do zwracania wartosci boolean.
    public static boolean checkIfEven(int a) {
        return a % 2 == 0;
    }

//    Funkcja w sumie to fizz buzz xD
    public static boolean checkIfBuzz(int a) {
        return a % 5 == 0 && a % 3 == 0;
    }

//    Napisz metode ktora jako argument przyjmuje liczbe iz warca go podniesionego do 3 potegi.
    public static double powTo3(int a) {
        return Math.pow(a, 3);
    }

//    Metoda do wczytwania z klawiatury
    public static double inputDouble(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        return input.nextDouble();
    }

    public static int inputInteger(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita: ");
        return input.nextInt();
    }

}
