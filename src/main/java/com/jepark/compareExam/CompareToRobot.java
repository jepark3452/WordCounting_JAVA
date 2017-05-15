package com.jepark.compareExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareToRobot {
	
	public static void main(String[] args) {
		
		List<Robot> robotArr = new ArrayList<Robot>();
		robotArr.add(new Robot("AAA", "10", 50));
		robotArr.add(new Robot("FFF", "5", 60));
		robotArr.add(new Robot("QQQ", "-15", 45));
		robotArr.add(new Robot("SSS", "17", 35));
		robotArr.add(new Robot("BBB", "12", 55));
		robotArr.add(new Robot("CCC", "-2", 10));
		robotArr.add(new Robot("GGG", "6", 22));
		robotArr.add(new Robot("RRR", "1", 33));
		robotArr.add(new Robot("CCC", "6", 1));
		
		// ROBOT NAME 오름차순으로 정렬
		System.out.println("ROBOT NAME 오름차순으로 정렬 ----");
		Collections.sort(robotArr, new Comparator<Robot>() {

			public int compare(Robot o1, Robot o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
		});
		printList(robotArr);

		// ROBOT NAME 내림차순으로 정렬
		System.out.println("\nROBOT NAME 내림차순으로 정렬 ----");
		Collections.sort(robotArr, new Comparator<Robot>() {

			public int compare(Robot o1, Robot o2) {
				
				return o2.getName().compareToIgnoreCase(o1.getName());
			}
		});
		printList(robotArr);
		
		// ROBOT NO 오름차순 정렬
		System.out.println("\nROBOT NO 오름차순으로 정렬 ----");
		Collections.sort(robotArr, new Comparator<Robot>() {

			public int compare(Robot o1, Robot o2) {
				
				int no1 = Integer.parseInt(o1.getNo());
				int no2 = Integer.parseInt(o2.getNo());
				
				return no1 > no2 ? 1 : no1 < no2 ? -1 : 0;
			}
		});
		printList(robotArr);
		
		// ROBOT NO 내림차순 정렬
		System.out.println("\nROBOT NO 내림차순으로 정렬 ----");
		Collections.sort(robotArr, new Comparator<Robot>() {

			public int compare(Robot o1, Robot o2) {
				
				int no1 = Integer.parseInt(o1.getNo());
				int no2 = Integer.parseInt(o2.getNo());
				
				return no1 > no2 ? -1 : no1 < no2 ? 1 : 0;
			}
		});
		printList(robotArr);
		
		// ROBOT AGE 오름차순 정렬
		System.out.println("\nROBOT AGE 오름차순으로 정렬 ----");
		Collections.sort(robotArr, new Comparator<Robot>() {

			public int compare(Robot o1, Robot o2) {
				
				return o1.getAge() > o2.getAge() ? 1 : o1.getAge() < o2.getAge() ? -1 : 0;
			}
		});
		printList(robotArr);
		
		// ROBOT AGE 오름차순 정렬
		System.out.println("\nROBOT AGE 내림차순으로 정렬 ----");
		Collections.sort(robotArr, new Comparator<Robot>() {

			public int compare(Robot o1, Robot o2) {
				
				return o1.getAge() > o2.getAge() ? -1 : o1.getAge() < o2.getAge() ? 1 : 0;
			}
		});
		printList(robotArr);
	}

	private static void printList(List<Robot> robotArr) {
		
		for(Robot robot : robotArr) {
			
			System.out.println(robot.toString());
		}
	}
}
