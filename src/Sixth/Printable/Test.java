package Sixth.Printable;

public class Test {
    public static void main(String[] args) {
        Printable[] arr = {new Book(), new Magazine(), new Book()};
        for (int i = 0; i< 3; i++){
            arr[i].print();
        }

    }
}
