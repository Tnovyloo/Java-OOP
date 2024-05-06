package zad1;

import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public File returnFile(String userFileName) throws IOException {
        return new File("C:\\Users\\user\\Desktop\\Projects\\java_studia\\Lab11\\lab11\\src\\text_files\\" + userFileName);
    }

    public File createFile(String userFileName) throws IOException {
        File newFile = returnFile(userFileName);
        newFile.createNewFile();
        return newFile;
    }

    public void writeToFile(String userFileName) throws IOException {
        try {
            // Open file which will be overrided.
            FileWriter fileWriter = new FileWriter(returnFile(userFileName));
            Inputter inputter = new Inputter();
            System.out.println("Aby zakonczyc nadpisywanie pliku wpisz '-'");
            while (true) {
                String userLine = inputter.inputString();
                if (!userLine.equals("-")) {
                    fileWriter.write(userLine);
                    fileWriter.write(System.lineSeparator());
                } else {
                    break;
                }
            }

            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Problem with reading file");
        }
    }

    public void writeBinaryToFile(String userFileName) throws IOException {
        try {
            // FileWriter fileWriter = new FileWriter(returnFile(userFileName));
            Inputter inputter = new Inputter();
            System.out.println("Aby zakonczyc nadpisywanie pliku w postaci binarnej wpisz '-'");
            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(returnFile(userFileName)));
            while (true) {
                String userLine = inputter.inputString();
                if (!userLine.equals("-")) {
                    try {
                        Integer userInteger = Integer.parseInt(userLine);
                        outputStream.writeInt(userInteger);
                        System.out.println(Integer.toBinaryString(userInteger));
                    } catch (NumberFormatException e) {
                        System.out.println("Podany tekst nie mozna przeparsowac na Int");
                    }
                } else { break; }
            }
            outputStream.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void printBinaryFile(String userFileName) throws IOException {
        
    }

    public void printFile(String userFileName) throws IOException {
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(returnFile(userFileName)))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            System.out.println("Problem");
        }   
    }
    
}
