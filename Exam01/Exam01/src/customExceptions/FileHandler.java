package customExceptions;

import customExceptions.StudentException;

public class FileHandler {
    
    public void saveFile() throws StudentException {
        System.out.println("Prrrrrinnn---");
        throw new StudentException("Can't write 'T'");
    }
}
