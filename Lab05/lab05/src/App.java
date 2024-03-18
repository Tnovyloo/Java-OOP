import building.Building;
import calculator.Calculator;


public class App {
    public static void main(String[] args) throws Exception {
        // Calculator calc = new Calculator();

        // calc.start();
        
        
        startBuildings();
    }

    public static void startBuildings() {
        Building building = new Building(1928, 8, "HelloTower");

        building.printAllFields();
        
    }
}
