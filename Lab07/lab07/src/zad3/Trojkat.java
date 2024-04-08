package zad3;

public class Trojkat extends Figura {
	int wys=0;
	int podst=0;

	public Trojkat(int wys, int podst, String kolor){
		
		this.wys = wys;
		this.podst = podst;
		super.kolor = kolor;
	}

	// Abstrakcyjne klasy
	public String opis(){
		return "Trojkat o wymairach: "+wys+"  "+podst;
	}

	public void skaluj(float skala) {
		System.out.println("Wysokosc i podstawa przed:" + this.wys + " " + this.podst);
		this.wys *= skala;
		this.podst *= skala;
		System.out.println("Wysokosc i podstawa  po:" + this.wys + " " + this.podst);
	}

	// Implementowanie metod IFigura.
	public float getPowierzchnia() {
		return this.wys * this.podst * 1/2;
	}

	public boolean wPolu(Punkt p) {
		System.out.println("Implementowanie wPolu (z Trojkat)");
		return true;
	}
}