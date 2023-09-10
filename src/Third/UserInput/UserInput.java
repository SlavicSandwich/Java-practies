package Third.UserInput;
import java.util.Random;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Random rangen = new Random();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (true){
            n = sc.nextInt();
            if (n > 0) break;
        }

        int[] arr = new int[n];
        for (int i = 0; i< n; i++){
            arr[i] = rangen.nextInt(0, n+1);
        }

    }
}
