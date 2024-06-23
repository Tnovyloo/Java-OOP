import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        // LCG(12, 13, 7, 0);
        // System.out.println(fibonacciSequence(10));
        
        listTestFunction();
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
        List<Integer> randomNumbers = new ArrayList<Integer>();

        int x = seed;
        int lastResult = 0;
        do {
            x = (multipler * (lastResult + gain)) % mod;
            lastResult = x;
            randomNumbers.add(x);
        } while (x != seed);

        System.out.println(randomNumbers);
    }

    public static int fibonacciSequence(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciSequence(n-1) + fibonacciSequence(n-2);
        }
    }


    public static void listTestFunction() {
        // function for fun with arraylists

        List<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 3, 5, 3, 9, 8, 11, 45, 21, 42, 1, 3, 34, 0, 1, 423, 501));
        
        // Reverse arrayList 
        List<Integer> arrayListCopy = new ArrayList<>();

        for (int i = arrayList.size() -1; i >= 0; i--) {
            arrayListCopy.add(arrayList.get(i));
        }
        System.out.println("Original list:" + arrayList + "\nReversed list: " + arrayListCopy);

        // Sorting list
        for (int i = 0; i < arrayListCopy.size() - 1; i++) {
            for (int j = i + 1; j < arrayListCopy.size(); j++) {
                int iNumber = arrayListCopy.get(i);
                int jNumber = arrayListCopy.get(j);
                if (iNumber > jNumber) {
                    arrayListCopy.set(j, iNumber);
                    arrayListCopy.set(i, jNumber);
                }
            }
        }

        System.out.println("Sorted arraylist by insert sorting alghorithm " + arrayListCopy);

        // Numbers counter
        // HashMap<Integer, Integer> bucketHashMap = new HashMap<>();

        // Counter for same integers in ArrayList.
        // for (int i = 0; i < arrayList.size(); i++) {
        //     if (bucketHashMap.get(arrayList.get(i)) == null) {
        //         bucketHashMap.put(arrayList.get(i), 1);
        //     } else {
        //         int value = bucketHashMap.get(arrayList.get(i));
        //         bucketHashMap.put(arrayList.get(i), value + 1);
        //     }
        // }
        // System.out.println(bucketHashMap);


        // Cubesort

        // Create buckets from 0 to max(arraylist)
        HashMap<Integer, Integer> bucketMaxHashMap = new HashMap<>();
        System.out.println(arrayList);

        int maxNumber = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) > maxNumber) {
                maxNumber = arrayList.get(i);
            }
        }

        for (int i = 0; i <= maxNumber; i++) {
            bucketMaxHashMap.put(i, 0);
        }

        // for (int i = 0; i < arrayList.size(); i++) {
        //     bucketMaxHashMap.put(arrayList.get(i), bucketMaxHashMap.get(i) + 1);
        // }

        for (int i = 0; i < arrayList.size(); i++) {
            int value = bucketMaxHashMap.get(arrayList.get(i));
            bucketMaxHashMap.put(arrayList.get(i), value + 1);
        }

        for (Map.Entry<Integer, Integer> entry : bucketMaxHashMap.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.println(entry);
            }
        }
        // System.out.println(bucketMaxHashMap);

    }
}
