package classPackage;

class ProtectedClass {
    protected void doSmth(String protectString) {
        System.out.println("ProtectedClass:  doSmth method accessible from PublicClass" + " " + protectString);
    }

    private void doSmthPrivate() {
        System.out.println("Hello privateee");
    }


    public void doSmth() {
        System.out.println("Public method in Protected-Package class!");
    }

}
