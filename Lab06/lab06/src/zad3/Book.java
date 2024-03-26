package zad3;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Book {
    public String bookName, bookType, author;
    public int releaseYear, century;

    public Book(String bookNameString, int releaseYearInt, String bookTypeString, String authorString) {
        this.bookName = bookNameString;
        this.releaseYear = releaseYearInt;
        this.bookType = bookTypeString;
        this.century = releaseYear / 100;
        this.author = authorString;
    }

    public void printBook() {
        System.out.println("Original printBook function");

        Class<?> book = this.getClass();
        Field[] declaredFields = book.getDeclaredFields();

        for (Field field : declaredFields) {
            try {
                Object value = field.get(this);
                System.out.println(field.getName() + ": " + value);
            } catch (Exception e) {
                System.out.println("Cannot access field: " + field.getName());
            }
        }

        System.out.println("Printing declared methods.");
        Method[] declaredMethods = book.getDeclaredMethods();
        
        for (Method method : declaredMethods) {
            System.out.println(method);
        }

    }


}
