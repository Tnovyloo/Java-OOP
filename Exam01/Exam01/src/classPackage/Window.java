package classPackage;

public interface Window {
    public void setWindowSize();
    
    public default void getOS() {
        System.out.println("Getting your OS, is it windows? damn. thats crazy");
    }
}
