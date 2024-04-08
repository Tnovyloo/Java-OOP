package zad1;

public class Plane extends Fly {
    public void printPlane() {
        System.out.println("Boeing");
    }

    @Override
    public void makeItFly() {
        System.out.println("Let it go...");
    }
}
