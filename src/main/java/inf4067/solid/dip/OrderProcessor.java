package inf4067.solid.dip;

public class OrderProcessor {
    private final Database database;

    public OrderProcessor(Database database) {
        this.database = database;
    }

    public void processOrder(String order) {
        database.save(order);
    }
}