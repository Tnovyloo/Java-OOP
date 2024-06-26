package classPackage;

public class PublicClass {
    // By default all classes has constructor with no arguments.
    public PublicClass() {}
    
    public void doSmth() {
        ProtectedClass protectedClass = new ProtectedClass();
        protectedClass.doSmth("Helllo");
        protectedClass.doSmth();

        OutterClass outterClass = new OutterClass();
        // InnerClass is private
        // outterClass.InnerClass.display();

        // InnerClass1 is protected
        outterClass.createInnerInstance1();

        // INnerClass2 is public
        outterClass.createInnerInstance2();
    }
    

}
