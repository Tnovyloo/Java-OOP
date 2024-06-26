package typeGenerics;

public class Pair <T1, T2> {
    private T1 firstElement;
    private T2 secondElement;

    public Pair() {}
    
    public Pair(T1 first, T2 second) {
        this.firstElement = first;
        this.secondElement = second;
    }

    public void setFirstElement(T1 firstElement) {
        this.firstElement = firstElement;
    }

    public void setSecondElement(T2 secondElement) {
        this.secondElement = secondElement;
    }

    public T1 getFirstElement() {
        return firstElement;
    }

    public T2 getSecondElement() {
        return secondElement;
    }

    public <A1, A2> void functionWithTypeGenerics(A1 a1, A2 a2) {
        System.out.println("First argument" + a1.getClass().getName());
        System.out.println("Second argument" + a2.getClass().getName());
    }
}
