package de.zeroco.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapUtility {
	
	public static void main(String[] args) {
		Map<String, String> mapOne = new HashMap<String, String>();
		Map<String, String> mapTwo = new HashMap<String, String>();
		Map<String, String> mapThree = new HashMap<String, String>();
		mapOne.put("Jagadeesh sir", "Team Lead");
		mapOne.put("GuruNath sir", "Senior Developer");
		mapOne.put("Naresh sir", "Senior Developer");
		mapTwo.put("Sujwal", "software Engineer");
		mapTwo.put("Hari Krishna", "Senior Developer");
		mapTwo.put("Praveen", "Software Engineer");
		mapThree.put("Tejaswini", "Trainee");
		mapThree.put("Praveen", "SoftwareEngineer");
		mapThree.put("Hari Krishna", "Software Engineer");
		System.out.println(getValues("Praveen", mapTwo, mapOne, mapThree));
	}

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
