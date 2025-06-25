package ex_16_Arrays;

import java.util.Arrays;

public class Lab075_Task_SecondHighest {
    public static void main(String[] args) {
        // Find Second Largest Number in an Array

        int A[] = { 12, 34, 10, 1, 100, 3, 4, 32 };
        int i = 0, j = 0, Firsthigh = A[0], Sechigh = A[1];
        for (i = 0; i < A.length; i++) {
            if (A[i] >= Firsthigh) {
                Firsthigh = A[i];
            }
            for (j = 0; j < A.length; j++) {
                if (A[j] < Firsthigh && A[j] >= Sechigh) {
                    Sechigh = A[j];
                }
            }
        }
        System.out.println("First highest value is : " + Firsthigh);
        System.out.println("Second highest value is : " + Sechigh);
    }
}
