package Fourth.Matrix;

public class Matrix {
  private double[][] data = null;
  private int rows = 0, cols = 0;

  public Matrix(int rows, int cols) {
    this.rows = rows;
    this.cols = cols;
    data = new double[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        this.data[i][j] = 0.0;
      }
    }
  }

  public Matrix(double[][] data) {
    this.data = data.clone();
    rows = this.data.length;
    cols = this.data[0].length;

  }

  public boolean isSquare() {
    return rows == cols;
  }

  public void display() {
    System.out.print("[");
    for (int row = 0; row < rows; ++row) {
      if (row != 0) {
        System.out.print(" ");
      }

      System.out.print("[");

      for (int col = 0; col < cols; ++col) {
        System.out.printf("%8.3f", data[row][col]);

        if (col != cols - 1) {
          System.out.print(" ");
        }
      }

      System.out.print("]");

      if (row == rows - 1) {
        System.out.print("]");
      }

      System.out.println();
    }
  }

  public void add(Matrix matrix) {
    if (matrix.rows != this.rows || matrix.cols != this.cols) {
      return;
    }
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        data[i][j] += matrix.data[i][j];
      }
    }
  }

  public void numMul(double digit) {

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        data[i][j] *= digit;
      }
    }
  }

  public void multiplyMatrix(Matrix matrix1) {
    if (this.rows != matrix1.cols) {

      System.out.println(
          "\nMultiplication Not Possible");
      return;
    }

    // Matrix to store the result
    // The product matrix will
    // be of size row1 x col2
    // int C[][] = new int[row1][col2];
    Matrix C = new Matrix(this.rows, matrix1.cols);

    // Multiply the two matrices
    for (int i = 0; i < this.rows; i++) {
      for (int j = 0; j < this.cols; j++) {
        for (int k = 0; k < matrix1.rows; k++)
          C.data[i][j] += this.data[i][k] * matrix1.data[k][j];
      }
    }

    // Print the result
    System.out.println("\nResultant Matrix:");
    C.display();
  }

  public static void main(String[] args) {
    double[][] data1 = {
        { 1, 2 },
        { 1, 2 }
    };

    double[][] data2 = {
        { 1, 2 },
        { 1, 2 }
    };

    Matrix A = new Matrix(data1);
    Matrix B = new Matrix(data2);
    A.multiplyMatrix(B);
  }
}
