package Third.RandomArr;
import java.util.Arrays;
import java.util.Random;
public class RandomArr {
    public static void main(String[] args) {
        double[] arr = new double[10];
        Random rangen = new Random();
        for(int i = 0; i < 10; i++){
            arr[i] = Math.random();
            System.out.println(arr[i]);
        }
        for (int i = 0; i < 10; i++){
            arr[i] = rangen.nextDouble();
            System.out.println(arr[i]);

        }
        System.out.println("sorted");

        Arrays.sort(arr);
        for (int i = 0; i< 10; i++){
            System.out.println(arr[i]);
        }
    }

}
