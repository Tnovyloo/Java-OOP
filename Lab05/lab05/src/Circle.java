public class Circle extends Shape {
    final double PI = 3.14;
    double r;

    Circle(String shapeName, double r){
        super(shapeName);
        this.r = r;
    }

    @Override
    public double getArea() {
        double result = PI * (r * r);
        System.out.println("Area of Circle is: " + result);
        return result;
    }
}
