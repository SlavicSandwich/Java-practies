package thirty;

public class IllegealTableNumber extends RuntimeException{
    public IllegealTableNumber() {
        super("Invalid table number.");
    }
}
