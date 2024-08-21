
public class Ch12 {
	// 01 for문 구조
	
	// 반복 횟수를 미리 정해놓고 반복을 수행하는 구조
	
	// for (초기식; 조건식; 증감식) {
	// 조건식이 참일때 수행할 코드
	//}
	
	
	// for문의 동작원리
	// 1. 초기식에는 변수 초기화가 일어난다. 이때 초기화된 변수를 for문 블럭 {} 안에서 사용할 수 있다
	// 2. 조건식을 평가.
	// 3. 조건이 참일 경우 for문 실행한다. (거짓일 때 for문 탈출)
	// 4. 증감식으로 회기하여 증감식 실행.
	// 5. 다시 조건식 판별
	
	
public static void main(String[] args) {
	System.out.println("------------------------------ for문 - 예제01 -----------------------------------");
	
	System.out.println("------------------------------- while 문 -----------------------------------");
	int i = 0;			// 초기값
	while (i <= 10) { 	// 조건식
		System.out.println("i = " + i);
		i++;			// 증감연산
		
	}
	System.out.println();
	
	System.out.println("------------------------------- for 문 -----------------------------------");
	for (int j = 0; j < 11; j++) { 
		System.out.println("j = " + j);
		
	}
	
	
	 System.out.println("--------------- for문 - 예제02 ---------------");
     //1부터 10까지 합
		
//		int sum = 0;
//		for (int i = 0; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.println("1부터 10까지의 합 : " + sum);
	 
	 
	 // 문제 01
     System.out.println("--------------- for문 - 문제 01 ---------------");
  // 1부터 N까지의 수의 합을 출력 (N은 사용자로부터 입력받는다)
  // for문으로 만들어보아요 :)
		
//     Scanner scanner = new Scanner(System.in);
//
//     int N = 0;
//     int sum = 0;
//
//     System.out.println("이 프로그램은 1부터 N까지의 수를 더해주는 프로그램입니다.");
//     System.out.print("N의 수를 입력하세요 >>> ");
//     N = scanner.nextInt();
//
//     for (int i = 1; i <= N; i++) {
//         sum += i;
//     }
//
//     System.out.println("1부터 N까지의 합 : " + sum);
     
     
     
     // 문제 02
     System.out.println("--------------- for문 - 문제 02 ---------------");
  // 2단부터 9단까지 출력(for문으로 작성)
     
//		System.out.println("구구단 2단을 출력할게요!");
//		
//		int n = 2;
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("%d x %d = %d\n", n, i, n*i);
//		}
		
		
	
}

}
