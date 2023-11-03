package Nineteen;

public class StudentNotFoundException extends RuntimeException {
  public StudentNotFoundException(String msg, Throwable cause) {
    super(msg, cause);
  }
}