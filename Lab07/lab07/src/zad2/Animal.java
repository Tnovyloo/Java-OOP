package zad2;

public abstract class Animal implements Flying, Swimming {

    public void swim() {
        System.out.println("Its probably true that i could swim.");
    };

    public void immerge() {};
    
    public void surface() {};

    public void fly() {};

    public void land() {};

    public void excretion() {
        System.out.println("Eating more fiber helps out with that.");
    };
}
