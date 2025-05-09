package Perfect_Checking;

public class Perfect_cube {
    public static void main(String[] args){
        int n = 27;
        boolean flag = false;

        for (int i = 1; (i * i * i) <= n; i++) {
            int cube = i * i * i;
            if (cube == n) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("The Perfect Cube");
        } else {
            System.out.println("It is not a Perfect Cube");
        }
    }
}
