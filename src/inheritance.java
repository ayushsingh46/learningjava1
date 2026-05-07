public class inheritance {
    // Main class
    public static void main(String[] args) {

                Dog dog = new Dog("Bruno");

                dog.eat();    // inherited from Animal
                dog.sleep();  // inherited from Animal
                dog.bark();   // Dog's own method
            }
        }
    // Parent class
    class Animal {
        String name;

        Animal(String name) {
            this.name = name;
        }

        void eat() {
            System.out.println(name + " is eating");
        }

        void sleep() {
            System.out.println(name + " is sleeping");
        }
    }

    // Child class inheriting Animal
    class Dog extends Animal {

        Dog(String name) {
            super(name); // calls Animal's constructor
        }

        void bark() {
            System.out.println(name + " is barking");
        }
    }



