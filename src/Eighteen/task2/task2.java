package Eighteen.task2;

import java.util.Scanner;

class Task2 {
    public void exceptionDemo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer ");
        try {
            String intString = sc.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Wrong integer number format");
        } catch (ArithmeticException e) {
            System.out.println("Attempted to divide by zero");
        } catch (Exception e) {
            System.out.println("Some Error occurred");
        } finally {
            System.out.println("Finally");
        }
    }
}

class TaskTest2 {
    public static void main(String[] args) {
        Task2 exception = new Task2();
        exception.exceptionDemo();
    }
}