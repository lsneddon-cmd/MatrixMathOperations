import org.junit.Assert;
import org.junit.Test;

public class AddTest {
  @Test
  public void canSelectOperation() {
    
    Matrix<Integer> matrix = new Matrix(new Integer[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });

    Calculations calc = new Add(matrix, matrix);

    Matrix res = calc.execute();

    Assert.assertSame(res.getData(1,1), matrix.getData(1,1));
  }
}