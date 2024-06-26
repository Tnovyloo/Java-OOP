package customExceptions;

public class StudentException extends Exception {
    public StudentException() {
        super("Program cannot be written by student");
    }
    
    public StudentException(String message) {
        super(message);
    }
    
}
