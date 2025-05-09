package Inheritence;

public class Woober {
    public static void main(String[] args) {
        AppUser user = new AppUser();
        int income = 25000000;

        if (income > 200000) {
            user.premiumUser("Tommy", 2122235, "Ravi", 21224543);
        } else {
            user.normalUser();
        }
    }
}

class WooberUser {
    int id;
    String name;
    int age;
    String address;
    String phoneNo;

    protected void welcome() {
        System.out.println("Welcome to Woober!");
    }
}

class AppUser extends WooberUser {
    String petName;
    int petId;

    protected void premiumUser(String petName, int petId, String userName, int userId) {
        this.petName = petName;
        this.petId = petId;
        super.name = userName;
        super.id = userId;

        welcome();
        System.out.println(petName + " is a pet of " + super.name);
    }

    protected void normalUser() {
        welcome();
        System.out.println("Welcome, normal user!");
    }
}

class Driver extends WooberUser {
    String vehicleName;
    String vehicleNumber;

    public void welcome() {
        super.welcome();
        System.out.println("Hello, the driver had a happy journey!");
    }
}
