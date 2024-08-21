import java.util.Scanner;

public class Ch06 {
	public static void main(String[] args) {
		// 00 대입 연산자

		// ' = ' : 왼쪽은 '공간' 오른쪽은 '값'으로 해석한다
//						   오른쪽 값 저장 후 왼쪽 공간으로 대입
		
		// 01 산술 연산자
//		System.out.println("--------------- 산술 연산자 예제 ---------------");
//		int a = 10, b = 20, c;
//		System.out.println("a + b = " + (a + b));
//		System.out.println("a - b = " + (a - b));
//		System.out.println("a * b = " + (a * b));
//		System.out.println("b / a = " + (b / a));	// 나누기 연산자 : 몫
//		System.out.println("a % b = " + (a % b));	// 나머지 연산자 : 나머지
//													// 사용 경우
//													// 1.짝홀수 구분 
//													// 2.배수구분 
//													// 3.자리수제한 
//													// 4.
//		
//		System.out.println("-a = " + -a); // 앞에 - 를 붙인다고 해서 음수가 되는게 X
//								//		  // 부호를 반전시키는 연산 '-'
//								//		  // 즉 양수 -> 음수, 음수 -> 양수
		
		
		
		
		// 02 복합대입 연산자 (산술+대입)
		// 복합대입 연산자 = 대입연산자 + 산술연산자
		
		
//		System.out.println("--------------- 복합대입 연산자 예제 ---------------");
//		int a = 10;
//		a += 10;	// a = a + 10;
//		System.out.println("a = " + a);
//		a -= 5;		// a = a - 5;
//		System.out.println("a = " + a);
//		a *= 3;		// a = a * 3;
//		System.out.println("a = " + a);
//		a /= 2;		// a = a / 2;
//		System.out.println("a = " + a);
//		a %= 2;		// a = a % 2;
//		System.out.println("a = " + a);
//		System.out.println();
		
		
		
		// 03 비교연산자
		
		// 피연산자들을 ' 비교 ' 하여 참 / 거짓 값 반환 
		// 참(True)		 
		// 거짓(False)	
		
//		System.out.println("--------------- 비교 연산자 예제 ---------------");
//		int a = 10;
//		int b = 20;
//		System.out.println("A == B : "+ (a == b)); 	// == : 같은지 여부 (비교연산자)
//		System.out.println("A  > B : "+ (a > b));
//		System.out.println("A  < B : "+ (a < b));
//		System.out.println("A >= B : "+ (a >= b));
//		System.out.println("A <= B : "+ (a <= b));
//		System.out.println("A != B : "+ (a != b)); 	// != : 다른지 여부
//		System.out.println();
		
		
		
		
		// 04 논리연산자 
		
		// ### AND 연산자 (&&) ###
		
		// 1. 왼쪽이 거짓이라면 오른쪽을 연산하지 않는다.
		// 2. "&&" 연산자는 일반적으로 "||"연산자보다 우선순위가 높다
		// 3. "&&" 연산자의 결과는 논리값(참 또는 거짓)이다.
		
		// (조건식) && (조건식) 
		// (true) && (true) = (true)
		// 그 외는 모두 거짓
		// &&기호를 기준으로 왼/오른쪽 둘다 true 이면 true
		
		
		// ### OR 연산자 (||) ###	 
		
		// 1. 왼쪽, 오른쪽 식 중 하나라도 참이면 True 값이 뜬다.
		// (조건식) || (조건식) 
		// (true)  || (true)  = (true)
		// (true)  || (false) = (true)
		// (false) || (true)  = (true) 
		// (false) || (false) = (false)
		// ||기호를 기준으로 왼/오른쪽 중 하나만 true 이면 true
		
		
		// ### NOT 연산자 (!), 논리부정연산자 ###
		// true이면 false, false 이면 true
		
		
//		System.out.println("--------------- 논리 연산자 예제 ---------------");
//		
//		int a = 10; int b = 20;
//		
//		
//		System.out.println("--------------- AND 연산자(&&) 예제 ---------------");
//		//왼쪽이 false라면 오른쪽 연산은 하지도 않음.
//		System.out.println( (a >= b) && (a > 5) );
//		System.out.println( (a != b) && (b > 15) );
//		System.out.println();2
//		
//		
//		System.out.println("--------------- OR 연산자(||) 예제 ---------------");
//		//왼쪽이 false라면 오른쪽으로 넘어가서 연산처리를 할 수밖에 없음.
//		System.out.println( (a >= b) || (a > 5) );
//		System.out.println( (a != b) || (b > 15) );
//		System.out.println( (a == b) || (a <= 5) );
//		System.out.println();
//		//똑같이 왼쪽이 먼저 true라면 오른쪽은 연산하지도 않음.
//		
//		System.out.println("--------------- NOT 연산자(!) 예제 ---------------");
//		boolean c = !(b > 30);			// false를 부정
//		System.out.println("C : " + c);
//		System.out.println();
		
		
		
//		System.out.println("--------------- 연산자 문제 01 ---------------");
//		// 연산자기호를 써서 아래를 만족하도록 코딩한다.
//		//1) a가 b와 같고 a는 10보다 크고 b도 10보다 큰지 출력
// 
//		//2) a가 b보다 크면서 a가 0이 아닌지 확인하여 출력 	
//		//3) a가 5보다 크거나 b가 10보다 작은지 확인하여 출력
// 
//		//4) a가 b보다 크고 a가 c보다 크고 a가 0이 아닌지 확인하여 출력
		
		
		
        // 정수값 a, b, c 변수를 저장하세요.
//        int a = 1;
//        int b = 2;
//		  int c = 3;
//
//        // a == b && a > 10 && b > 10의 결과 출력
//        System.out.println("a == b && a > 10 && b > 10의 결과는 " + (a == b && a > 10 && b > 10));
//
//        // a > b && a != 0의 결과 출력
//        System.out.println("a > b && a != 0의 결과는 " + (a > b && a != 0));
//
//        // a > 5 || b < 10의 결과 출력
//        System.out.println("a > 5 || b < 10의 결과는 " + (a > 5 || b < 10));
//
//        // a > b && a > c && a != 0의 결과 출력
//        System.out.println("a > b && a > c && a != 0의 결과는 " + (a > b && a > c && a != 0));
		
		
		
		// 05 증감연산자
		
		// 1. 전치연산자(++a, --a) : 먼저 1 증가 및 감소 이후에 다른 연산 처리
		// 
		// 2. 후치연산자(a++, a--) : 다른 연산 처리 이후에 1 증가 및 감소
		
//		System.out.println("--------------- 증감 연산자 예제 ---------------");
//		int a = 10, b = 10, c, d;
//		
//		
//		c = --a;			// a = 9, c = 9
//		d = a--;			// d에 a의 값(9)를 먼저 담고, a 1 감소 ==> a = 8
//		System.out.printf("a=%d , b=%d , c=%d, d=%d", a, b, c, d);
		
		
		// 06 삼항연산자
		
		// (조건식) ? 참인경우 실행코드 : 거짓인경우 실행코드;
		
//		System.out.println("--------------- 삼항 연산자 예제 ---------------");
//		int score = 85;
//		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
//		System.out.println(score + "점은 " + grade + "등급입니다.");
//		System.out.println();
		
		// 07 비트 연산자
//		System.out.println("--------------- 비트 연산자 예제 ---------------");
//		int num1 = 15;			//00000000 00000000 0000000 00001111
//		int num2 = 20;			//00000000 00000000 0000000 00010100
//		int num3 = num1&num2;	//00000000 00000000 0000000 00000100 = 4
//		int num4 = num1|num2;	//00000000 00000000 0000000 00011111 = 31
//		int num5 = num1^num2;	//00000000 00000000 0000000 00011011 = 27	// (XOR 연산) 서로 다르면 1, 같으면 0
//		int num6 = ~num1;		//11111111 11111111 1111111 11110000 =		// 반전(NOT 연산)
//		
//		System.out.println("AND 비트 연산 결과 : " + num3);
//		System.out.println("OR 비트 연산 결과 : " + num4);
//		System.out.println("XOR 비트 연산 결과 : " + num5);
//		System.out.println("NOT 비트 연산 결과 : " + num6);
//		System.out.println();
		
		
		// 08 쉬프트 연산자
//		System.out.println("--------------- 쉬프트 연산자 예제 ---------------");
//		int num1 = 15;		//00000000 00000000 00000000 00001111
//		int num2 = 20;		//00000000 00000000 00000000 00010100
//		int num3 = num1<<2; //00000000 00000000 00000000 00111100
//		int num4 = num1>>2; //00000000 00000000 00000000 00000011
//		
//		System.out.println("<<Shift 연산결과 :" + num3);
//		System.out.println(">>Shift 연산결과 :" + num4);
//		System.out.println();
		
		
	// 09 %연산자의 활용 문제 
		
		// 01 홀수/짝수
		
		//사용자로부터 정수를 하나 입력받고,
		//연산자를 이용해 짝수면 짝수입니다를 출력, 
		//			 홀수면 홀수입니다를 출력
		
		
		//[결과값]
		//정수를 입력해주세요 : 12
		//결과 : 짝수입니다
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력해주세요 :");
//		int num = sc.nextInt();
//		
//		// num(12)라는 수가 짝순지 홀순지 어떻게 판별하지?
//		// 2로 나눴을때 나머지가 0으로 떨어진다면 짝수다!
//		
//		// (조건식) ? 참 실행코드 : 거짓 실행코드;
//		String result = (num % 2 == 0) ? "짝수입니다" : "홀수입니다";
//		System.out.println("결과 : "+ num + "은 " + result);
		
//		if(num % 2 == 0) {
//			System.out.println("짝수입니다.");
//			
//		}
//		if(num % 2 == 1	) {
//			System.out.println("홀수입니다.");
//		}
		
		
		
		
		// 02 배수 구하기
		
		// 세 정수를 받아서 세 수의 합이 5의 배수인 경우
		// 5의 배수입니다 를 출력
		// 아닌 경우 5의 배수가 아닙니다 를 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 :");
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		// sum == 입력받은 세 수의 합
		int sum = num + num1 + num2;
		
		String result = sum % 5 == 0 ? "5의 배수입니다." : "5의 배수가 아닙니다.";
		System.out.println("결과 : " + result);
		
		
//		if(sum % 5 == 0) {
//			System.out.println("결과 : 짝수입니다.");
//			
//		} 
//		
//		if(sum % 5 == 1 || sum % 5 == 2 || sum % 5 == 3 || sum % 5 == 4) {
//			System.out.println("결과 : 홀수입니다.");
//		}
		
		// 15의 배수냐?
		// 15의 배수가 아닌 경우의 수가 너무 많음
		// 개발자들이 15의 배수가 아닌 경우의 수를 구하기가 너무 힘들고 많아서 짜증남.
		// ==> 따라서 else구문이 등장
		
//		if(sum % 15 == 0) {
//			System.out.println("15의 배수입니다");
//		} else {
//			System.out.println("15의 배수가 아닙니다.");
//		}
		
		
		


		
	}

}
