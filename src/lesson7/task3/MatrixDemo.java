package lesson7.task3;

public class MatrixDemo {
    public static void main(String[] args) {
        int[][] a ={
                {2, 4},
                {3, 6},
                {3, 5}
        };
        int[][] b= {
                {7, 6, 4},
                {3, 8, 5}
        };
        int[][] c ={
                {2, 4},
                {3, 6},
        };
        int[][] d = {
                {7, 6, },
                {3, 8, }
        };
        Matrix matrix1 = new Matrix(a);
        Matrix matrix2 = new Matrix(b);
        Matrix matrix3 = new Matrix(c);
        Matrix matrix4 = new Matrix(d);

        Matrix matrix5 = matrix3.add(matrix4);
        matrix5.Print(matrix5);

        Matrix matrix6=matrix2.intmulti(2);
        matrix6.Print(matrix6);

        Matrix matrix7 = matrix1.multimatrix(matrix2);
        matrix7.Print(matrix7);
    }
}
