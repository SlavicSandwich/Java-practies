package Tenth.Help;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

class Student {
    private String name;
    private String lastName;
    private String profile;
    private int course;
    private String group;
    private int GPA;

    public Student(String name, String lastName, String profile, int course, String group, int gpa) {
        this.name = name;
        this.lastName = lastName;
        this.profile = profile;
        this.course = course;
        this.group = group;
        this.GPA = gpa;
    }

    public void print() {
        System.out.println("Name: " + name + " LastName: " + lastName + " profile: " + profile + " course: " + course
                + " group: " + group + " GPA: " + GPA);
    }

    public String getName() {
        return name;
    }

    public int getGPA() {
        return GPA;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public String getLastName() {
        return lastName;
    }

    public String getProfile() {
        return profile;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}

class StundentComparatorGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGPA() - o2.getGPA();
    }
}
public class MergeTwoArrays {
    public static ArrayList<Student> setArray1() {
        Random rangen = new Random();
        ArrayList<Student> to_return = new ArrayList<Student>();
        for (int i = 0; i < 100; i++) {
            to_return.add(new Student("John" + i, "Doe" + i, Integer.toString(rangen.nextInt(1, 1000)),
                    rangen.nextInt(1, 5), "random group" + i, rangen.nextInt(1, 500)));
        }

        return to_return;
    }

    public static ArrayList<Student> setArray2() {
        Random rangen = new Random();
        ArrayList<Student> to_return = new ArrayList<Student>();
        for (int i = 0; i < 100; i++) {
            to_return.add(new Student("John" + i + 100, "Doe" + i + 100, Integer.toString(rangen.nextInt(1000, 2000)),
                    rangen.nextInt(1, 5), "random group" + i + 100, rangen.nextInt(500, 1000)));
        }

        return to_return;
    }

    public static void mergeSortGPA(List<Student> arr, int start, int end) {
        if (start != end) {
            int mid = (start + end) / 2;
            mergeSortGPA(arr, start, mid);
            mergeSortGPA(arr, mid + 1, end);
            mergeGPA(arr, start, mid, end);
        }
    }

    private static void mergeGPA(List<Student> arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = 0;
        StundentComparatorGPA comparator = new StundentComparatorGPA();

        Student[] temp = new Student[end - start + 1];

        while ((i <= mid) && (j <= end)) {
            if (comparator.compare(arr.get(i), arr.get(j)) < 0)
//            if (arr.get(i).GPA < arr.get(j).GPA)
                temp[k++] = arr.get(i++);
            else
                temp[k++] = arr.get(j++);
        }

        while (i <= mid) {
            temp[k++] = arr.get(i++);
        }

        while (j <= end) {
            temp[k++] = arr.get(j++);
        }

        for (i = start; i <= end; i++) {
            arr.remove(i);
            Student e = temp[i - start];
            arr.add(i, e);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> arr1 = setArray1();
        ArrayList<Student> arr2 = setArray2();
        ArrayList<Student> arrfin = new ArrayList<Student>();
        for (int i = 0; i < 100; i++){
            arrfin.add(arr1.get(i));
            arrfin.add(arr2.get(i));
        }

        mergeSortGPA(arrfin, 0, arrfin.size() - 1);
        for (Student student : arrfin) {
            student.print();
        }
    }
}
