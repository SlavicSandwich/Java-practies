package thirtytwo;

public class IllegalTableNumber extends RuntimeException {
    public IllegalTableNumber() {
        super("Invalid table number.");
    }
}
