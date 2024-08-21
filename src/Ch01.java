//	01 JAVA 주석
	
//	주석 : 프로그램 코드 내에 삽입된 사용자의 메모를 의미.
//	==> 코드 실행 결과에는 아무런 영향을 끼치지 않음.
	
//	쓰는 이유 : 1. 개발을 하다보면 코드 섹션(함수의 몸체)에 대한 설명이 필요함.
//	   			2. 협업할 때, 다른 개발자와의 의사소통에 필요.
//	
//	# 주석 사용법 #
//	// 		: 주석
//	/* */ 	: 여러 줄 주석
//	단축키 	: ctrl + /



import java.util.Scanner;

public class Ch01 {										// 클래스 영역 - 객체 지향 코드 구현 단위
	
	
	public static void main(String[] args) {			// 메서드 영역 - 절차 지향 코드 구현 단위, main 메서드의 선언부
		
//		## 메서드의 정의와 종류 ##
//		0. 메서드(기능)			: 특정 기능 수행, C언어의 함수개념과 유사
//		1. 메인 메서드			: 최초 실행되는 함수 
//		2. 라이브러리 메서드		: 개발편의를 위해서 미리 만들어져 제공되는 함수
//		3. 사용자 정의 메서드		: 개발자가 정의한(만든) 함수
		
//		0. main 메서드	 	 : 프로그램의 진입점(entry point), 자바 가상 머신(Java Virtual Machine)은 이 메서드를 찾아 실행
		
//		1. public	 	 : main 메서드는 어디서든 접근할 수 있도록 public으로 선언해야 함.
		
//		2. static	 	 : main 메서드는 객체의 생성 없이 호출될 수 있도록 static으로 선언되어야 함.
//						   이는 JVM이 프로그램을 실행할 때 클래스의 인스턴스를 생성하지 않고 직접 호출 O -> 추후에 이해하면 Okay :)
		
//		3. void		 	 : main 메서드는 어떤 값을 반환하지 않도록 void로 선언되어야 함.
		
//		4. String[] args : main 메서드는 문자열 배열을 매개변수로 받음. 
//						   이 배열은 프로그램 실행 시에 명령행 인수(arguments)를 전달하기 위한 것
//		
//		5. 중괄호 {}		 : 내부에 프로그램 실행 시 실행될 코드 작성 --> 프로그램의 로직 구성
		
		
		
		// 03 ESCAPE 문자
		


//      '정보 표시' 목적으로 사용된 기존 그래픽문자(영소문자, 숫자, 특수문자)와는 다르게
//      '제어' 목적으로 사용되는 특수문자
//      
//      \(역슬래쉬)를 앞에 붙여 사용
//      
//      1. \n : 개행(줄바꿈)
//      
//      2. \b : Back Space Key의 약어
//     			--> 커서를 앞으로 1행 옮김 (eclipse 콘솔에서는 표현 X)
//      
//      3. \r : Carriage Return의 약어
//     			--> 행의 처음으로 이동 ( 이때 CMD, 즉 명령 프롬프트에서는 INSERT MODE 적용 )
//      
		
		
//      4. \t : Tap Key의 약어
//     			-->탭키만큼 칸 이동( 8칸 ) 
//     			--> 간격을 맞추기 위해서 사용!!
//      
//      5. \' : '(작은 따옴표)출력
//      6. \" : "(큰 따옴표) 출력
//      7. \\ : \ 출력 (폴더 경로 구분시 잘 사용됨)
        System.out.println("여기여기");
        System.out.println("Hello, World!");
        System.out.println("This is a new line.\nSecond line\twith a tab.");
        System.out.println("Backspace\bcharacter.");
        System.out.println("Carriage return\rExample.");
        System.out.println("Single quote: \'\tDouble quote: \"");
        System.out.println("\"I am your father\"");
        System.out.println("Backslash \\");
        System.out.println("Unicode character: \u03A9");
        
        System.out.println("C:\\Program Files");
        
        
		
//		## 표준 출력 함수 ##
//      System.out 				: 표준 출력 스트림
//      System.out.print()		: 줄바꿈 X
//      System.out.println()	: 줄바꿈 O(포함, ln == \n)
//      System.out.printf()		: 서식문자를 사용할 수 있는 출력 메서드, printf의 의미(format : 형식, 서식)
		
		
		System.out.print("hello world\n");
		System.out.print("안녕하세요\n");
		System.out.println("adkadfad");
		
		
		// 서식이란?	: 서류를 꾸미는 일정한 양식
		// 서식문자란?  : 서식공간에 자료를 대입하여 화면에 출력하거나 입력받기 위한 용도의 문자
		//%d : decimal의 약자			10진수(정수) 서식문자
		//%f : float의 약자			10진수(실수) 서식문자
		//%c : character의 약자		한문자 서식문자
		//%s : String의 약자			문자열 서식문자
		//%o : Octal의 약자			8진수(정수) 서식문자
		//%x :	Hexadecimal의 약자		16진수(정수) 서식문자
		
		System.out.println("--------------- 서식문자 예제 ---------------");
		System.out.println("---정수---");
		System.out.printf("%d \n", 0b01100100);
		System.out.printf("%d \n", 100 + 200);
		System.out.printf("%d %d %d \n", 1, 2, 3);
		
		System.out.println("---실수---");
		System.out.printf("%f \n", 123.5);
		System.out.printf("%.2f \n", 123.5234);
		System.out.printf("%f %f %f \n", 1.1, 2.1, 3.1);
		
		
		System.out.println("---한문자---");
		System.out.printf("%c %c %c \n", 'A', 'B', 'C');
		
		System.out.println("---문자열---");
		System.out.printf("%s %s %s \n", "This is", "JAVA", "CLASS");  // '' 안에는 하나의 문자만 컴파일러가 해석하는거라 한 문자 이상이면 에러
		System.out.printf("%d.%s : %d\n", 1, "국어", 100);
		System.out.println();
		
		
		// 문제 01)
		// 다음과 같이 출력 합니다.
		// NO	이름		나이		성별		주소
		// 1	이동하		20		M		대구
		// 2	동동이		12		W		서울
		// 3	하동이		29		M		대전
		
		System.out.println("--------------- 서식문자 문제 01 - 방법1 ---------------");
		System.out.printf("%s	%s	%s	%s	%s\n", "NO", "이름", "나이", "성별", "주소");
		System.out.printf("%d	%s	%d	%c	%s\n", 1, "김광수", 35, 'M', "대구");
		System.out.printf("%d	%s	%d	%c	%s\n", 2, "이태수", 55, 'W', "울산");
		System.out.printf("%d	%s	%d	%c	%s\n", 3, "이지성", 44, 'M', "김해");
		System.out.println();
		System.out.println("--------------- 서식문자 문제 01 - 방법2 ---------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\n", "NO", "이름", "나이", "성별", "주소");
		System.out.printf("%d\t%s\t%d\t%c\t%s\n", 1, "김광수", 35, 'M', "대구");
		System.out.printf("%d\t%s\t%d\t%c\t%s\n", 2, "이태수", 55, 'W', "울산");
		System.out.printf("%d\t%s\t%d\t%c\t%s\n", 3, "이지성", 44, 'M', "김해");
		System.out.println();
		
		
		
		
		// 문제 02
		// 서식문자를 사용하여 다음과 같은 결과값을 출력해보세요 !!
		
		// [결과값]
		// 이름 : 이동하
		// 나이 : 12
		// 성별 : M
		// 키  : 192.20000
		// 주소 : "대구광역시 중구 중앙대로 파출소"
		System.out.println("--------------- 서식문자 문제 02 ---------------");
		System.out.printf("이름 : %s\n", "이동하");
		System.out.printf("나이 : %d\n", 12);
		System.out.printf("성별 : %c\n", 'M');
		System.out.printf("키   : %f\n", 192.2);
		System.out.printf("주소 : %s", "\"대구광역시 중구 중앙대로 파출소\"\n");
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
