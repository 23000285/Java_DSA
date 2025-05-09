package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {
    public static void main(String[] args){
        ArrayList<Integer> ar=new  ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);

        Iterator<Integer> itr=ar.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("The List is "+ar);

        //Removing the element
        System.out.println("The removed element is "+ar.remove(1));

        //Get the Element
        System.out.println("The second index is "+ar.get(1));

        //Get the Size of the array
        System.out.println("The Size of the array is "+ar.size());

        //Get last element
        System.out.println("The last element is "+ar.getLast());

        //Get first element
        System.out.println("The first element is "+ar.getFirst());
    }
}
