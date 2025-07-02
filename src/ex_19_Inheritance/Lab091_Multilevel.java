package ex_19_Inheritance;

public class Lab091_Multilevel {
    class Animal {
        void eat() {
            System.out.println("Animal is eating");
        }
    }

    class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking");
        }
    }

    class BabyDog extends Dog {
        void weep() {
            System.out.println("Baby dog is weeping");
        }
    }

    public class TestMultilevelInheritance {
        public void main(String[] args) {
            BabyDog bd = new BabyDog();
            bd.eat();   // From Animal
            bd.bark();  // From Dog
            bd.weep();  // From BabyDog
        }
    }

}
