package thirtytwo;

public class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException() {
        super("Order already added for the table or address.");
    }
}
