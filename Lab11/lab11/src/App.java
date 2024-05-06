import zad1.Inputter;
import zad1.FileManager;

public class App {
    public static void main(String[] args) throws Exception {
        Inputter inputter = new Inputter();
        FileManager fileManager = new FileManager();

        // Zadanie 1
        // System.out.println("Podaj nazwe pliku:");
        // String userFileName = inputter.inputString();
        // fileManager.createFile(userFileName);
        // fileManager.writeToFile(userFileName);
        // System.out.println("Wyswietlam twoj zapisany plik");
        // fileManager.printFile(userFileName);
        
        // // Zadanie 2
        // System.out.println("Podaj nazwe pliku ktory chcesz wyswietlic");
        // fileManager.printFile(inputter.inputString());

        // Zadanie 3
        System.out.println("Podaj nazwe pliku binarnego");
        String userBinaryFileName = inputter.inputString();
        fileManager.writeBinaryToFile(userBinaryFileName);
    }
}
