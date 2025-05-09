package Constructor;

public class Default_constructor {
    public static void main(String[] args){
        new D_constructor();
    }
}

class D_constructor{
    int id;
    String name;
    int age;
    String address;
    String phnNo;

    D_constructor(){
        System.out.println("Constructor Called");
        id=50;
        name="Venkat";
        address="Babu Street, Pattalam, Chennai";
        System.out.println(name+" "+id+" "+address);
    }
}
