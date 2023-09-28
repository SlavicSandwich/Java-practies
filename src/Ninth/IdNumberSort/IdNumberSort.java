package Ninth.IdNumberSort;
import java.util.Random;
import java.util.*;
class Student{
    public int id;
    public String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

}

public class IdNumberSort {

    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        Random rangen = new Random();

        List<Student> arr = new ArrayList<Student>();

        for (int i = 0; i < 100;i++){
            arr.add(new Student(rangen.nextInt(1, 100), "Kyle" + rangen.nextInt(1, 100)));
        }

//        for (int i = 0; i < arr.size(); i++){
//            System.out.println(arr.get(i).id);
//        }
        int n = arr.size();
        for (int i = 1; i < n; ++i){
            Student key = arr.get(i);
            int j = i -1;
            while (j >= 0 && arr.get(j).id > key.id){
                arr.set(j + 1, arr.get(j));
                j = j - 1;
            }
            arr.set(j + 1, key);
        }

        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i).id + " " + arr.get(i).name);
        }
    }
}
