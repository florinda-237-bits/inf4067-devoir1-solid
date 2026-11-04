package inf4067.solid.ocp;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(4, 3);
        System.out.println("Area = '" + shape.calculateArea() + "'");
    }
}