package zad1;
public class Okrag extends Figura {
    Point srodek;
    double r;

    public Okrag() {
        this.srodek = new Point();
        this.r = 0;
    }

    public Okrag(Point point, double r) {
        this.srodek = point;
        this.r = r;
    }

    public Okrag(Point point, double r, String kolor) {
        super(kolor);
        this.point = point;
        this.r = r;
    }

    public double getPowierzchnia() {
        return Math.PI * Math.pow(this.r, 2);
    }

    public double getSrednica() {
        return r * 2;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR(double r) {
        return this.r;
    }

    public boolean isPointIn(Point point) {
        return Math.pow((point.x - this.srodek.x), 2) + Math.pow((point.y - this.srodek.y), 2) <= this.r * this.r ? true : false; 
    }

    public String toString() {
        return "Punkt: " + this.srodek + "\nr = " + this.r;
    }
}
