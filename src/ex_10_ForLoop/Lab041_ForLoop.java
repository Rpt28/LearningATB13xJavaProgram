package ex_10_ForLoop;

public class Lab041_ForLoop {
    public static void main(String[] args) {
        // For Loop
        // Help you to repeat a block of code.

        // Initialization -> Condition -> Updation(Incre/decre)
        // ICU
        // for ( I ; C ; U )
        for (int i = 0; i < 10; i++) {
            System.out.println(i); //0 to 9 , Times Run  :  10
        }

        for (int aditi = 0; aditi < 10; aditi++) {//variable name can also be customised like using any name instead of i
            System.out.println(aditi);
        }

        for (int _1 = 0; _1 <= 10; _1++) { // 11 times // this is alo a valid variable name _1
            System.out.println(_1); // 0, to 10
        }

        for (long i = 1l; i < 10; i++) { // we can also use float or double but not recommended
            System.out.println(i);
        }
        for (float f = 0.0f; f < 10.67; f++) {
            System.out.println("Hi,Float -> " + f);
        }
    }
}
