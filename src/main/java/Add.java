public class Add implements Calculations {
  private final Matrix one;
  private final Matrix two;

  public Add(Matrix one, Matrix two) {
    this.one = one;
    this.two = two;
  }

  public final Matrix execute() {
    return performAddition();
  }

  private final Matrix performAddition() {
    return this.one;
  }
}