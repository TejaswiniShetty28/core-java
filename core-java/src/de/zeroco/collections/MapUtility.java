package de.zeroco.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapUtility {
	
	public static List<String> getValues(String key, Map<String, String>... maps) {
        List<String> values = new ArrayList<>();
        for (Map<String, String> map : maps) { 
            if (map.containsKey(key)) { 
                values.add(map.get(key)); 
            }
        }
        return values; 
    }
}
