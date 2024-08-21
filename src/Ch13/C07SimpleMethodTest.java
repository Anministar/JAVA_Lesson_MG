package Ch13;
import java.util.Scanner;


//### 'Return' Keyward ###

//자바에서 메소드가 값을 반환하는 데 사용되는 키워드
//반환되는 값의 자료형은 메소드의 선언에서 지정한 반환 자료형과 일치해야 함


//메소드의 실행을 중지하는 데에도 사용됨.    사용예시 : return ;
//메소드 내에서 어느 위치에서든 return을 만나면 해당 위치에서 메소드의 실행이 종료됨.

class Sum {
	// 속성
	Scanner sc = new Scanner(System.in);

	// 기능
	// 반환 O 매개변수 O
	int sum1(int x, int y) { // 매개변수 x, y
		return x + y;
	}

	// 반환 O 매개변수 X
	int sum2() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x + y;
	}

	// 반환 X 매개변수 O
	void sum3(int x, int y) {
		System.out.println("sum3(x, y) = " + (x + y));
	}

	// 반환 X 매개변수 X
	void sum4() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("sum4 = " + (x + y));
	}
	
	// return으로 메서드 실행 중지 예제
	int sum5(int x, int y) {
		if ( x < 0 || y < 0) {
			System.out.println("음수는 처리할 수 없습니다.");
			return -1;
		}
		
		return x + y;
	}
	
	// return으로 메서드 실행 중지 예제
	void sum6(int x, int y) {
		if(x < 0 || y < 0) {
			System.out.println("음수는 처리할 수 없습니다.");
			return;
		}
		System.out.println("이 코드는 실행되지 않습니다."); // x, y가 만약 음수라면 이 코드 실행 X
	}

}

public class C07SimpleMethodTest {
	
	public static void main(String[] args) {
		Sum calc = new Sum();
		
		int result1 = calc.sum1(10, 20);
		
		System.out.println("sum1(x, y) = " + result1);
		
		int result2 = calc.sum2();
		System.out.println("sum2() = " + result2);
		
		calc.sum3(12, 34);
		calc.sum4();
		
		
		
		// 메서드 실행 중지를 나타내는 return 예제
		int result5 = calc.sum5(5, -3);
		if(result5 != -1) {
			System.out.println("sum5(x, y) = " + result5);
		}
		
		calc.sum6(1, -1);
		
		System.out.println("프로그램을 종료합니다.");
	}

}
