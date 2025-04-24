package Constructor;

public class parameterized {
    public static void main(String[] args) {
        Parameterized_constructor pc = new Parameterized_constructor("Leo Parthiban", 21222324, 19);
        pc.display();
        pc.name = "Venkat";
        pc.display();
    }
}

class Parameterized_constructor {
    int id;
    String name;
    int age;
    String address;
    String phnNo;

    Parameterized_constructor(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    void display() {
        System.out.println(name);
    }

    Parameterized_constructor() {
        System.out.println("Constructor Called");
    }
}
