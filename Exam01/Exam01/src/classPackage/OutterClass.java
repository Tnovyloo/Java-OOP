package classPackage;


public class OutterClass {

    private class InnerClass {
        void display() {
            System.out.println("Hello private");
        }
    }

    protected class InnerClass1 {
        void display1() {
            System.out.println("Hello protected");
        }
    }

    public class InnerClass2 {
        void display2() {
            System.out.println("Hello public");
        }
    }

    protected void createInnerInstance1() {
        InnerClass1 inner = new InnerClass1();
        inner.display1();
    }

    public void createInnerInstance2() {
        InnerClass2 inner = new InnerClass2();
        inner.display2();
    }
}