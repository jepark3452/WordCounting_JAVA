package com.jepark.compareExam;

/**
 * 
 * <pre>
 * [compareTo]
 * public int compareTo(String anotherString)
 * 2개의 두 문자열을 비교하고 int형 값을 반환하는 메소드
 * A.compareTo(B)
 * A와 B가 같으면 0을 반환
 * A가 B보다 크면 양수를 반환
 * A가 B보다 작으면 음수를 반환
 * 맨 첫자리부터 차례대로 비교하는 특성이 있음
 * 
 * <심화>
 * 2개의 스트링을 사전적으로 비교합니다.
 * (역주: "A"는 feff0041, "B는 feff0042)
 * 비교는 스트랭내의 각각의 문자의 Unicode 값에 근거해 행해집니다.
 * String 객체에 의해 나타내지는 문자열이, 인자로 전달 받은 스트링의 문자열과 사전적으로 비교됩니다.
 * 
 * String 객체가 사전적으로, 전달받은 스트링보다 전에 있는 경우는, 결과는 음의 정수가 됩니다.
 * (역주: "A" vs. "B", feff0041-feff0042 = -1_
 * 이 String 객체가 사전적으로 인수 캐릭터보다 뒤에 있는 경우, 결과는 양의 정수가 됩니다.
 * 스트링이 동일한 경우, 결과는 0 이 됩니다.
 * 
 * 분류 기준은 아래의 2가지이다.
 * 
 * 1. 문자열의 내용이 같은가
 * 2. 문자열의 길이가 같은가
 * 
 * 내용도 다르고 길이도 다른 경우는 내용을 우선 비교한다.
 * 
 * 기준 문자열에서 비교 문자열이 더 긴 경우 (0을 기준으로 긴 길이만큼-)
 * 기준 문자열에서 비교 문자열이 더 짧은 경우 (0을 기준으로 짧은 길이만큼+)
 * 
 * 그리고 문자열의 내용을 비교할때는 앞에서부터 순차적으로 비교한다.
 * 서로 다른 문자열이 제일 처음으로 발견되면, 그 문자열만 기준으로 삼는다.
 * 기준 문자열의 문자와 아스키코드값을 비교한다.
 * 기준 문자열의 문자의 코드값 - 비교 대상문자의 코드값
 * </pre>
 * @author jepark
 *
 */
public class CompareTo {

	public static void main(String[] args) {
		
		String a = "ABC";
		String b = "ABC";
		String c = "BCD";
		String d = "ABCDEF";
		
		System.out.println(a.compareTo(b));	// 출력결과 0
		System.out.println(a.compareTo(c));	// 출력결과 -1
		System.out.println(a.compareTo(d));	// 출력결과 -3
		
		
		System.out.println("==========");
		
		System.out.println((int) "a".charAt(0));
		System.out.println((int) "b".charAt(0));
		System.out.println((int) "c".charAt(0));
		System.out.println((int) "A".charAt(0));
		System.out.println((int) "B".charAt(0));
		System.out.println((int) "C".charAt(0));
		
		System.out.println("==========");
		
		System.out.println((int) "1".charAt(0));
		System.out.println((int) "10".charAt(0));
		System.out.println((int) "2".charAt(0));
		System.out.println((int) "20".charAt(0));
		System.out.println((int) "50".charAt(0));
		
		
	}

}
