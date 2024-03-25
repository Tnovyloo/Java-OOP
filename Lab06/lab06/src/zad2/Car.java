package zad2;

public class Car {
    String brand, model, bodyType, color; 
    double mileage;
    int productionDate;

    public Car(String brandString, String modelString, String bodyTypeString, String colorString, int productionDate, double mileage) {
        this.brand = brandString;
        this.model = modelString;
        this.bodyType = bodyTypeString;
        this.color = colorString;
        this.productionDate = productionDate;
        this.mileage = Math.abs(mileage);
    }

    public String toString(){
        return "Car object" + 
        this.brand + "\n" + 
        this.model + "\n" + 
        this.bodyType + "\n" + 
        this.productionDate + "\n" + 
        this.mileage + "\n" + 
        this.color + "\n";
    }
}
