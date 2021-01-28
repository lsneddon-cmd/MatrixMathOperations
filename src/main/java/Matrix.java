public class Matrix<T> {
    private T[][] data;
    private int rows;
    private int cols;
    private boolean isSquare;

    public Matrix(T[][] data) {
        this.data = data;
        this.rows = data.length;
        this.cols= data[0].length;
        this.isSquare = data.length == data[0].length;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public boolean isSquare() {
        return isSquare;
    }

    public T getData(int row, int col) {
        if (row < 0 || col < 0) {
            throw new ArrayIndexOutOfBoundsException(
                    "Row and Column must be greater than 0."
                    + "Row entered: " + row
                    + "Column entered: " + col);
        }
        if (row > this.rows && col > this.cols)
        if (row > this.rows) {
            throw new ArrayIndexOutOfBoundsException(
                "This matrix has "
                + this.rows
                + " rows\nYou attempted to access row: "
                + row);
        }
        if (col > this.cols) {
            throw new ArrayIndexOutOfBoundsException(
                    "This matrix has "
                            + this.cols
                            + " columns\nYou attempted to access column: "
                            + col);
        }
        return data[row][col];
    }
}
