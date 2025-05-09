package Switch;

public class Attendance {
    static void putAttendance(boolean b) {
        if (b) {
            System.out.print("Present ");
        } else {
            System.out.print("Absent ");
        }
    }

    static void avoidAttendance(boolean b) {
        if (b) {
            System.out.print("Present ");
        } else {
            System.out.print("Absent ");
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {  // Weeks
            System.out.print("Week " + i + ": ");
            for (int j = 1; j <= 7; j++) {  // Days
                switch (j) {
                    case 1, 2, 3, 4, 5:
                        putAttendance(true);
                        break;
                    case 6, 7:
                        avoidAttendance(false);
                        break;
                }
            }
            System.out.println(); // Move to next line after 7 days
        }
    }
}
