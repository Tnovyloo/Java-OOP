public class Student {
//     klasę do przechowywania danych pojedynczego studenta (imię, nazwisko, numer albumu,
// adres).

    public String name, lastName;
    public int id;
    public Address address;

    public Student(String nameString, String lastName, int id, Address addressObject) {
        this.name = nameString;
        this.lastName = lastName;
        this.id = id;
        this.address = addressObject;
    }

    @Override
    public String toString() {
        return this.id + ": " + this.name + " " + this.lastName + " - " + this.address;
    }
}
