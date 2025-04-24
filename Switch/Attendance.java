package Switch;

public class Attendance {
    static void putAttendance(boolean b) {
        if (b) {
            System.out.print("True ");
        } else {
            System.out.print("False ");
        }
    }

    static void avoidAttendance(boolean b) {
        if (b) {
            System.out.print("True ");
        } else {
            System.out.print("False ");
        }
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            for(int j=1;j<=7;j++){
            switch (j) {
                case 1:
                    putAttendance(true);
                    break;

                case 2:
                    putAttendance(true);
                    break;
                    
                case 3:
                    putAttendance(true);
                    break;
                    
                case 4:
                    putAttendance(true);
                    break;
                    
                case 5:
                    putAttendance(true);
                    break;
                    
                case 6:
                    avoidAttendance(false);
                    break;
                    
                case 7:
                    avoidAttendance(false);
                    break;
            }
            System.out.println("\n");
            }
        }
    }
}
