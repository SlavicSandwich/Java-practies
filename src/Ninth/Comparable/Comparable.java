package Ninth.Comparable;

class Student implements Comparable<Student>{
    public int GPA;
    public String name;

    public Student(int GPA, String name) {
        this.GPA = GPA;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name) + (this.GPA-o.GPA);
    }
}

class Tester{
    public static void main(String[] args) {
        Student first = new Student(45, "Kyle");
        Student second = new Student(93, "Key");

        System.out.println(first.compareTo(second));

        first = new Student(45, "Kyle");
        second = new Student(45, "Kyle");

        System.out.println(first.compareTo(second));

    }
}