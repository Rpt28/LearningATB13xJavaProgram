package ex_09_Switch;

public class Lab039_Jdk13_Switch {
    public static void main(String[] args) {
        // in JDK > 13
        //  No need of break keyword
        // one line supported.
        int itemCode = 002;
        switch (itemCode) {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
        }
        int itemcode = 006;

        switch (itemcode){
            case 001,002,005:
                System.out.println("All of the them are Electronic Gadget");
                System.out.println("All of the them are Electronic Gadget");
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mech Gadget");
                System.out.println("This is Mech Gadget");
                System.out.println("This is Mech Gadget");
                System.out.println("This is Mech Gadget");
                break;
            default:
                System.out.println("None");
        }
    }
}
