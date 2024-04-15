package zad3.address_exceptions;

public class IncorrectAdressException extends Exception {
    public IncorrectAdressException(String errorString) {
        super(errorString);
    }
}
