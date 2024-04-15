package exceptions;

public class IncorrectValueException extends Exception {
    public IncorrectValueException(String errorMessage) {
        super(errorMessage);
    }
}
