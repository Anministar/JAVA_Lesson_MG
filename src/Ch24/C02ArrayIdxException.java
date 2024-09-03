package Ch24;


// ### ArrayIndexOutOfBoundsException

// 배열의 인덱스가 허용 범위를 벗어날 때 발생하는 예외.
// 이 예외는 실행 시간(Runtime)에 발생
// ==> 배열을 다루는 코드에서 인덱스 오류를 나타냄
public class C02ArrayIdxException {
	public static void main(String[] args) {
		try {
			
			
			int arr[] = {10, 20, 30};
			
			for(int i = 0; i < 5; i++) {
				System.out.println(arr[i]); 		// for는 5번 반복, 배열은 3개뿐. ==> 예외 발생
			}
			
			
			// ArrayIndexOutOfBoundsException e = new NullPointerException(); 		// X
			
		} catch (ArrayIndexOutOfBoundsException e) {   // Exception으로 받아도 됨.
													   // 왜냐하면 Exception이 상위클래스이므로 업캐스팅됨.
			
			e.printStackTrace();						// 프로그램 종료 전 예외발생정보 출력


		}
		// Exception e = new NullPointerException(); 		// O
//		catch (Exception e ){
//			System.out.println("모든 예외를 받고 있는 구간입니다.");
//		}
		
		
		
		System.out.println("실행코드 1");
		System.out.println("실행코드 2");
		
	}

}
