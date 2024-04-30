package zad1;

public abstract class Animal {

    public void printInfo() {
        System.out.println("Animal");
    }

    public void jumpTo() {
        System.out.println("Animal Jumping!");
    }

    public void jumpTo(String place) {
        System.out.println("Jumping at/on/to: " + place);
    }
    
}
