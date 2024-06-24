package classPackage;

public class PublicClass {
    
    public void doSmth() {
        ProtectedClass protectedClass = new ProtectedClass();
        protectedClass.doSmth("Helllo");

        OutterClass outterClass = new OutterClass();
        // InnerClass is private
        // outterClass.InnerClass.display();

        // InnerClass1 is protected
        outterClass.createInnerInstance1();

        // INnerClass2 is public
        outterClass.createInnerInstance2();
    }
    

}
