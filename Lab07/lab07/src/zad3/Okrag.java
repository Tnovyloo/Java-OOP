package zad3;

public class Okrag extends Figura implements RuchFigury {

    double r;
    Punkt punkt;

    public Okrag(double r, Punkt punkt) {
        this.r = r;
        this.punkt = punkt;
    }

    public void przesun() {
        System.out.println("Przesuniecie figury");
    }

    // Nie musimy juz implementowac tych Metod (mozemy je jedynie overridowac), sa one 
    // zaimplementowane juz w naszej klasie abstrakcyjnej w Figurze
    @Override
    public boolean wPolu(Punkt p) {
        // TODO Auto-generated method stub
        System.out.println("Override funkcji wPolu dla klasy Okrag");
        return false;
    }

    // @Override
    // public float getPowierzchnia() {
    //     // TODO Auto-generated method stub
    //     return super.getPowierzchnia();
    // }
}
