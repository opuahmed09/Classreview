package datastructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"PPNT-NY");
        map.put(2,"PPNT-VA");
        map.put(3,"PPNT-NJ");
        System.out.println(map.get(2));

        for (int i =1;i<map.size()+1;i++){
            System.out.println(map.get(i));
        }
    }

}
