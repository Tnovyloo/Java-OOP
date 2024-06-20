import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // NWD(13, 169);
        primeNumber(100);
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
        if (a == 2) {
            System.out.println(a);
        }
        for (int i = 3; i < a; i++) {
            // Search for number dividors.
            List<Integer> dividorsArrayLists = new ArrayList<Integer>();

            for (int j = 1; j <= Math.sqrt(i); j++) {
            // for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    dividorsArrayLists.add(j);
                }
            }

            // System.out.println(i + " dividors: " + dividorsArrayLists);
            if (dividorsArrayLists.size() == 1) {
                System.out.println("Prime number: " + i);
            }
        }
    }
}
