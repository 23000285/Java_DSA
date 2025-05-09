package Perfect_Checking;

public class Perfect_Square {
    public static void main(String[] args){
        int n = 16;
        boolean flag = false;

        for (int i = 1; (i * i) <= n; i++) {
            int sq = i * i;
            if (sq == n) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("The Perfect Square");
        } else {
            System.out.println("It is not a Perfect Square");
        }
    }
}

