package zad3;

public class Client extends Bookstore {
    String clientName;

    public Client(String clientNameString, String bookStoreString) {
        super(bookStoreString);
        this.clientName = clientNameString;
    }

    @Override
    public void printName() {
        System.out.println("My name is " + this.clientName + " and Wow i can read a bookstore name, and this is:");
        super.printName();
    }

}
