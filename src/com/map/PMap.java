package com.map;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PMap {
	public static void getSpecepicValue(Map<Integer, String> test) {
		System.out.println(test.get(200));

	}

	public static void checkingspecifiedKeyAndValue(Map<Integer, String> test) {
		System.out.println(test.get(200));

	}

	public static void RemovedAndReplacing(Map<Integer, String> test) {
		String removedValue = test.remove(500);

		if (removedValue != null) {
			System.out.println("Removed value: " + removedValue);
		}

		System.out.println("Map before: " + test);

		test.replace(304, "No Changes");

		System.out.println("Map after: " + test);

	}

	public static void keySetAnValuesAndEntrySet(Map<String, String> mapCountryCodes) {
		Set<String> setCodes = mapCountryCodes.keySet();
		Iterator<String> iterator = setCodes.iterator();
		System.out.println(
				"===============keySet(): returns a Set view of the keys contained in the map.=================");
		while (iterator.hasNext()) {
			String code = iterator.next();
			String country = mapCountryCodes.get(code);

			System.out.println(code + " => " + country);
		}
		
		System.out.println(
				"=============== values(): returns a collection of values contained in the map.=================");
		Collection<String> countries = mapCountryCodes.values();
		 
		for (String country : countries) {
		    System.out.println(country);
		}
		
		System.out.println(
				"===============entrySet(): returns a Set view of the mappings contained in this map. =================");
		
		Set<Map.Entry<String, String>> entries = mapCountryCodes.entrySet();
		 
		for (Map.Entry<String, String> entry : entries) {
		    String code = entry.getKey();
		    String country = entry.getValue();
		 
		    System.out.println(code + " => " + country);
		}
		
		
	}
	
	static void insertAndPrint(AbstractMap<Integer, String> map)
    {
        int[] array= {-2, 1, -1, 0, 2};
        for (int x: array)
        {
            map.put(x, Integer.toString(x));
        }
        for (int k: map.keySet())
        {
            System.out.print(k + ", ");
        }
    }

	public static void main(String[] args) {
		Map<Integer, String> mapHttpErrors = new HashMap<>();
		mapHttpErrors.put(400, "Bad Request");
		mapHttpErrors.put(304, "Not Modified");
		mapHttpErrors.put(200, "OK");
		mapHttpErrors.put(301, "Moved Permanently");
		mapHttpErrors.put(500, "Internal Server Error");

		Map<String, String> mapCountryCodes = new HashMap<>();

		mapCountryCodes.put("1", "USA");
		mapCountryCodes.put("44", "United Kingdom");
		mapCountryCodes.put("33", "France");
		mapCountryCodes.put("81", "Japan");

		PMap.getSpecepicValue(mapHttpErrors);
		PMap.RemovedAndReplacing(mapHttpErrors);
		PMap.keySetAnValuesAndEntrySet(mapCountryCodes);
		
		System.out.println(
				"===============LinkedHashMap=================");
		
		Map<String, String> mapContacts = new LinkedHashMap<>();
		LinkedHashMap<Integer, String> mapContacts2 = new LinkedHashMap<>();
		mapContacts.put(null, null);
		mapContacts.put("0169238175", "Tom");
		mapContacts.put("0945678912", "Mary");
		mapContacts.put("0981127421", "John");
		 
		System.out.println(mapContacts);
		
		insertAndPrint(mapContacts2);
		System.out.println(
				"===============TreeMap=================");	
		Map<String, String> mapLang = new TreeMap<>();
		 
		mapLang.put(".c", "C");
		mapLang.put(".java", "Java");
		mapLang.put(".apl", "Perl");
		mapLang.put(".cs", "C#");
		mapLang.put(".php", "PHP");
		mapLang.put(".cpp", "C++");
//		mapLang.put(null, null);
//		mapLang.put(".l", null);
		mapLang.put(".xml", "XML");
		 
		System.out.println(mapLang);
	}
}
