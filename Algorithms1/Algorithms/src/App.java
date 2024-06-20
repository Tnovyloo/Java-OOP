public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        NWD(13, 169);
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
}
