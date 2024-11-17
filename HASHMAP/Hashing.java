package HASHMAP;

import java.util.HashMap;
import java.util.Set;

public class Hashing {
     public static void main(String[] args) {
        HashMap<String ,Integer> map= new HashMap<>();

        map.put("india",120);
        map.put("pune",130);
        map.put("mumbai",140);
        map.put("chd",150);
        map.put("delhi",160);

        System.out.println(map);

        if(map.containsKey("india")){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
     Set<String> key=map.keySet();
     for(String keys:key){
        System.out.println(keys+" "+map.get(keys));
     }
       
     }
}