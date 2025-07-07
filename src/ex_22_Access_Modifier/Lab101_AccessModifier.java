package ex_22_Access_Modifier;

public class Lab101_AccessModifier {
}

class Father {
    private int gold = 10;
    int car = 1;
    public int bhk3 = 1;
}

class Son extends Father {
    void weCanuse() {
//        System.out.println(gold);
        System.out.println(car);
        System.out.println(bhk3);
    }
}
