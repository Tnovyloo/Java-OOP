import java.util.ArrayList;
import java.util.List;

import zad1.*;
import zad2.*;

// We have to import this directly from Class File because 
// it imports wrong Classes that dont extends Figura abstract class
import zad3.Trojkat;
import zad3.Figura;
import zad3.IFigura;
import zad3.Okrag;
import zad3.Punkt;
import zad3.Prostokat;
import zad3.Kwadrat;

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
        Kwadrat kwadrat = new Kwadrat(2, "Niebieski");
        Trojkat trojkat = new Trojkat(6, 3, "A");
        Prostokat prostokat = new Prostokat(2, 1,"a");
        Okrag okrag = new Okrag(2, new Punkt(2, 5));

        ArrayList<Figura> typyFigur = new ArrayList<>();

        typyFigur.add(prostokat);
        typyFigur.add(trojkat);
        typyFigur.add(kwadrat);
        typyFigur.add(okrag);

        for (Figura figura : typyFigur) {
            System.out.println(figura.opis());
            figura.skaluj(4);
            System.out.println("Testowanie getPowierzchnia, i wPolu");
        }

        for (Figura figura : typyFigur) {
            System.out.println(figura.getPowierzchnia());
            System.out.println(figura.wPolu(new Punkt(0, 0)));
        }

        okrag.przesun();

    }
}
