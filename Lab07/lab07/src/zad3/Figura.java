package zad3;

public abstract class Figura implements IFigura {
	
	//pola metody i kontruktory
	Punkt punkt;
	String kolor = "bialy";
	
	Figura(){
		punkt = new Punkt(0,0);
	}

	Figura(String kolor){
		this.kolor = kolor;
	}

	Figura(Punkt punkt){
		this.punkt = punkt;
	}

	String getKolor(){
		return kolor;
	}

	// Metody abstrakcyjne
	public String opis() {
		return "Opis figury";
	};
	
	public void skaluj(float skala) {
		System.out.println("Skaluje.");
	}

	// Metody implementowane w naszej klasie abstrakcynej
	public float getPowierzchnia() { return 0; };
	public boolean wPolu(Punkt p) { System.out.println("Default implemented method."); return false; };
}
