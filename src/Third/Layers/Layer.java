package Third.Layers;

public class Layer {
  public static void main(String[] args) {
    Double random_double = 1.95;
    String random_string = String.valueOf(random_double);
    System.out.println(random_string);

    Double converted_double = Double.parseDouble(random_string);
    System.out.println(converted_double instanceof Double);

    double lower_case_double = (double) random_double;

    byte random_byte = (byte) lower_case_double;
    int random_int = (int) lower_case_double;
    short random_short = (short) lower_case_double;
    long random_long = (long) lower_case_double;
    float random_float = (float) lower_case_double;

    double d = 3.14;
    String string_d = Double.toString(d);
  }
}