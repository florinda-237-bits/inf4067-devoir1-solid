package inf4067.solid.srp;

public class BookSRP {
    private final String title;
    private final String author;
    private final String content;

    public BookSRP(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getContent() { return content; }
}