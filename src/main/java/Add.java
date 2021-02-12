public class Add implements Calculations {
  public Matrix execute() {
    return new Matrix(new Integer[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
  }
}