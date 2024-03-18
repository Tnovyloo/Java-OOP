package calculator;
public class Cube extends Shape {
    double a;

    Cube(String shapeName, double a) {
        super(shapeName);
        this.a = a;
    }

    @Override
    public double getArea() {
        double result = this.a * this.a * this.a;
        System.out.println("Volume of " + this.nameOfShape + " Class is: " + result);
        return result;
    }
}
