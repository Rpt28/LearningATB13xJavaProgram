package ex_10_ForLoop;

public class Lab046_Break_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50 ; i++) { // 0 to 49, 50 times
            if( i == 5){
                break; // when break is used the next lines of code is not executed and program stops.
            }else{
                System.out.println(i);
            }
        }

        for (int j = 0; j < 50; j++) { // 0 to 49, 50 times

            if(j ==5){
                continue; // skip the code and move to next iteration of loop
            }
            System.out.println(j);

        }
    }
}
