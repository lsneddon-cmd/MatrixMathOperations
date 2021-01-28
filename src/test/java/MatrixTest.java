import org.junit.Assert;
import org.junit.Test;

public class MatrixTest {
    @Test
    public void canDetectSquareMatrix() {
        Matrix<Integer> matrix = new Matrix(new Integer[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
        Assert.assertTrue(matrix.isSquare());
    }
}
