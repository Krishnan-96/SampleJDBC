package com.pack;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringOccurunce {
	public static void main(String[] args) {
		String str = "Gopala Krishnan";

		char maxChar = ' ';
		int maxValue = 0;

		char[] cs = str.toCharArray();

		Map<Character, Integer> m = new LinkedHashMap<>();
		Map<Character, Integer> m1 = new LinkedHashMap<>();

		for (char d : cs) {
			if (d == ' ') {
				continue;
			} else if (m.containsKey(d)) {
				Integer no = m.get(d);
				m.put(d, no + 1);

			} else {
				m.put(d, 1);
			}
		}
		System.out.println(m);

		// ===============================================
		// Remove Duplicate
//	Set<Entry<Character,Integer>> s = m.entrySet();
//	for(Entry<Character,Integer> h :s) {
//		Character ch = h.getKey();
//		if(m.get(ch)==1) {
//			m1.put(ch, 1);
//		}
//	}
//	System.out.println(m1);
//	==========================================================================================
		// max Character
		Set<Entry<Character, Integer>> s = m.entrySet();
		for (Entry<Character, Integer> key : s) {
			Integer value = key.getValue();
			if (value > maxValue) {
				maxChar = key.getKey();
				maxValue = key.getValue();
			}
		}
		System.out.println(maxChar + " = " + maxValue);
	}
}
