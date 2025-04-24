package Duplicate;

public class List_of_duplicate {
    public static void main(String[] args){
        int nums[]={4,5,9,10,5,9,5};
        boolean flag=false;
        int count;

        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    System.out.println(nums[i]+" Duplicate Element");
                    flag=true;
                    count++;
                    continue;
                }  
            }
            for(int k=0;k<count;k++){
                System.out.println(nums[i]+" Duplicate Element");
            }
        }
        if(flag){
            System.out.println("Duplicate Elements Presents");
        }
        else{
            System.out.println("Duplicate Element is not Present");
        }

    }
}
