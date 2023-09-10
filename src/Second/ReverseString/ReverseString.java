package Second.ReverseString;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        char[] chars = string.toCharArray();

        int i = 0;
        int j = string.length() -1;
        while (i < j){
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
            i++;
            j--;
        }
        string = String.valueOf(chars);
        System.out.println(string);
    }
}
