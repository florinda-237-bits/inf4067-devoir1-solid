package inf4067.solid.lsp;

public class Mainlsp2 {
    public static void main(String[] args) {
        Shape square = new Square(3);
        Shape rectangle = new Rectangle(3, 4);
        System.out.println("Square Area : " + square.getArea());
        System.out.println("Rectangle Area: " + rectangle.getArea());
    }
}