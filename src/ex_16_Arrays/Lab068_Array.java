package ex_16_Arrays;

public class Lab068_Array {
    public static void main(String[] args) {
        int a = 10;
        int[] marks = {91, 90, 51, 100, 91, 92, 89};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[6]);
//        System.out.println(marks[10]); java.lang.ArrayIndexOutOfBoundsException

        boolean[] is_married_people = {true, true, false};

        char c = 'A';
        String name = "pramod";

        // 2nd way to create the array
        int[] mark2 = new int[5]; // Fixed Size , 5, 0 to 4
        String[] names =  new String[3]; // Fixed Size  3, 0 to 2
        names[0] = "pramod";
        names[1] = "Amit";
        names[2] = "Yasho";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
//        System.out.println(names[]);

    }
}
