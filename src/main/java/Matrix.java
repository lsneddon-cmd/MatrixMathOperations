public class Matrix {
    private double[][] data;
    private int rows;
    private int cols;
    private boolean isSquare;

    public Matrix(double[][] data) {
        this.data = data;
        this.rows = data.length;
        this.cols= data[0].length;
        this.isSquare = data.length == data[0].length;
    }
}
