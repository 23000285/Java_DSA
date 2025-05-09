interface Payment_method {
    public String debit();
    public void credit();
}

class ATM implements Payment_method {
    public String debit() {
        return "Amount debited using ATM";
    }

    public void credit() {
        System.out.println("Amount credited using ATM");
    }
}

public class Payment_interface {
    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println(atm.debit());
        atm.credit();
    }
}
