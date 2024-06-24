package classPackage;

public class TestClass {
    static int a;
    static int b;
    static final double PI = 3.14;
    private int c;
    
    static {
        System.out.println("Initialization of fields");
        a = 10;
        b = 5;
        System.out.println("Initialized");
    }

    public static void counter() {
        // WE CANNOT USE THE NORMAL VARIABLE
        // System.out.println(c);
        // System.out.println(this.c);

        System.out.println(b);
        countToA();
    }

    private static void countToA() {
        for (int i = 0; i < a; i++) {
            System.out.println(i);
        }
    }
}
