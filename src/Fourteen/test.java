package Fourteen;

//Write me a simple program calculator
import java.util.Scanner;

class Calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    double num1 = scanner.nextDouble();

    System.out.print("Enter the second number: ");
    double num2 = scanner.nextDouble();

    System.out.print("Enter the operator (+, -, *, /): ");
    char operator = scanner.next().charAt(0);

    double result = 0.0;

    switch (operator) {
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        if (num2 != 0) {
          result = num1 / num2;
        } else {
          System.out.println("Error: Division by zero");
          System.exit(0);
        }
        break;
      default:
        System.out.println("Error: Invalid operator");
        System.exit(0);
    }

    System.out.println("Result: " + result);

    scanner.close();
  }
}