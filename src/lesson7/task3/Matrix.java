package lesson7.task3;

import java.util.Arrays;

public class Matrix {
    int[][] massive;
    int h;
    int w;


    public Matrix(int[][] massive) {
        this.massive = massive;
        this.h = massive.length;
        this.w = massive[0].length;
    }

    Matrix add(Matrix matrix){
        if(this.h ==matrix.h &&this.w ==matrix.w){
            Matrix mate = new Matrix(new int[this.h][this.w]);
            for(int i=0; i<h; i++){
               for(int j=0; j<w; j++){
                    mate.massive[i][j] = this.massive[i][j] + matrix.massive[i][j];
               }
            }
            return mate;
        }
        else {
            System.out.println("Вы ввели массивы разной размерности");
            return null;
        }
    }

    Matrix intmulti(int a){
        Matrix mate = new Matrix(new int[this.h][this.w]);
        for(int k = 0; k <h; k++){
            for(int l =0; l <w; l++) {
                mate.massive[k][l] = this.massive[k][l]*a;
            }
         }
    return mate;
}
    void Print(Matrix matrix){
        System.out.println(Arrays.deepToString(matrix.massive));
    }

    Matrix multimatrix (Matrix matrix){
        int a = matrix.massive[0].length;
        if(this.h==a){
            Matrix mate = new Matrix(new int[this.h][a]);
            int sum = 0;
            for(int i=0; i<h; i++){
                for(int j=0; j<h; j++) {
                    for (int k = 0; k <w; k++) {
                        sum = sum + this.massive[i][k] * matrix.massive[k][i];
                    }
                    mate.massive[i][j] = sum;
                }
            }
            return mate;
        }
        else {
            System.out.println("Введите правильные размеры матриц");
            return null;
        }
    }
}

