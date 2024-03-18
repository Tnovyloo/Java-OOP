
public class Triangle extends Shape {

    double a, b, h;
    
    public Triangle(String shapeName, double a, double b, double h) {
        super(shapeName);

        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double getArea() {
        double result = (this.a * this.b) * 1/2; 

        System.out.println("Area of this Triangle is: " + result);
        return result;
    }
}