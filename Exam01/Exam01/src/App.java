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

        // By default all class are protected into package so this line is not gonna work
        // ProtectedClass protectedClass = new ProtectedClass();

        // In public class we have usage of protected createInnerInstance1
        PublicClass publicClass = new PublicClass();
        publicClass.doSmth();

        // We could only from here use public method in OutterClass
        OutterClass outterClass = new OutterClass();
        outterClass.createInnerInstance2();

        TestClass testClass = new TestClass();
        // testClass.counter();
        TestClass.counter();
    }
}
