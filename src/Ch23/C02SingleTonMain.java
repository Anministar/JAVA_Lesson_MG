package Ch23;

// 싱글톤(Singleton) 패턴은 디자인 패턴 중 하나로, 어떤 클래스가 최대 한번만 인스턴스화(Instance) 되어야 하는 상황에서 사용됨.

// 싱글톤 패턴을 구현하기 위해서는 보통 다음과 같은 구성요소를 가짐.

// Private Constructor (비공개 생성자) : 다른 클래스에서 해당 클래스의 인스턴스를 직접 생성하지 못하도록 생성자를 비공개로 만듦.

// Private static Instance (비공개 정적 인스턴스) : 클래스 내부에서 유일한 인스턴스를 생성하고, 해당 클래스 내부에서만 접근 가능하도록
//											 : private 및 static으로 선언함.

// Public static Method (공개 정적 메서드) : 외부에서 유일한 인스턴스에 접근할 수 있도록 해당 클래스의 유일한 인스턴스에 접근하는 매서드를 제공

// 싱글톤 패턴의 예제 구현

public class C02SingleTonMain {
	// 2. Private Static Instance
	private static C02SingleTonMain instance;
	
	// 1. Private Constructorr
	private C02SingleTonMain() {
		// 생성자 내용
	}
	
	// 3. Public Static Method
	public static C02SingleTonMain getInstance() {
		if(instance == null) {
			instance  = new C02SingleTonMain();
		}
		return instance;
	}
	
	
	// 기타 메서드 및 속성
	public void doSomething() {
		System.out.println("SingleTon instace is doing something.");
	}
}

// 위의 예제에서 getInstance() 메서드를 호출하면 항상 동일한 인스턴스가 반환됨.
// 이렇게 하나의 인스턴스만 존재하도록 보장하는 것이 싱글톤 패턴의 핵심 아이디어임.

// 싱글톤 패턴은 여러 스레드에서 사용될 떄 주의가 필요함. 동시에 여러 스레드에서 getInstance() 메서드를 호출할 경우, 인스턴스가 중복 생성될 수 있음.
// 이를 방지하기 위해 동기화(Synchronization) 또는 더 효율적인 방법을 사용할 수 있음.


