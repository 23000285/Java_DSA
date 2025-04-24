package Inheritence;

public class Main {
    public static void main(String[] args){
        Students st=new Students("Venkat",19,"Male");
        Staff sf=new Staff("Kalki",45,"Male");

        st.students_details();
        sf.staff_details();

    }
}

class College{
    String stud_name,stud_gender;
    int stud_age;


    public void students_details(){
        System.out.println(stud_name+stud_age+stud_gender);
    }

    String staff_name,staff_gender;
    int staff_age;

    public void staff_details(){
        System.out.println(staff_name+staff_age+staff_gender);
    }
}

class Students extends College{
    Students(String name,int age,String gender){
        this.stud_name=name;
        this.stud_age=age;
        this.stud_gender=gender;
    }
}

class Staff extends College{
    Staff(String name,int age,String gender){
        this.staff_name=name;
        this.staff_age=age;
        this.staff_gender=gender;
    }
}
