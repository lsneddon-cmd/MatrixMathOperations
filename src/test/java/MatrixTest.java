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

    @Test
    public void canDetectNonSquareMatrix() {
        Matrix<Integer> matrix = new Matrix(new Integer[][] {
                {1, 2, 3},
                {4, 5, 6}
        });
        Assert.assertFalse(matrix.isSquare());
    }

    @Test
    public void returnsCorrectData() {
        Matrix<Integer> matrix = new Matrix(new Integer[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
        Assert.assertSame(5, matrix.getData(1, 1));
    }
}
