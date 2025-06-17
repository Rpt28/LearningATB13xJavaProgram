package ex_10_ForLoop;

public class Lab042_IQ {
    public static void main(String[] args) {
        for (int i = 0; i > 1 ; i++) { // here we are checking if 0>1 which is not correct.
            System.out.println(i);
        }
        System.out.println("End");

        for (int j = -1; j < -10 ; j--) {
            System.out.println(j);
        }

        for (int i = 0; ; i++) { // never ending loop so do not write any logic below this as those will be untouched.
            System.out.println(i);
        }
        // exit code 130 (Stop by Yourself- Kill) Red Button - interrupted by signal
        // exit code 0 - Successful


    }
}
