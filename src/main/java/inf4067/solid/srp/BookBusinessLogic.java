package inf4067.solid.srp;

public class BookBusinessLogic {
    public void emprunter(BookSRP book, String lecteur) {
        System.out.println("\nEmprunt du livre '" + book.getTitle() + "' par " + lecteur);
    }

    public void autreService(BookSRP book) {
        System.out.println("\nAutre logique metier sur le livre '" + book.getTitle());
    }
}