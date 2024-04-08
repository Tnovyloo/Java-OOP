import java.util.ArrayList;

import zad1.*;
import zad2.*;
import zad3.*;
import zad3.Figura;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Abstract class Fly for Plane.
        Plane plane = new Plane();
        plane.printPlane();
        plane.makeItFly();

        Ship ship = new Ship();
        ship.flowFarAway();

        // Fish extends Animal class that implements Flying and Swimming.
        Fish fish = new Fish();
        fish.printFish();
        fish.swim();
        fish.immerge();
        fish.land();
        fish.surface();
        fish.excretion();
        fish.eat();

        // Exercise 3
        Prostokat prostokat = new Prostokat(2.5, 1.5);
        Kwadrat kwadrat = new Kwadrat(2, 2, "Niebieski");
        Trojkat trojkat = new Trojkat(6, 3);
        Punkt punkt = new Punkt(5, 3);

        System.out.println(prostokat.getX() + " " + prostokat.getY() + " " + prostokat.getKolor() + " " + prostokat.getPowierzchnia());
        System.out.println(kwadrat.getKolor() + " " + kwadrat.getPowierzchnia());
        System.out.println(trojkat.getKolor());
        
        System.out.println(prostokat.opis());

        ArrayList<Object> typyFigur = new ArrayList<>();
        typyFigur.add(prostokat);
        typyFigur.add(trojkat);

        System.out.println("XD");
        for (Object object : typyFigur) {
            System.out.println(object);
        }
    }
}
