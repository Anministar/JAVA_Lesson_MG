package Ch14;

import java.util.Scanner;

public class C03StringClass {
	public static void main(String[] args) {
		int alength, blength;
		char achar, bchar;
		
		String str1 = new String("java Powerful");
		String str2 = new String("java Programming");
		String str3 = str1 + str2;
		
		
		System.out.println(str3);
		
		alength = str1.length();
		blength = str2.length();
		achar = str1.charAt(5);
		bchar = str2.charAt(10);
		
		System.out.println("str1에 저장 = " + str1 + " 길이 = " + alength);
		System.out.println("str1에 저장 = " + str2 + " 길이 = " + blength);
		System.out.println("str1의 5번째 문자 = " + achar);
		System.out.println("str1의 10번째 문자 = " + bchar);
		
		
		System.out.println("str1의 대문자 변환 : " + str1.toUpperCase());
		System.out.println("str1의 소문자 변환 : " + str1.toLowerCase());
		System.out.println("str2의 a를 A로 변환 : " + str2.replace('a', 'A'));
		
		
		// trim() : 공백 제거 (양쪽)
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		
		System.out.println(tmp);
		System.out.println(tmp.trim());
		
		// subString()  : 문자열 자르기
		System.out.println(tmp.substring(2));
		System.out.println(tmp.substring(0, 2));
		
		// indexOf('문자열') : 문자열 index번호 확인
		System.out.println(tmp.indexOf("H"));  // H가 없으면 -1 return
		
		// lastIndexOf("문자열")	 : 문자열의 index번호 확인
		System.out.println(tmp.lastIndexOf("H")); 		//  뒤에서부터 앞으로 검색
		
		// contains("문자열") : 문자열 포함여부
		System.out.println(tmp.contains("HE"));
		
		// split("구분자") : 구분자를 기준으로 문자열을 분할(배열형으로 저장)
		String arr[] = tmp.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = %s\n", i, arr[i]);
		}
		
		
		
		
		
		
		
		
		
	}

}
