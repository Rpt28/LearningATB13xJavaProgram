package ex_17_OOPs;

public class Lab081_OOPs {
    Lab081_OOPs() {
        System.out.println("DC - Main Class");
    }

    public static void main(String[] args) {
        Cat c1 = new Cat();
        new Cat();
        Cat c2;

        c1.running();
        // c2.running();
        new Cat().running();


    }
}

class Cat {
    String name; // null

    void running() {
        System.out.println("Running");
    }

    class Lab169 {
        public static void main(String[] args) {
            System.out.println("169!");
        }
    }

    class Lab170 {
        public static void main(String[] args) {
            System.out.println("170");
        }
    }

    class Lab171 {
        public static void main(String[] args) {
            System.out.println("171");
        }
    }
}
