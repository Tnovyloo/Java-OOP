package zad1;

public class Prostokat extends Figura {
	double wys = 0, szer = 0;
	
	public Prostokat(double wys, double szer) {
		this.wys = wys;
		this.szer = szer;
	}

    public Prostokat(float wys, float szer, String kolor) {
        super(kolor);
        this.wys = wys;
        this.szer = szer;
    }

    public double getPowierzchnia() {
        return (szer * wys);
    }
    
    public void przesun(float x, float y) {
        this.szer += x;
        this.wys += y;
    }

    public double getX() {
        return this.szer;
    }
    
    public double getY() {
        return this.wys;
    }
}