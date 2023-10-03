package eleven;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

class Student {
    private String lastName;
    private int GPA;
    private Date birthDate;

    public Student(String lastName, int Gpa, Date birthDate) {
        this.lastName = lastName;
        this.GPA = Gpa;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String lastName = "LastName: " + this.lastName + "\n";
        String GPA = "GPA: " + this.GPA + "\n";
        String birth = "Birth Date: " + dateFormat.format(this.birthDate) + "\n";
        return lastName + GPA + birth;
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student studento = new Student("Walter", 436, new Date());
        System.out.println(studento);
    }
}
