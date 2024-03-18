public class Sphere extends Shape {
    final double PI = 3.14;
    double r;

    Sphere(String shapeName, double r) {
        super(shapeName);
        this.r = r;
    }

    @Override
    public double getArea() {
        double result = 4/3 * PI * (r * r * r);
        System.out.println("Volume of your '" + this.nameOfShape + "' sphere Class is: " + result);
        return result;
    }

}
