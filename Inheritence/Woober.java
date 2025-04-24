package Inheritence;

public class Woober {
    public static void main(String[] args) {
        // Driver driver= new Driver();
        // System.out.println(driver.name);
        // driver.welcome();

        User user=new User();
        int income=25000000;
        if(income>200000){
            user.premiumUser("Tommy",2122235,"Ravi",21224543);
        }
        else{
            user.normalUser();
        }

    }
}

class wooberUser {
    int id;
    String name;
    int age;
    String address;
    String phoneNo;

    protected void welcome(){

        System.out.println();
    }

}

class User extends wooberUser{
    String petName;
    int petId;

    protected void premiumUser(String name,int id,String us_name,int us_id){
        this.petName=name;
        this.petId=id;

        super.id=us_id;
        super.name=us_name;
        
        System.out.println(petName+super.name);
    }

    protected void normalUser(){

    }
}

class Driver extends wooberUser{

    String vehicleName;
    String vehicleNumber;

    public void welcome(){
        super.welcome();
        System.out.println("hello, he had a happy journey");
    }
}
