package com.jepark.WordCounting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WordCount {
	
	public static Logger logger = LoggerFactory.getLogger(WordCount.class);

	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		
		String path = WordCount.class.getResource("").getPath();
		//String fileName = "test.txt";
		String fileName = "The-Wonderful-Wizard-of-Oz.txt";
		final HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		BufferedReader br = null;
		LineNumberReader lr = null;
		
		try {
			String line;
			String word;
			StringTokenizer st;
			
			/*lr = new LineNumberReader(new FileReader(new File(path, fileName)));
			while((line = lr.readLine()) != null) {
				System.out.println((lr.getLineNumber() + " : " + line);
				logger.debug(lr.getLineNumber() + " : " + line);
			}*/
			
			br = new BufferedReader(new FileReader(new File(path, fileName)));
			
			while((line = br.readLine()) != null) {
				
				//st = new StringTokenizer(line, "\"|\'|?|!|.|,|;");
				st = new StringTokenizer(line);
				/*System.out.println(line);
				System.out.println("st.countTokens(): " + st.countTokens());
				//logger.debug("line: " + line);
				//logger.debug("st.countTokens(): " + st.countTokens());*/				
				
				while(st.hasMoreTokens()) {
					
					word = st.nextToken().toUpperCase();
					
					if(map.containsKey(word)) {
						
						Integer count = (Integer) map.get(word);
						map.put(word, new Integer(count.intValue() + 1));
					} else {
						
						map.put(word, new Integer(1));
					}
				}
			}
			
			//System.out.println("@@@ map: " + map.toString());
			ArrayList<String> arrayList = new ArrayList<String>(map.keySet());
			Collections.sort(arrayList, new Comparator() {
				
				public int compare(Object o1, Object o2) {
					
					Object v1 = map.get(o1);
					Object v2 = map.get(o2);
					
					//return ((Comparable) v1).compareTo(v2);	// count 오름차순
					return ((Comparable) v2).compareTo(v1);	// count 내림차순
				}
			});
			
			for(int i = 0; i < arrayList.size(); i++) {
				
				String key = (String) arrayList.get(i);
				Integer count = (Integer) map.get(key);
				System.out.println(key + " : " + count);
			}
			
			// 최대 WORD COUNT, 최소 WORD COUNT
			//System.out.println("\n최대 WORD COUNT, 최소 WORD COUNT -----------");
			System.out.println("\n최대 WORD COUNT -----------");
			int maxCount = Collections.max(map.values()).intValue();
			int minCount = Collections.min(map.values()).intValue();
			for(String key : arrayList) {
				
				if(maxCount == (Integer) map.get(key).intValue()) {
					
					int value = map.get(key);
					//System.out.println("최대 WORD COUNT--> " + key + " : " + value);
					System.out.println(key + " : " + value);
				} else if (minCount == (Integer) map.get(key).intValue()) {
					
					int value = map.get(key);
					//System.out.println("최소 WORD COUNT--> " + key + " : " + value);
				}
			}
			
			// 상위 3개의 WORD COUNT
			System.out.println("\n상위 3개의 WORD COUNT -----------");
			for(int i = 0; i < 3; i++) {
				
				String key = (String) arrayList.get(i);
				int value = (Integer) map.get(key).intValue();
				System.out.println(key + " : " + value);
			}
			
			// 상위 5개의 WORD별 비율
			System.out.println("\n상위 5개의 WORD별 비율 -----------");
			double totCount = 0;
			
			for(String key : arrayList) {
				
				totCount += map.get(key);
			}
			for(int i = 0; i < 5; i++) {
				
				String key = (String) arrayList.get(i);
				int count = (Integer) map.get(key).intValue();
				long ratio = Math.round((count / totCount)*100);
				
				System.out.println(key + " : " + ratio + "%");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
				
				if(lr != null) {
					lr.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
