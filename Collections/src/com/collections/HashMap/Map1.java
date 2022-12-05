package com.collections.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put(null, "A");
		map.put(null, "B");
		map.put("Test3", "C");
	

		Set<Map.Entry<String, String>> entry = map.entrySet();
		for (Entry<String, String> entry2 : entry) {
			System.out.println(entry2.getKey() + " " + entry2.getValue());
		}
		System.out.println(map);

		Map<String, String> linkedHashMap = new LinkedHashMap();
		linkedHashMap.put("Test1", "A");
		linkedHashMap.put("Test2", "B");
		linkedHashMap.put("Test3", "C");

		Set<Map.Entry<String, String>> entry1 = linkedHashMap.entrySet();
		for (Entry<String, String> entry2 : entry1) {
			System.out.println(entry2.getKey() + " " + entry2.getValue());
		}
		System.out.println(linkedHashMap);

		Map<String, String> treeMap = new TreeMap<>();
		treeMap.put("Test1", "A");
		treeMap.put("Test3", "C");
		treeMap.put("Test2", "B");

		Set<Map.Entry<String, String>> entry3 = treeMap.entrySet();
		for (Entry<String, String> entry2 : entry3) {
			System.out.println(entry2.getKey() + " " + entry2.getValue());
		}
		System.out.println(treeMap);
	}
}
