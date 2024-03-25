package zad1;
public class Point {
    double x, y;

    public Point() {
        System.out.println("Constructor with no parameters");
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        System.out.println("Constructor with parameters");
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void clear() {
        this.x = this.y = 0;
    }

    public void description() {
        System.out.println("X is:" + this.x + "\nY is:" + this.y);
    }

    public void move(int x, int yz) {
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        // Overriding toString() method.
        return "Your point is 'x=" + this.x + "', 'y=" + this.y + "'";
    }
}
