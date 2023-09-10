package Second.CountWords;
import java.util.Scanner;
public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(line.split(" ").length);
    }
}
