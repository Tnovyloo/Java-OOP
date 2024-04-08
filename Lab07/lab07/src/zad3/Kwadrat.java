package zad3;

public class Kwadrat extends Prostokat {
	public Kwadrat(int bok,String kolor){
		super(bok,bok,kolor);
	}

	public String opis() {
		return "Kwadrat o wymiarach " + this.wys + " * " + this.szer + " o kolorze: " + this.kolor;
	}

	public void skaluj(float skala) {
		System.out.println("Powierzchnia przed:" + this.szer * this.szer);
		this.szer *= skala;
		System.out.println("Powierzchnia po:" + this.szer * this.szer);
	}

	public boolean wPolu(Punkt p) {
		System.out.println("W polu kwadrat!");
		return false;
	}

}