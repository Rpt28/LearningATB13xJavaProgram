package ex_16_Arrays;

import java.util.Scanner;

public class Lab080_Print2DArray {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // 3x3
        // R -> 3
        // C -> 3

        // 1,2,3
        // 4,5,6
        // 7,8,9
        System.out.println(matrix.length);
        System.out.println();
        for (int i = 0; i < matrix.length; i++) { // 0,1,2
            for (int j = 0; j < matrix[i].length; j++) { //0,1,2
                //System.out.print(matrix[i][j] + " | ");
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int n = 5;
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        int m = 5;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
