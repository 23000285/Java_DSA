package Abstraction;

// In Java, interfaces define a contract that classes can implement, 
// specifying what methods they must provide. Abstract classes, on the other hand, can have both abstract (unimplemented) and concrete (implemented) methods, and serve as a template for subclasses. An interface solely defines the "what," while an abstract class can define both "what" and "how" some methods are implemented. [1, 2, 3]  
// Interfaces: [1, 1, 3, 3]  

// • Define a contract: An interface outlines a set of methods that any class implementing that interface must provide implementations for. [1, 1, 3, 3]  
// • No implementation details: Interfaces only declare the method signatures, not the bodies. [1, 1, 4, 4]  
// • implements keyword: Classes use the implements keyword to declare that they will fulfill the interface's contract. [5, 5]  
// • Multiple inheritance: Classes can implement multiple interfaces, enabling them to inherit from different behaviors, according to a Medium article. [6, 6, 7, 7]  

// Abstract Classes: [8, 8, 9, 9]  

// • Partially implemented: Abstract classes can contain both abstract methods (no body) and concrete methods (with a body). [8, 8, 9, 9]  
// • Inheritance template: Subclasses inherit from abstract classes and must provide implementations for the abstract methods declared in the parent class. [9, 9]  
// • extends keyword: Subclasses use the extends keyword to inherit from an abstract class. [5, 5, 6, 6, 9, 10]  
// • Single inheritance: A class can only inherit from one abstract class. [2, 2, 6, 6]  

// Key Differences: 

// | Feature | Interface | Abstract Class  |
// | --- | --- | --- |
// | Implementation | No implementation provided | Can have both abstract and concrete methods  |
// | Inheritance | Multiple interfaces can be implemented | Only one abstract class can be extended  |
// | Purpose | Defines a contract, specifies what to do | Defines a template, specifies how to do  |
// | Accessing data | Methods in an interface are public by default | Methods in an abstract class can have various access modifiers  |

// Example: 
// // Interface
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
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.makeSound(); // Output: Woof!
        myDog.eat(); // Output: Buddy is eating.
        myDog.giveBirth(); // Output: Dog gives birth.
    }
}

// Generative AI is experimental.

// [1] https://www.geekster.in/articles/interfaces-in-java/[2] https://medium.com/@omershafique/abstract-class-and-interface-45e734f3a8b[3] https://www.geeksforgeeks.org/interfaces-in-java/[4] https://www.geeksforgeeks.org/abstraction-in-java-2/[5] https://www.w3schools.com/java/ref_keyword_implements.asp[6] https://www.youtube.com/watch?v=HvPlEJ3LHgE[7] https://docs.oracle.com/javase/tutorial/java/IandI/usinginterface.html[8] https://www.geeksforgeeks.org/abstract-classes-in-java/[9] https://www.w3schools.com/java/java_abstract.asp[10] https://logicmojo.com/interface-in-java[11] https://logicmojo.com/interface-in-java[12] https://www.oreilly.com/library/view/java-garage/0321246233/0321246233_ch33lev1sec12.html[13] https://harsh05.medium.com/abstract-classes-vs-interfaces-in-java-when-and-how-to-use-them-5ca5d5c825b5[14] https://www.freecodecamp.org/news/java-methods/[15] https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
