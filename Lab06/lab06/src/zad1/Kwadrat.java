package zad1;

public class Kwadrat extends Prostokat {

    public Kwadrat(float wys, float szer, String kolor) {
        super(wys, szer, kolor);
    }

    public void setX(float x) {
        this.szer = x;
    }

    public void setY(float y) {
        this.wys = y;
    }

    public double getX() {
        return this.szer;
    }
    
    public double getY() {
        return this.wys;
    }

    @Override
    public String opis() {
        return "Hello from overrided Opis function";
    }
}
