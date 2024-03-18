import building.Building;
import calculator.Calculator;
import species.Species;


public class App {
    public static void main(String[] args) throws Exception {
        // Calculator calc = new Calculator();

        // calc.start();
        
        // startBuildings();

        startSpecies();
    }

    public static void startBuildings() {
        Building building = new Building(1928, 8, "HelloTower");

        building.printAllFields();
    }

    public static void startSpecies() {
        Species species = new Species("Rodzaj", "Gatunek", 16);

        species.printHaploidalChromosomes();
        species.printNameFields();

        Species species2 = species.returnNewSpeciesObject();
        species2.printHaploidalChromosomes();
        species2.printNameFields();
    }
}
