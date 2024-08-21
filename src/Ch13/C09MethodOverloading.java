package Ch13;

//### 메서드 오버로딩 ###

//동일한 이름을 가지지만 매개변수가 다른 여러 메서드를 가질 수 있는 기능
//유사한 작업을 수행하지만 다양한 유형이나 수의 입력을 처리할 수 있는 메서드를 생성
//메서드 오버로딩은 컴파일 시 다형성 또는 정적 다형성의 한 형태임.

//## 숙지사항 ##
//메서드는 매개변수의 개수, 유형, 순서를 다르게 함으로써 오버로드될 수 있음 ==> 매개변수 수, 자료형, 순서에 의해 구분 O
//오버로드된 메서드는 반환 유형이 같을 수도 있고 다를 수도 있음. ==> 반환형으로 구분 X
//오버로드된 메서드는 서로 다른 접근 제어자, 다른 예외를 던질 수 있으며 정적 또는 비정적일 수 있음. ==> private, public 등의 접근 제어자로 구분 X
//																	   ==> static, non-static로 구분 X			-- 추후 설명

//## 오버로딩 규칙사항 ##
//오버로드된 메서드는 동일한 이름이지만 다른 매개변수 목록을 가져야 함.
//컴파일러는 제공된 인수를 사용하여 호출할 적절한 메서드를 결정함.
//==> 모호성을 피하기 위해 컴파일러는 제공된 인수를 기반으로 메서드를 구별할 수 있어야 함.






// public int add(int a, int b) {
//     return a + b;
// }
//
// // 매개변수 유형 변경에 의한 메서드 오버로딩
// public double add(double a, double b) {
//     return a + b;
// }
//
// // 매개변수 개수 변경에 의한 메서드 오버로딩
// public int add(int a, int b, int c) {
//     return a + b + c;
// }
// // 매개변수 순서 변경에 의한 메서드 오버로딩
//	  public int add(int a, int c, int b) {
//		  return a + c + b;
//	  }

class C09Simple {
	String name;
	int sum(int x, int y) {
		System.out.println("sum(int, int) 호출!");
		return x + y;
	}
	
	int sum (double x, double y) {
		System.out.println("sum(double, double) 호출!");
		return (int) (x + y);
	}
	int sum (int x, int y, int z) {
		System.out.println("sum(int, int, int) 호출!");
		return x + y + z;
	}
	int sum (String str1, int x, int y) {
		System.out.println("sum(String, int, int) 호출!");
		name = str1;
		return x + y;
	}
	
	// ### 가변인자(Varargs) ###
	// 동일한 타입의 인수를 여러 개 받을 수 있도록 설계
	
	void sum(int...n) {				// int...n은 가변인자
									// 정수형 변수들의 배열로 간주
									// 0개 이상의 정수를 전달받을 수 있음.
		for (int x : n) {
			System.out.print(x + " ");
		}
	}
	
}




public class C09MethodOverloading {
	public static void main(String[] args) {
		C09Simple test = new C09Simple();
		test.sum(10, 20);
		test.sum(10.1, 20.1);
		test.sum(10, 20, 30);
		test.sum("한국", 10, 20);
		
		test.sum(1,2,3,4,5,6,7,8);
	}

}
