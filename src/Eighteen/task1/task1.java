package Eighteen.task1;


class Task1 {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
//        System.out.println(2.0 / 0.0);
    }
}

class TaskTest1 {
    public static void main(String[] args) {
        Task1 exception = new Task1();
        exception.exceptionDemo();
    }
}