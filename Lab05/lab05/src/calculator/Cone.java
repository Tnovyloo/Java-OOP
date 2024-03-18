package calculator;
public class Cone extends Shape {
    final double PI = 3.14;
    double r, h;

    Cone(String shapeName, double r, double h) {
        super(shapeName);
        this.r = r;
        this.h = h;
    }

    @Override
    public double getArea() {
        double result = (1.0/3.0) * PI * (this.r * this.r) * this.h;
        System.out.println("Volume of your '" + this.nameOfShape + "' Cone Class is: " + result);
        return result;
    }
}
