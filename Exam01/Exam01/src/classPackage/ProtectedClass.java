package classPackage;

class ProtectedClass {
    protected void doSmth(String protectString) {
        System.out.println("Protected" + " " + protectString);
    }

    private void doSmthPrivate() {
        System.out.println("Hello privateee");
    }


    public void doSmth() {
        System.out.println("Public!");
    }

}
