package calculator;
public class Rectangle extends Shape {
    double a, b;
    
    Rectangle(String shapeName, double a, double b) {
        super(shapeName);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        double result = this.a * this.b;
        System.out.println("Area of '" + this.nameOfShape + "' Rectangle Class is: " + result);
        return result;
    }
}