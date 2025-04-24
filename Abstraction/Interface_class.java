// package Abstraction;

// interface location{
//     public void cleanLocation();

//     public void hourlyMessage();
// }

// interface defaultUser{
//     public void showIdCard();

//     // public void hourlyMessages();

//     public static void hourlyMessage(){
//         System.out.println("Hello this is interface class. Be aware");
//     }
// }

// class serviceManager implements location, defaultUser{

//     public static void main(String[] args) {
//         defaultUser.hourlyMessage();
//     }

//     @Override
//     public void showIdCard() {
//         System.out.println("Hellow my Id is 121");
//     }

//     @Override
//     public void cleanLocation() {
//         System.out.println("Oh I clean the Location");
//     }

//     @Override
//     public void hourlyMessage() {
//         System.out.println("I will message it one hour wait");
//     }
    
// }

// public class Interface_class {
//     public static void main(String[] args) {
//         serviceManager sm = new serviceManager();
//         sm.showIdCard();
//         sm.cleanLocation();
//         sm.hourlyMessage();

//         defaultUser.hourlyMessage(); 
//     }
// }

