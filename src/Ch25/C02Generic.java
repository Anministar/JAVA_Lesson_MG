package Ch25;

//
//abstract class 주재료 {
//	String 재료;
//	
//	public 주재료(String 재료) {
//		this.재료 = 재료;
//	}
//
//	@Override
//	public String toString() {
//		return "주재료 [재료=" + 재료 + "]";
//	}
//	
//}
//
//
//class 커피 extends 주재료 {
//	public 커피(String 재료) {
//		super(재료);
//	}
//}
//class 차 extends 주재료 {
//	public 차(String 재료) {
//		super(재료);
//	}
//}
//
//class 주스 extends 주재료 {
//	public 주스(String 재료) {
//		super(재료);
//	}
//}
//
//// 제네릭 타입 T는 주재료 클래스 또는 주재료 하위 클래스(상속받은)만을 받아올 수 있다는 의미.
//class 음료<T extends 주재료> {
//	private T 재료;
//	
//	음료(T 재료) {
//		this.재료 = 재료;
//	}
//	
//	
//	void ShowInfo() {
//		System.out.println(재료.toString() + "으로 만든 음료!");
//	}
//}
//
//public class C02Ggenerric {
//
//	public static void main(String[] args) { 			// 로직
//		// 커피 원두를 속성 '재료'의 속성값으로 가지는 커피 객체 obj 생성
//		커피 obj = new 커피("커피 원두");
//
//		
////		## 음료<커피> 커피음료 = new 음료<>(obj); 코드 해석 ##
//		// 커피 객체를 만들면서 주재료 클래스의 매개변수 생성자를 호출 ==> 커피원두로 재료하는 멤버변수를 초기화
//		// 그러고나서 속성값이 초기화된 커피 객체를 다시 음료 클래스 매개변수 생성자에게 전달함과 동시에 호출
//		// 음료 클래스가 가지고 있는 재료라는 참조변수로 커피 객체를 연결 및 참조
//		음료<커피> 커피음료 = new 음료<>(obj);
//		
//
//		// 참조변수 재료가 가지고 있는 객체 정보를 toString() 메서드를 이용해서 정보 출력
//		// 커피원두로 만든 음료결과값 출력
//		커피음료.ShowInfo();
//		
//		음료<차> 차음료 = new 음료<>(new 차("녹차 잎"));
//		차음료.ShowInfo();
//		
//		음료<주스> 주스음료 = new 음료<>(new 주스("오렌지"));
//		주스음료.ShowInfo();
//		
//	}
//}


class Simple<T> {
	T x;
	T y;
	
	Simple(T x, T y) {
		this.x = x;
		this.y = y;
	}
	
	
	void ShowMember() {
		System.out.println("X = " + x + ", Y = " + y);
	}
}


class Person {
	String name;
	String addr;
	
	Person(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + "]";
	}
	
}

public class C02Generic {
	public static void main(String[] args) {
		Simple<Integer> ob1 = new Simple<Integer>(10, 20);
		ob1.ShowMember();
		System.out.println();
		
		Simple<Person> ob2 = new Simple<Person>(new Person("홍길동", "대구"), new Person("서길동", "남해"));
		ob2.ShowMember();
		System.out.println();
		
	}
}
