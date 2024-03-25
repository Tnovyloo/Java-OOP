package zad2;

public class PassengerCar extends Car {
    int capacity, seatsCount;
    double weight;

    public PassengerCar(String brandString, String modelString, String bodyTypeString, String colorString, int productionDate, double mileage, double weight, int capacity, int seatsCount) {
        super(brandString, modelString, bodyTypeString, colorString, productionDate, mileage);
        this.capacity = capacity;
        this.seatsCount = seatsCount;
        this.weight = weight;
    }

    public String toString(){
        return "Car object" + 
        this.brand + "\n" + 
        this.model + "\n" + 
        this.bodyType + "\n" + 
        this.productionDate + "\n" + 
        this.mileage + "km\n" + 
        this.weight + "kg\n" + 
        this.capacity + "cm3\n" + 
        this.seatsCount + " ilosc siedzen\n" + 
        this.color + "\n";
    }
}
