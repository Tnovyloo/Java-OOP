package zad1;
public class Trojkat extends Figura {
	double wys = 0, podst = 0;

	public Trojkat(double wys, double podst) {
		this.wys = wys;
		this.podst = podst;
	}
	
    public Trojkat(float wys, float podst, String kolor) {
        super(kolor);
        this.wys = wys;
        this.podst = podst;
    }

    @Override
    public String toString() {
        return "Trojkat:\nh = " + this.wys + "\na = " + this.podst;
    }
}