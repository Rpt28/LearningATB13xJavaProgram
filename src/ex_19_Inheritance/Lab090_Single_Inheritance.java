package ex_19_Inheritance;

public class Lab090_Single_Inheritance {
    // Parent class
    class Animal {
        void eat() {
            System.out.println("Animal is eating");
        }
    }

    // Child class
    class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking");
        }
    }

    // Main
    public class TestSingleInheritance {
        public void main(String[] args) {
            Dog d = new Dog();
            d.eat();  // Inherited method
            d.bark(); // Child's own method
        }
    }

}
