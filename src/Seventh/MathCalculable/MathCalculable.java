package Seventh.MathCalculable;

interface MathCalculable {
  public double PI = 3.14;

  public double power(int val, int deg);

  public double absolute(double real, double fake);
}

class MathFunc implements MathCalculable {
  public double power(int val, int deg) {
    return Math.pow(val, deg);
  }

  public double absolute(double real, double fake) {
    return Math.sqrt(real * real + fake * fake);
  }
}
