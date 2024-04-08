package zad2;

public class Fish extends Animal {
    public void printFish(){
        System.out.println("Rybbbbba!");
    }

    public void immerge() {
        System.out.println("Immerges like a dolphin ;D");
    }

    public void surface() {
        System.out.println("Just in case that something exists above water surface");
    }

    public void eat() {
        System.out.println("I hope that is not any hook.");
    }

    @Override
    public void excretion() {
        System.out.println("Overriding excretion");
    }

    @Override
    public void swim() {
        System.out.println("Swim like a kid in a candy store");
    }
}
