package First;

/* четвертая */
import java.util.Scanner;

public class Second {
  public static void main(String[] args) {
    int[] random_arr = new int[10];
    Scanner scanner = new Scanner(System.in);

    int i = 0;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    while (i < 9) {
      if (scanner.hasNextInt()) {
        random_arr[i] = scanner.nextInt();

        if (random_arr[i] < min) {
          min = random_arr[i];
        }
        if (random_arr[i] > max) {
          max = random_arr[i];
        }
        i++;
      }
    }

    // do{
    // if (scanner.hasNextInt()){
    // random_arr[i] = scanner.nextInt();
    // i++;
    // if (random_arr[i] < min) min = random_arr[i];
    // if (random_arr[i] > max) max = random_arr[i];
    // }
    // } while (i < 9);

    System.out.println("Минимальное " + min);
    System.out.println("Максимальное " + max);
  }
}