package Cor_4;

import Cor_4.MatrixGenerators;

public class MatrixCalculations {
    public static int sumMainDiagonal(int m[][]) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum = sum + m[i][i];
        }
        return sum;
    }

    public static int sumUnderMainDiagonal(int m[][]) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (i >= j)
                    sum = sum + m[i][j];
            }
        }
        return sum;
    }

    public static int SumVect(int a[], int b[]) {
        int sum = 0;
        for (int d = 0; d < a.length; d++) {
            sum = sum + a[d] * b[d];
        }
        return sum;
    }

    public static int[][] rotateMatrix(int a[][]) {
        int[][] outr = new int[a[0].length][a.length];
        int[] aux = new int[a[0].length * a.length];
        int p = 0;
        for (int j = 0; j < a[0].length; j++) {
            for (int i = 0; i < a.length; i++) {
                aux[p] = a[i][j];
                p++;
            }
        }
        p = 0;
        for (int i = 0; i < outr.length; i++) {
            for (int j = 0; j < outr[0].length; j++) {
                outr[i][j] = aux[p];
                p++;
            }
        }
        return outr;

    }

    public static int[][] matrixMultiplication(int a[][], int b[][]) {
        int[][] out = new int[a.length][b[0].length];
        int[][] c = new int[b[0].length][b.length];
        c = rotateMatrix(b);
        if (a[0].length == b.length) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    out[i][j] = SumVect(a[i], c[j]);

                }
            }
            return out;
        } else
            System.out.println("The multiplication can not be computed!");
        return null;
    }

    public static void main(String[] args) {
        int[][] test_matrix = new int[4][4];
        MatrixGenerators obj = new MatrixGenerators();
        test_matrix = obj.matrix4(4);
        obj.matrixout(test_matrix);
        System.out.println();
        System.out.println("The sum of the elements on the main diagonal is: " + sumMainDiagonal(test_matrix));
        System.out.println();
        System.out.println("The sum of the elements under (and including) the main diagonal is: "
                + sumUnderMainDiagonal(test_matrix));
        System.out.println();
        int[][] a = new int[][] { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        int[][] b = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
        obj.matrixout(a);
        System.out.println();
        obj.matrixout(b);
        System.out.println();
        obj.matrixout(matrixMultiplication(a, b));

    }
}
