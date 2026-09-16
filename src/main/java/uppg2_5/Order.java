package uppg2_5;

public class Order {

    private static int nextOrderNumber = 1000;
    private int orderNumber;

    public Order() {
        this.orderNumber = nextOrderNumber;
        nextOrderNumber++;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getNextOrderNumber() {
        return nextOrderNumber;
    }
}
