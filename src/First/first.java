package First;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,

import java.util.Scanner;
// then press Enter. You can now see whitespace characters in your code.

/* Третья */
public class first {
    public static void main(String[] args) {
        int[] random_arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            if (scanner.hasNextInt()) {
                random_arr[i] = scanner.nextInt();
                sum += random_arr[i];
            }
        }

        System.out.println("Сумма чисел " + sum);
        System.out.println("Среднее " + sum / 10);
    }
}

/* четвертая */

// public class Main {
// public static void main(String[] args) {
// int[] random_arr = new int[10];
// Scanner scanner = new Scanner(System.in);
//
// int i = 0;
// int min = Integer.MAX_VALUE;
// int max = Integer.MIN_VALUE;
//
// while (i < 9){
// if (scanner.hasNextInt()){
// random_arr[i] = scanner.nextInt();
//
// if (random_arr[i] < min) {min = random_arr[i];}
// if (random_arr[i] > max) {max = random_arr[i];}
// i++;
// }
// }
//
//// do{
//// if (scanner.hasNextInt()){
//// random_arr[i] = scanner.nextInt();
//// i++;
//// if (random_arr[i] < min) min = random_arr[i];
//// if (random_arr[i] > max) max = random_arr[i];
//// }
//// } while (i < 9);
//
//
// System.out.println("Минимальное " + min);
// System.out.println("Максимальное " + max);
// }
// }

// Шестая

// public class first {
// public static void main(String[] args) {
// for (float k = 1; k <= 10; k++){
// System.out.println(String.format("%.2f ", 1.0 / k));
// }
// }
// }