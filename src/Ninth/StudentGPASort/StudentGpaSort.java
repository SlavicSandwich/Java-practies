package Ninth.StudentGPASort;
import java.util.Random;
import java.util.*;
class Student{
    public int GPA;
    public String name;

    public Student(int GPA, String name){
        this.GPA = GPA;
        this.name = name;
    }

}
public class StudentGpaSort {

    public static void quicksort(List<Student> list, int left, int right) {
        int q;
        if (right > left) {
            q = partition(list, left, right);
            // after ‘partition’
            // list[left..q-1] ≤ list[q] ≤ list[q+1..right]
            quicksort(list, left, q - 1);
            quicksort(list, q + 1, right);
        }
    }

    static int partition(List<Student> list, int left, int right) {
        int P = list.get(left).GPA;
        int i = left;
        int j = right + 1;
        for (;;) { // infinite for-loop, break to exit
            while (list.get(++i).GPA < P)
                if (i >= right)
                    break;
            // Now, list[i]≥P
            while (list.get(--j).GPA > P)
                if (j <= left)
                    break;
            // Now, list[j]≤P
            if (i >= j)
                break; // break the for-loop
            else
                // swap(list[i],list[j]);
                Collections.swap(list, i, j);
        }
        if (j == left)
            return j;
        // swap (list[left],list[j]);
        Collections.swap(list, left, j);
        return j;
    }
    public static void main(String[] args) {
        Random rangen = new Random();

        List<Student> arr = new ArrayList<Student>();

        for (int i = 0; i < 100;i++){
            arr.add(new Student(rangen.nextInt(1, 100), "Kyle" + rangen.nextInt(1, 100)));
        }

        quicksort(arr, 0, arr.size() - 1);
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i).GPA + " " + arr.get(i).name);
        }
    }
}
