package zad3;

public class Prostokat extends Figura {
	int wys = 0;
	int szer = 0;
	
	public Prostokat(int wys,int szer,String kolor){
		this.wys = wys;
		this.szer = szer;
		super.kolor = kolor;
	}

	// Abstrakcyjne metody
	public String opis() {
		return "Prostokat o wymiarach: " + szer + " x " + wys;
	}

	public void skaluj(float skala) {
		System.out.println("Powierzchnia przed:" + this.szer * this.wys);
		this.szer *= skala;
		this.wys *= skala;
		System.out.println("Powierzchnia po:" + this.szer * this.wys);
	}

	// Implementowanie metod IFigura.
	public float getPowierzchnia() {
		return this.wys * this.szer;
	}

	public boolean wPolu(Punkt p) {
		super.wPolu(p);
		System.out.println("Implementowanie wPolu (Prostokat)");
		return true;
	}
}