package eleven;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

class TimeComparison {
    public static void main(String[] args) {
        // Create a SimpleDateFormat to parse the user's input
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

        // Get the current time
        Date currentTime = new Date();

        // Get user input for time
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a time (HH:mm format): ");
        String userInput = scanner.nextLine();

        try {
            // Parse the user's input into a Date object
            Date userTime = dateFormat.parse(userInput);

            // Compare the user's time with the current time
            int comparisonResult = userTime.compareTo(currentTime);

            if (comparisonResult < 0) {
                System.out.println("The entered time is in the past.");
            } else if (comparisonResult > 0) {
                System.out.println("The entered time is in the future.");
            } else {
                System.out.println("The entered time is the same as the current time.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input format. Please use the HH:mm format.");
        } finally {
            scanner.close();
        }
    }
}
