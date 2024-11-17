package HASHSET;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();

        //Insert element
         set.add(1);
         set.add(2);
         set.add(3);
         set.add(1);
         System.out.println(set.size());
         System.out.println(set);

         //search element

        /*  if(set.contains(1)){
            System.out.println(" Set contain 1");
         }
         if(!set.contains(5)){
            System.out.println("doesn't contain 5");
         }*/

        /* set.remove(1);
         if(!set.contains(1)){
            System.out.println("Contain 1 delete");
         }*/

         Iterator it=set.iterator();

         while(it.hasNext()){
            System.out.println(it.next());
         }
    }
    
}
