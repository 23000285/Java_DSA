package Switch;

public class Switch {
    public static void main(String[] args){
        // Create the menu based question for the choosing of the faculty members and who can able to access and talk with hod
        // This is just for an example
        for(int i=0;i<=5;i++){
            switch(i){
                case 1:
                    System.out.println("I");
                    break;

                case 2:
                    System.out.println("II");
                    break;

                case 3:
                    System.out.println("III");
                    break;

                case 4:
                    System.out.println("IV");
                    break;

                case 5:
                    System.out.println("V");
                    break;

                default:
                    System.out.println("INVALID ROMAN NUMBER");
                    break;

            }
        }
    }
}
