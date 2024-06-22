import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // NWD(13, 169);
        // primeNumber(100);
        // primeFactorization(513);
        // primeFactorization(422312);
        // primeFactorization(1233);
        // primeFactorization(123);
        // primeFactorization(12);
        // primeFactorization(1);
        // primeFactorization(44100);
        LCG(12, 13, 7, 0);
    }


    public static void NWD(int a, int b) {
        while (a != b) {
            if (a < b) {
                b -= a;
            } else {
                a -= b;
            }
        }

        System.out.println(a);
    }

    public static void primeNumber(int a) {
        // Function for generating prime numbers.
        if (a == 2) {
            System.out.println(a);
        }
        for (int i = 3; i < a; i++) {
            // Search for number dividors.
            List<Integer> dividorsArrayLists = new ArrayList<Integer>();

            // for (int j = 1; j <= Math.sqrt(i); j++) { 
            for (int j = 1; j <= i-1; j++) {
                if (i % j == 0) {
                    dividorsArrayLists.add(j);
                    // break;
                }
            }

            // System.out.println(i + " dividors: " + dividorsArrayLists);
            if (dividorsArrayLists.size() == 1) {
                System.out.println("Prime number: " + i);
            }
        }
    }

    public static void primeFactorization(int a) {
        List<Integer> factorsArrayList = new ArrayList<Integer>();
        boolean itterate = true;
        if (a == 0) {
            itterate = false;
            factorsArrayList.add(1);
        }

        while (itterate) {
            int factor = 2;
            int currentNumber = a;
            boolean itterate2 = true;
            while (itterate2) {
                System.out.println(currentNumber + " " + factor);
                if (currentNumber % factor == 0) {
                    currentNumber /= factor;
                    factorsArrayList.add(factor);
                } else if (currentNumber / factor == 1 || currentNumber == 1){
                    itterate2 = false;
                    itterate = false;
                    break;
                } else {
                    factor += 1;
                }
            }
        }

        System.out.println(factorsArrayList);
    }

    public static void LCG(int mod, int multipler, int gain, int seed) {
        // pseudorandom number linear congruential generator
        int x = seed;
        int lastResult = 0;
        do {
            x = (multipler * (lastResult + gain)) % mod;
            lastResult = x;
            System.out.println(x);
        } while (x != seed);

    }
}
