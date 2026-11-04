package inf4067.solid.srp;

public class Main {
    public static void main(String[] args) {
        BookSRP book = new BookSRP("Les principes SOLID", "Etudiants de M1-GL", "Revision des principes SOLID");
        new BookPrinter().printToScreen(book);
        new BookPrinter().printToHTML(book);
        new BookSaver().saveToDatabase(book);
        new BookSaver().saveToFile(book, "livre.txt");
        new BookBusinessLogic().emprunter(book, "Marcial");
        new BookBusinessLogic().autreService(book);
    }
}