
package zad1;

public class Kangaroo extends Animal {
    public int kangarooID;

    public Kangaroo(int kangarooID) {
        this.kangarooID = kangarooID;
    }

    @Override
    public void printInfo() {
        System.out.println("Kangarooo! with ID " + kangarooID);
    }

    @Override
    public void jumpTo() {
        System.out.println("Kangaroo Jumping!");
    }

    @Override
    public void jumpTo(String place) {
        System.out.println("Kangaroo " + this.kangarooID + " Jumping to: " + place);
    }

    public int getKangarooID() {
        return this.kangarooID;
    }

    @Override
    public String toString() {
        return "Kangurek kao " + this.kangarooID;
    }

}
