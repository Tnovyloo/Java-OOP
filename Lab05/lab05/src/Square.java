public class Square extends Shape {
    double a;

    Square(String shapeName, double a) {
        super(shapeName);
        this.a = a;
    }

    @Override
    public double getArea() {
        double result = this.a * this.a;
        System.out.println("Area of " + this.nameOfShape + " is: " + result);
        return result;
    }
}
