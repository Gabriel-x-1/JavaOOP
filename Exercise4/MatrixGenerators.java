package Cor_4;

import java.util.*;

public class MatrixGenerators {
    public static void matrixout(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrix1(int size) {
        int[][] matrix = new int[size][size];
        int cont = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = cont;
                cont++;
            }
        }
        return matrix;
    }

    public static int[][] matrix2(int size) {
        int[][] matrix = new int[size][size];
        int cont = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[j][i] = cont;
                cont++;
            }
        }
        return matrix;
    }

    public static int[][] matrix3(int size) {
        int[][] matrix = new int[size][size];
        int cont = 1;
        for (int i = 0; i < size; i = i + 2) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = cont;
                cont++;
            }
            cont = cont + size;
        }
        cont = size + 1;
        for (int i = 1; i < size; i = i + 2) {
            for (int j = size - 1; j >= 0; j--) {
                matrix[i][j] = cont;
                cont++;
            }
            cont = cont + size;
        }
        return matrix;
    }

    public static int[][] matrix4(int size) {
        int[][] matrix = new int[size][size];
        int cont = 1;
        for (int p = 0; cont <= size * size; p++) {
            for (int i = 0 + p; i < size - p; i++) {
                matrix[0 + p][i] = cont;
                cont++;
            }

            for (int i = 1 + p; i < size - p; i++) {
                matrix[i][size - 1 - p] = cont;
                cont++;
            }

            for (int i = size - 2 - p; i >= 0 + p; i--) {
                matrix[size - 1 - p][i] = cont;
                cont++;
            }

            for (int i = size - 2 - p; i > 0 + p; i--) {
                matrix[i][0 + p] = cont;
                cont++;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        matrixout(matrix1(n));
        System.out.println();
        matrixout(matrix2(n));
        System.out.println();
        matrixout(matrix3(n));
        System.out.println();
        matrixout(matrix4(n));
        scan.close();
    }
}