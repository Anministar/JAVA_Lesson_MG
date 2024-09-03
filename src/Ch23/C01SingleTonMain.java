package Ch23;


// 디자인 패턴 (Design Pattern)

// 반복적을 발생하는 설계 문제에 대한 해결책을 재사용 가능한 형태로 정리한 것
//
// 상품 제작시 사전에 발견되었던 문제들을 해결하고 정형화 시켜놓은 작업 패턴
// 디자인 패턴은 제작자들간의 의사소통 수단의 일종임.
// Ex) 의류를 디자인을 할 때 일반적으로 알려진 패턴대로 재단을  함(~소재는 미싱은 어떻게 어떻게 해아 ~ 잘 뜯어지지 않는다.)
// Ex) 그렇게 하지 않을 때 품질에 이상발생 가능성이 높음.


// 프로그래밍 언어의 디자인 패턴
// 프로그램 제작 시 사전에 발견되었던 문제들을 해결하고 정형화 시켜놓은 작업패턴

// 싱글톤 패턴
// 하나의 객체를 생성하여 다수의 클라이언트가 접속하여 사용하는 형태
// 하나의 인스턴스를 공유하여 사용할 수 있음.
// Ex) DB Connection Pool  생성 시 사용

// 어떤 클래스가 최대 한번만 인스턴스화되어야 하는 경우에 사용되는 디자인 패턴 중 하나
class C01Company {
	// 멤버변수
	int x;
	int y;
	private static C01Company instance = null;		// 객체 생성을 하지 않아도 사용할 수 있음.
													// 아니면 C01Company instance; 이렇게 만들어줘도 Okay
	
	private C01Company() {							// private : 다른 위치에서 생성자 사용 X, 오직 이 클래스 안에서만 만들 수 O
		x = 10;
		y =20;
	}
	
	// 멤버함수
	public static C01Company getInstance() { 		// getter 함수
		if(instance == null) {						// C01Company에 대한 객체를 처음에 생성시에 유효한(실행되는) 코드
			instance = new C01Company();
		}
		return instance;
		
	}
}
public class C01SingleTonMain {
	public static void main(String[] args) {
		C01Company myCompany1 = C01Company.getInstance();		// C01Company 클래스가 가지고 있는 static 변수 instance에는
																// new C01Company() 라는 새로운 객체정보를 가지는 과정!
																// 예를 들어 new C01Company()라는 객체의 메모리 주소를 120 가정.
		C01Company myCompany2 = C01Company.getInstance(); 		// 120번지의 메모리 주소값을 myCompany2에 전달(연결)
		
		System.out.println(myCompany1 == myCompany2); 			// True
		System.out.println("myCompany1 : " + myCompany1.x);
		System.out.println("myCompany2 : " + myCompany1.y);
		
	}

}
