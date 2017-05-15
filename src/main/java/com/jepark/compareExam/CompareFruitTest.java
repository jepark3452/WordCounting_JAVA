package com.jepark.compareExam;

import java.util.Arrays;
import java.util.Comparator;

public class CompareFruitTest {

	public static void main(String[] args) {
		
		Fruit[] fruits = new Fruit[4];
		fruits[0] = new Fruit("Pineapple", 70);
		fruits[1] = new Fruit("Apple", 30);
		fruits[2] = new Fruit("Orange", 35);
		fruits[3] = new Fruit("Banana", 50);
		
		System.out.println("Arrays.sort(fruits) price desc START ----");
		Arrays.sort(fruits);
		for(Fruit fruit : fruits) {
			System.out.println(fruit);
		}
		
		System.out.println("\nArrays.sort(fruits, new Comparator()) name asc START ----");
		Arrays.sort(fruits, new Comparator<Fruit>() {

			public int compare(Fruit fruit1, Fruit fruit2) {
				
				String name1 = fruit1.getName().toUpperCase();
				String name2 = fruit2.getName().toUpperCase();
				
				// ascending order
				return name1.compareTo(name2);
				
				// descending order
				//return name2.compareTo(name1);
			}
		});
		
		for(Fruit fruit : fruits) {
			System.out.println(fruit);
		}
		
		System.out.println("\n'dBcAaEC' 와 같은 알파벳 문자열을 aAbBcC와 같은 알파벳 순서로 정렬하는 코드를 작성하세요. START ----");
		
		
		
		
		
	}
}
