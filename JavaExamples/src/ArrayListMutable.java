package java_17.Streams.ArrayAsList;

import java.util.Arrays;
import java.util.List;

public class ArrayListMutable {

    public static void main(String[] args){
        
        System.out.println("Difference between Arrays.asList() and List.Of() Array List");
        System.out.println("Muttable behavior of Array List");


        /* if add() is used will get exception , if set() is used elements can be modified*/
        List<Integer> myList  = Arrays.asList(1,2,3,4);


        /* Only Immutable behavior*/
        List<Integer> myList2 = List.of(4,5,6,89);
        try {
            //myList.add(5);
            myList2.add(5);
            System.out.println("My List 2 : "+myList2);
        } catch (Exception e) {
            System.err.println("Exception:"+e);
        }
        

        try {
            myList.set(2, 6);
            System.out.println("New element is set in the list. "+myList);
        } catch (Exception e) {
        System.err.println("Exception : "+e);
        }
    }
    
}