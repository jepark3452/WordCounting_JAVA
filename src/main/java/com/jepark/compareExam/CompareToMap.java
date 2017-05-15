package com.jepark.compareExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompareToMap {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// map: {A=9, DEVELOPER=2, HAHA=1, ARE=5, I=3, AM=2, TOO=-1, YOU=7, YES=0, WHO=8}
		// map은 WORD : COUNT 로 이루어져 있다. COUNT 값으로 오름차순 정렬 또는 내림차순 정렬하시오.
	
		final Map<String, Integer> wordMap = new HashMap<String, Integer>();
		wordMap.put("A", 9);
		wordMap.put("DEVELOPER", 1);
		wordMap.put("HAHA", 1);
		wordMap.put("ARE", 5);
		wordMap.put("I", 3);
		wordMap.put("AM", 2);
		wordMap.put("TOO", -1);
		wordMap.put("YOU", 7);
		wordMap.put("YES", 0);
		wordMap.put("WHO", 8);
		
		List<String> keyList = new ArrayList<String>(wordMap.keySet());
		
		System.out.println(" ---- COUNT 값 기준 오름차순 ----");
		Collections.sort(keyList, new Comparator() {

			public int compare(Object o1, Object o2) {
				
				int m1 = wordMap.get(o1).intValue();
				int m2 = wordMap.get(o2).intValue();
				
				return m1 > m2 ? 1 : m1 < m2 ? -1 : 0;
			}
		});
		for(String key : keyList) {
			
			int value = wordMap.get(key);
			System.out.println(key + " : " + value);
		}
		
		System.out.println("\n---- COUNT 값 기준 내림차순 ----");
		Collections.sort(keyList, new Comparator() {

			public int compare(Object o1, Object o2) {
				
				int m1 = wordMap.get(o1).intValue();
				int m2 = wordMap.get(o2).intValue();
				
				return m1 > m2 ? -1 : m1 < m2 ? 1 : 0;		// COUNT 값 기준 내림차순
			}
		});
		for(String key : keyList) {
			int value = wordMap.get(key);
			System.out.println(key + " : " + value);
		}
		
		System.out.println("\n---- 최대, 최소 COUNT 값 구하기 ----");
		int maxCount = Collections.max(wordMap.values()).intValue();
		int minCount = Collections.min(wordMap.values()).intValue();
		for(String key : keyList) {
			
			if(maxCount == (Integer) wordMap.get(key).intValue()) {
				
				int value = wordMap.get(key);
				System.out.println("최대COUNT--> " + key + " : " + value);
			} else if (minCount == (Integer) wordMap.get(key).intValue()) {
				
				int value = wordMap.get(key);
				System.out.println("최소COUNT--> " + key + " : " + value);
			}
		}
	}
}
