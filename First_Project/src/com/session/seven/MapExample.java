package com.session.seven;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// put is used to addd elements
		Map<String, Integer> map = new HashMap<>();
		// String,Integer -- String -- key, Integer -- value
		map.put("Dapo", 12);
		map.put("Musty", 11);
		map.put("Solomon", 13);
		map.put("Gbenga", 9);
		map.put("Pradeep", 5);
		map.put("Gbenga", 15);

		// one key ,value could be null
		// if you put duplicte key , then latest will be used
		System.out.println(map);
		// print perople with more than 10 years
		for (Map.Entry<String, Integer> entry : map.entrySet()) {

			if (entry.getValue() >= 10) {
				System.out.println(" Name :" + entry.getKey() + " , value :" + entry.getValue());
			}
		}
		// String val = sc.readnext
		Map<String, Integer> result = validatePassword("apppppddddcf122");
		System.out.println(" >>>" + result);
		for (Map.Entry<String, Integer> entry : result.entrySet()) {

			if (entry.getValue() > 2) {
				System.out.println(" Invalid password, character " + entry.getKey() + " is appearing "
						+ entry.getValue() + " times");
			}
		}

	} 

	public static Map<String, Integer> validatePassword(String input) {
		Map<String, Integer> result = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			String single = String.valueOf(input.charAt(i));
			if (result.get(single) == null) {
				result.put(single, 1);
			} else {
				result.put(single, result.get(single) + 1);
			}
		}
		return result;
	}

}
