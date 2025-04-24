package Polymorphism;

public class poly_OverRiding {
    public static void main(String[] args){
        Anil anil=new Anil();
        anil.makeSound();
    }
    
}

class Animal{
    public void makeSound(){
        System.out.println("Animal Sound");
    }
}

class Anil extends Animal{
    @Override

    public void makeSound(){
        System.out.println("keech Keech");
    }
}