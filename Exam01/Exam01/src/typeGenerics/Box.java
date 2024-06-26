package typeGenerics;

public class Box <T> {
    // T class could parametrize our class to specific Type.
    private T element;

    public Box() {

    }

    public Box(T element){
        this.element = element;
    }

    public T getElement() {
        return this.element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public void printTypeOfElement() {
        System.out.println("T class is:" + element.getClass().getName());

        if (element instanceof Integer) {
            System.out.println("T class is integer!");
        }
        
    }

}
