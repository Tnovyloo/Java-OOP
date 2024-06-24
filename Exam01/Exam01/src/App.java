import toolsPackage.Pen;
import classPackage.*;

public class App {
    public static void main(String[] args) throws Exception {
        Pen pen = new Pen("Blue", "0.8mm");

        // Use the overrided abstract method from DrawingTool.
        pen.draw();
        // Use the second method with other initialization parameter.
        pen.draw("Hello");

        pen.getOS();

        // By default all class are protected into package so this line is gonna not work
        // ProtectedClass protectedClass = new ProtectedClass();

        PublicClass publicClass = new PublicClass();
        publicClass.doSmth();
    }
}
