package Hashing.Basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
//        Creating the Hashmap with default initial capacity
        HashMap<String,Integer> map = new HashMap<>();
//        Creating HashMap with custom initial capacity
        HashMap<String,Integer> map2 = new HashMap<>(30);
//        Creating HashMap with custom initial capacity and Load factor
        HashMap<String,Integer> map3 = new HashMap<>(30,0.75f);
//        Creating HashMap by copying another HashMap
        HashMap<String,Integer> map4 = new HashMap<>(map3);
//        Inserting the key-value pairs to map using put() method
        map.put("ONE",1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        map.put("FOUR", 4);
        map.put("FIVE", 5);
//        Printing key-value pairs
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        for(Map.Entry<String,Integer>entry:entrySet){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("------------------");
        map2.put("SIX",6);
        map2.put("SEVEN",7);
//        Inserting key-value of another map using putAll() method
        map2.putAll(map);
//        Another way of printing key-value pair
        entrySet = map2.entrySet();
        for (Map.Entry<String,Integer> entry : entrySet){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
