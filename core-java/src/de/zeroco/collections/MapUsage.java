package de.zeroco.collections;

//import java.util.HashMap;
import java.util.Map;

public class MapUsage {
	
	public static boolean addElement(Map<String, Integer> map, String key, Integer value) {
        map.put(key, value);
        return true;
    }

    public static Integer get(Map<String, Integer> map, String key) {
        return map.get(key);
    }

    public static Integer remove(Map<String, Integer> map, String key) {
        return map.remove(key); 
    }

    public static boolean containsKey(Map<String, Integer> map, String key) {
        return map.containsKey(key); 
    }

    public static boolean containsValue(Map<String, Integer> map, Integer value) {
        return map.containsValue(value); 
    }

    public static void printKeySet(Map<String, Integer> map) {
        System.out.println(map.keySet()); 
    }

    public static void printValues(Map<String, Integer> map) {
        System.out.println(map.values()); 
    }

    public static Integer replace(Map<String, Integer> map, String key, Integer value) {
        return map.replace(key, value); 
    }

    public static boolean replace(Map<String, Integer> map, String key, Integer oldValue, Integer newValue) {
        return map.replace(key, oldValue, newValue); 
    }
    
//    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//        addElement(map, "a", 1);
//        addElement(map, "b", 2);
//        addElement(map, "c", 3);
//        addElement(map, "d", 4);
//        addElement(map, "e", 5);
//        
//        System.out.println("Initial Map: " + map);
//        System.out.println("Get 'b': " + get(map, "b"));
//        System.out.println("Remove 'c': " + remove(map, "c"));
//        System.out.println("Contains Key 'a': " + containsKey(map, "a"));
//        System.out.println("Contains Value 4: " + containsValue(map, 4));
//        
//        System.out.print("Key Set: ");
//        printKeySet(map);
//        
//        System.out.print("Values: ");
//        printValues(map);
//        
//        System.out.println("Replace 'd' with 9: " + replace(map, "d", 9));
//        System.out.println("Replace 'a' from 1 to 9: " + replace(map, "a", 1, 9));
//        
//        System.out.println("Final Map: " + map);
//    }
}