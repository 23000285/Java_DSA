package Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Encapsulation_New ep = new Encapsulation_New();

        // Through the method I can able to access and insert the values

        ep.setId(212223);

        System.out.println(ep.getId());

        // So it is private, so we can't access it

        // ep.setAge(25);

        // System.out.println(ep.age);
    }
}

class Encapsulation_New {

    private int id;
    private String name;
    private int age;
    private String address;
    private String phnNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhnNo() {
        return phnNo;
    }

    public void setPhnNo(String phnNo) {
        this.phnNo = phnNo;
    }

}
