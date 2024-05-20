import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Wprowadzanie studenta do 'bazy':");

        Address akademik = new Address("Rzeszow", "Lwowska", 2, 1);

        List<Student> studentsArray = new ArrayList<>(); 
        studentsArray.add(new Student("Arkadiusz", "Morzychna", 131, akademik));
        studentsArray.add(new Student("Arkadiusz", "Dabrowa", 132, akademik));
        studentsArray.add(new Student("Marek", "Dabrowa", 133, akademik));
        studentsArray.add(new Student("Marek", "Dabrowa", 135, akademik));
        studentsArray.add(new Student("Marek", "Dabrowa", 136, akademik));

        while (true) {
            System.out.println("[1] Dodaj studenta:\n[2] Wyswietl Studentow\n[3] Wyszukaj po indeksie\n[4] Wyszukaj po imieniu i nazwisku\n[5] Usun po indeksie\n[6] Wyjdz z programu\nPodaj liczbe:");
            int userInput = scanner.nextInt();

            // Zadanie 2.1 (a)
            if (userInput == 1) {
                String studentName, studentLastName;
                int id;

                studentName = inputString("Imie");
                studentLastName = inputString("Naziwsko");
                id = inputInt("Indeks");
                // Dla przyspieszenia zadania kazdemu nowo dodanemu studentowi przypisze akademik (Bedzie szybciej dla testów programu)
                System.out.println("Jest to wersja alpha i zakladamy ze kazdy student mieszka juz pod jednym adresem, tzn akademik");

                boolean isValid = true;

                for (Student student : studentsArray) {
                    if (student.id == id) {
                        System.out.println("Podano powtarzajacy sie indeks!");
                        isValid = false;
                    }
                }

                if (isValid) {
                    Student newStudent = new Student(studentName, studentLastName, id, akademik);
                    studentsArray.add(newStudent);
                    System.out.println("Dodano nowego studenta!");
                } else {
                    System.out.println("Problem z walidacja danych");
                }
            }


            // Zadanie 1
            if (userInput == 2) {
                for (Student student : studentsArray) {
                    System.out.println(student);
                }
            }

            // Zadanie 2.2
            if (userInput == 3) {
                int searchedIndex = inputInt("indeks studenta aby go znalezc");
                for (Student student : studentsArray) {
                    if (student.id == searchedIndex) {
                        System.out.println(student);
                    }
                }
            }

            // Zadanie 2.3 Szukanie po imieniu i nazwisku
            if (userInput == 4) {
                String searchedStudentName = inputString("Imie studenta");
                String searchedLastName = inputString("Nazwisko studenta");

                List<Student> searchResults = new ArrayList<>();

                for (Student student : studentsArray) {
                    if (student.name.equals(searchedStudentName) && student.lastName.equals(searchedLastName)) {
                        searchResults.add(student);
                    }
                }

                System.out.println("Wyszukani studenci:");
                for (Student student : searchResults) {
                    System.out.println(student);
                }
                
            }

            if (userInput == 5) {
                int deleteId = inputInt("Indeks do usuniecia");
                
                int studentArrayListId = -10;
                for (int i = 0; i < studentsArray.size(); i++) {
                    if (deleteId == studentsArray.get(i).id) {
                        System.out.println("Usuwam " + studentsArray.get(i));
                        studentArrayListId = i;
                    }
                }
                studentsArray.remove(studentArrayListId);

                System.out.println("Zaaktualizowana lista studentow:");
                for (Student student : studentsArray) {
                    System.out.println(student);
                }

                
                // studentsArray.forEach(null);
                // W sumie to sobie w domu zrobie to w .forEach() o ile dziala tak jak ja mysle :)
            }
            
            if (userInput == 6) {
                break;
            }
        }
        
    }

    public static String inputString(String input) {
        System.out.println("Podaj " + input + ":");
        Scanner newScanner = new Scanner(System.in);
        return newScanner.nextLine();
    }

    public static int inputInt(String input) {
        System.out.println("Podaj " + input + ":");
        Scanner newScanner = new Scanner(System.in);
        return newScanner.nextInt();
    }
}
