public class New_abstract {
    public static void main(String[] args) {
        // Vehicle veh=new Vehicle();

        Car car = new Car();

    }
}

abstract class Vehicle {
    int vehId;
    String name;

    public abstract void complyRegls();

    // Concrete Method Important

    public void Concrete_method() {
        System.out.println("This is concrete method");
    }

    public abstract void capacity();
}

class Car extends Vehicle {

    @Override
    public void complyRegls() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void capacity() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

interface location{
    public void cleanLocation();

    public void hourlyMessage();
}

interface defaultUser{
    public void showIdCard();

    public void hourlyMessage();
}

class serviceManager implements location, defaultUser{

    @Override
    public void showIdCard() {
        System.out.println("Hellow my Id is 121");
    }

    @Override
    public void cleanLocation() {
        System.out.println("Oh I clean the Location");
    }

    @Override
    public void hourlyMessage() {
        System.out.println("I will message it one hour wait");
    }
    
}