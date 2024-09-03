package Ch22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C05Date {
	
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("YYYY/MM/DD 입력 : ");
		String str = sc.nextLine();
		
		// Format
		SimpleDateFormat fmtin = new SimpleDateFormat("yyyy/MM/dd");
		// 대소문자 구분함
		// M : 월, m : 분
		
		
		// 출력시 fmtout을 사용
		SimpleDateFormat fmtout = new SimpleDateFormat("yyyy-MM-dd");
		
		// 문자열 --> Date
		// fmtin.parse(str) ==> parse 예외가 발생될 수도 있기 때문에 throws로 예외를 일단 던져서 pass
		// ParseException 예외 처리
		
		Date tmp  = fmtin.parse(str);
		
		System.out.println(tmp);
		
		// Format 설정 후 출력
		System.out.println(fmtout.format(tmp));
	}

}
