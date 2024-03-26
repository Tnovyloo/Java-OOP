package zad3;

public class Novel extends Book {
    public String novelText;

    public Novel(String bookNameString, int releaseYearInt, String bookTypeString, String authorString, String novelTextString) {
        super(bookNameString, releaseYearInt, bookTypeString, authorString);
        this.novelText = novelTextString;
    }

    public void printNovel() {
        System.out.println("Novel text is: " + this.novelText);
    }

    @Override
    public void printBook() {
        System.out.println("Override printBook function");

        System.out.println("Now using original printBookFunction:");

        super.printBook();
    }

}
