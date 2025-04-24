package Arrays;

public class Basic {
    public static void main(String[] args) {
        // String[] defaultNames= new String[10];
        // Arrays.fill(defaultNames,"Hello");

        // // Use Hash Generator website to find the value of hash values
        // // System.out.println(defaultNames);

        // System.out.println(defaultNames[9]);

        // int[] nums=new int[5];
        // Arrays.fill(nums,1);
        // System.out.println(nums[1]);

        // int arr[]={1,5,2,1,21,63};

        // for(int i=0;i<4;i++){
        // if(arr[i]<arr[i+1] || arr[arr.length-2]<arr[arr.length-1]){
        // continue;
        // }
        // else{
        // System.out.println("Not Increasing");
        // continue;
        // }
        // }

        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15

        // int arr1[][]=new int[11][11];

        // int m=1;
        // for(int i=1;i<=10;i++){
        // for(int j=1;j<=i;j++){
        // arr1[i][j]=m;
        // System.out.print(m+" ");
        // m++;
        // }
        // System.out.println();
        // }

        // int arr2[][] = new int[11][11];

        // int m = 1;
        // for (int i = 1; i <= 10; i++) {
        // for (int j = 1; j <= i; j++) {
        // arr2[i][j] = m;
        // System.out.print(m + " ");
        // m--;
        // }
        // System.out.println();
        // }

        // int arr1[][] = new int[11][11];

        // int m = 1;
        // for (int i = 1; i <= 10; i++) {
        // for (int j = 1; j <= i; j++) {
        // arr1[i][j] = m;
        // m++;
        // }
        // }

        // //Reverse of the number
        // for (int i = 10; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(arr1[i][j] + " ");
        // }
        // System.out.println();
        // }

        int m = 1;
        int sp = 10;

        for (int i = 1; i <= 5; i++) {
            // Print spaces
            for (int k = 1; k <= sp; k++) {
                System.out.print("  ");
            }

            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(m + "  ");
                m++;
            }

            sp -= 1; // Reduce spaces for next row
            System.out.println();
        }

        // int age=24;
        // System.out.println(age++);
        // // This is same
        // System.out.println(age++);

        // System.out.println(++age);
        // // This is same
        // System.out.println(age);

        // Very Important Program Twist during method
        // String depts[]={"AI-DS","AI/ML","IOT"};

        // changeDept(depts);

        // System.out.println("First Index in main "+depts[0]);

    }

    // private static void changeDept(String[] depts){
    // depts[0]="AI/DS";
    // System.out.println("First index inside method "+depts[0]);
    // }
}
