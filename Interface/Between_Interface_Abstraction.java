package Interface;

interface Animal {
    void makeSound(); // Abstract method (no implementation)
}

// Abstract Class
abstract class Mammal {
    protected String name; // Concrete field

    public Mammal(String name) {
        this.name = name;
    }

    public void eat() { // Concrete method
        System.out.println(name + " is eating.");
    }

    public abstract void giveBirth(); // Abstract method
}

// Class implementing the interface and extending the abstract class
class Dog extends Mammal implements Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void giveBirth() {
        System.out.println("Dog gives birth.");
    }
}

// Main class to demonstrate usage
public class Between_Interface_Abstraction {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.makeSound(); // Output: Woof!
        myDog.eat(); // Output: Buddy is eating.
        myDog.giveBirth(); // Output: Dog gives birth.
    }
}


