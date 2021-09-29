package com.map;

import java.util.*;
import java.util.stream.Collectors;

public class ConvertHasMapToAnother {
	
	public static <K, V> Map<K, V> convertToTreeMapUsePlainJava(Map<K, V> hashMap)
    {
        // Create a new TreeMap
        Map<K, V> treeMap = new TreeMap<>();
  
        // Pass the hashMap to putAll() method
        treeMap.putAll(hashMap);
  
        // Return the TreeMap
        return treeMap;
    }
	
	
	public static <K, V> Map<K, V> convertToTreeMapUseStream(Map<K, V> hashMap)
    {
        Map<K, V>
            treeMap = hashMap
                          // Get the entries from the hashMap
                          .entrySet()
  
                          // Convert the map into stream
                          .stream()
  
                          // Now collect the returned TreeMap
                          .collect(
                              Collectors
  
                                  // Using Collectors, collect the entries
                                  // and convert it into TreeMap
                                  .toMap(
                                      Map.Entry::getKey,
                                      Map.Entry::getValue,
                                      (oldValue,
                                       newValue)
                                          -> newValue,
                                      TreeMap::new));
  
        // Return the TreeMap
        return treeMap;
    }
	
    // Conversion between incompatible types
   // Function to construct a new TreeMap from HashMap
    public static Map<Integer, String> 
               convertToTreeMap(Map<String, String> hashMap)
    {
        // Create a new TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();
  
        // Convert the HashMap to TreeMap manually
        for (Map.Entry<String, String> e : hashMap.entrySet()) {
//            treeMap.put(Integer.parseInt(e.getKey()), e.getValue());
        	
        }
  
        // Return the TreeMap
        return treeMap;
    }
	
	public static void main(String[] args) {
		// Create a HashMap
        Map<String, String> hashMap = new HashMap<>();
  
        // Add entries to the HashMap
        hashMap.put("1", "Geeks");
        hashMap.put("2", "forGeeks");
        hashMap.put("3", "A computer Portal");
  
        // Print the HashMap
        System.out.println("HashMap: " + hashMap);
  
        // construct a new TreeMap from HashMap
        System.out.println("========using stream api==================");
        Map<String, String> treeMap = convertToTreeMapUseStream(hashMap);
  
        // Print the TreeMap
        System.out.println("TreeMap: " + treeMap);
        
        System.out.println("========using plain java==================");
        treeMap=convertToTreeMapUsePlainJava(hashMap);
     // Print the TreeMap
        System.out.println("TreeMap: " + treeMap);
        
        System.out.println("========Conversion between incompatible types==================");
        Map<Integer, String> treeMap1=convertToTreeMap(hashMap);
       
     // Print the TreeMap
        System.out.println("TreeMap: " + treeMap1);
	}
	
}
