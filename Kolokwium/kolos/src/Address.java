public class Address {
    // Adres powinien być reprezentowany jako osobna klasa z polami (miejscowość, ulica, numer
    // domu, numer mieszkania).     

    public String city, street;
    public int flatNumber, houseNumber;

    public Address(String cityString, String streetString, int houseNumber, int flatNumber) { 
        // Ten konstuktor jest dla 'mieszkania w bloku'
        this.city = cityString;
        this.street = streetString;
        this.flatNumber = flatNumber;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Adres: " + this.city + " " + this.street + " " + this.houseNumber + " " + this.flatNumber;
    }

}
