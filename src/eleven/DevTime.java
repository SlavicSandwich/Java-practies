package eleven;
import java.util.*;
import java.text.SimpleDateFormat;

class Dev{
    public Date start;
    public Date end;
    public String lastName;

    public Dev(String lastName, Date workStartTime, Date workEndTime){
        this.lastName = lastName;
        this.start = workStartTime;
        this.end = workEndTime;
    }
}
class CompareTime {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Dev developer = new Dev("Smith",
                new Date(), // Current date and time as work start time
                new Date()); // Current date and time as work end time

        // Print the values
        System.out.println("Last Name: " + developer.lastName);
        System.out.println("Work Start Time: " + dateFormat.format(developer.start));
        System.out.println("Work End Time: " + dateFormat.format(developer.end));

    }
}