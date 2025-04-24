package Constructor;

public class Basic_Contructor {
    public static void main(String[] args){
        new Basic_constructor();
    }
}

class Basic_constructor{
    int id;
    String name;
    int age;
    String address;
    String phnNo;

    Basic_constructor(){
        System.out.println("Constructor Called");
        id=50;
        name="Venkat";
        address="Babu Street, Pattalam, Chennai";
        System.out.println(name+" "+id+" "+address);
    }
}
