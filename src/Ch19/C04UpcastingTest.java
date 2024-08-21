package Ch19;


// A 클래스를 만들어라!!
// A : num1, num2, Sound()
// A 클래스를 상속하고 있는 B클래스를 만들어라!
// B : num3, Sound() = 오버라이딩 받은 메서드
class A {
	int num1;
	int num2;
	public void Sound() {
		System.out.println("소리를 내다.");
	}
}

class B extends A {
	int num3;
	public void Sound() {
		System.out.println("오버라이딩된 메서드");
	}
}
public class C04UpcastingTest {
	
	public static void main(String[] args) {
		// Nocasting 상태
		A m = new A();
		B n = new B();
		
		m.num1 = 10;
		m.num2 = 20;
//		m.num3 = 30; 				// ERROR
		m.Sound(); 					// A가 가지고 있는 Sound()가 출력 : 소리를 내다.
		
		
		n.num1 = 10;
		n.num2 = 20;
		n.num3 = 30;
		n.Sound(); 					// B가 가지고 있는 Sound()가 출력 : 오버라이딩된 메서드
		
		// Upcasting 상태
		A test = new B();
		test.num1 = 10;
		test.num2 = 20;
		test.Sound(); 				// 오버라이딩된 메서드
									// 자식 클래스에 오버라이딩된 메서드가 있다면? 오버라이딩 된 메서드를 사용한다.
		
		// Downcasting 상태			// 업캐스팅 되었다는 전제 하에 하위 클래스 타입으로 다시 돌려놓는 것
									// 주의점 : 인스턴스인지를 확인해야 한다 == instanceof -- 인스턴스오브
		if (test instanceof B) {
			B down = (B)test;
			down.num1 = 10;
			down.num2 = 20;
			down.num3 = 30;
			down.Sound(); 			// 오버라이딩된 메서드
		}
		
	}

}
