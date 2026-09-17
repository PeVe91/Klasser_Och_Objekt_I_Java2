package uppg2_5;

import java.util.concurrent.atomic.AtomicInteger;

public class Order {

    //static AtomicInteger oNumber = new AtomicInteger(1000);
    private static int nextOrderNumber = 1000;
    private final int orderNumber;

    public Order() {
        //trådsäker operation
        //oNumber.getAndAdd(1);

        this.orderNumber = nextOrderNumber++;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getNextOrderNumber() {
        return nextOrderNumber;
    }
}
