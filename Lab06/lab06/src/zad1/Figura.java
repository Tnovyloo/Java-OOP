package zad1;

public class Figura {
	//pola metody i kontruktory
	Point point;
	String kolor = "bialy";
	
	public Figura(){
		point = new Point(0,0);
	}

	public Figura(String kolor){
		this.kolor = kolor;
	}

	public Figura(Point punkt){
		this.point = punkt;
	}

	public String getKolor(){
		return kolor;
	}

	public String opis(){
		return "Klasa Figura. Kolor obiektu: " + kolor;
	}
			
}
