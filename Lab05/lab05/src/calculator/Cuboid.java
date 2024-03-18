package calculator;
public class Cuboid extends Shape {
    double a, b, c;

    Cuboid(String shapeName, double a, double b, double c) {
        super(shapeName);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double result = this.a * this.b * this.c;
        System.out.println("Volume of your '" + this.nameOfShape + "' Cuboid class is: " + result);
        return result;
    }
}
