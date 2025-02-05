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
    
}