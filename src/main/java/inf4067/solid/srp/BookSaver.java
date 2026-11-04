package inf4067.solid.srp;

public class BookSaver {
    public void saveToDatabase(BookSRP book) {
        System.out.println("\nSauvegarde de '" + book.getTitle() + "' en base de donnees...");
    }

    public void saveToFile(BookSRP book, String filename) {
        System.out.println("\nSauvegarde de '" + book.getTitle() + "' dans " + filename);
    }
}