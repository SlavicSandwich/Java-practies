package thirty;


public class OrderAlreadyAddedException extends RuntimeException{
    public OrderAlreadyAddedException() {
        super("Order already added for the table or address.");
    }
}
