package inf4067.solid.srp;

import static inf4067.solid.ConsoleCapture.capture;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookSRPTest {
    private final BookSRP book = new BookSRP("Les principes SOLID", "Etudiants de M1-GL", "Revision");

    @Test
    void donneesDuLivre() {
        assertEquals("Les principes SOLID", book.getTitle());
        assertEquals("Etudiants de M1-GL", book.getAuthor());
        assertEquals("Revision", book.getContent());
    }

    @Test
    void affichageEcran() {
        String out = capture(() -> new BookPrinter().printToScreen(book));
        assertEquals("===Print to Screen=== \nTitre: Les principes SOLID\n"
                + "Auteur: Etudiants de M1-GL\nContenu: Revision\n", out);
    }

    @Test
    void affichageHtml() {
        String out = capture(() -> new BookPrinter().printToHTML(book));
        assertTrue(out.contains("<h1>Les principes SOLID</h1>"));
        assertTrue(out.contains("<h2>Par Etudiants de M1-GL</h2>"));
        assertTrue(out.contains("<p>Revision</p>"));
    }

    @Test
    void persistance() {
        assertTrue(capture(() -> new BookSaver().saveToDatabase(book))
                .contains("Sauvegarde de 'Les principes SOLID' en base de donnees"));
        assertTrue(capture(() -> new BookSaver().saveToFile(book, "livre.txt"))
                .contains("dans livre.txt"));
    }

    @Test
    void logiqueMetier() {
        assertTrue(capture(() -> new BookBusinessLogic().emprunter(book, "Marcial"))
                .contains("Emprunt du livre 'Les principes SOLID' par Marcial"));
        assertTrue(capture(() -> new BookBusinessLogic().autreService(book))
                .contains("Autre logique metier"));
    }
}