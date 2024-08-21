package Ch19;
// ### 상속(Inheritance) ###

// ## 상속의 기본구조 ##
// class 부모 클래스 {
// 		부모 클래스의 멤버 변수와 메서드
//}


// class 자식클래스 extends 부모클래스 {
//		자식 클래스의 추가적인 멤버 변수와 메서드
//}


// ## 상속의 특징 ##
// 1. 재사용성 (Reuse) : 부모 클래스에서 정의된 멤버 변수와 메서드를 자식 클래스에서 그대로 사용할 수 있음.
//						이를 통해 코드 중복을 줄이고 유지보수성을 향상시킴.

// 2. 확장성 (Extension) : 자식 클래스에서 부모 클래스의 기능을 확장하거나 수정할 수 있음.
//							새로운 멤버 변수나 메서드를 추가하거나, 부모 클래스의 메서드를 오버라이딩(Overriding)하여 재정의할 수 있음.

// 3. 다형성 (Polymorphism) : 상속 관계에서 부모 클래스 타입의 참조 변수로 자식 클래스의 객체를 참조할 수 있음.
//						    이를 통해 하나의 변수로 여러 타입의 객체을 다룰 수 있음.

// ## 주의사항 ##
// 1. 단일 상속 : 자바에서는 단일 상속만을 지원함.
//				즉, 하나의 클래스는 하나의 부모 클래스만을 가질 수 있음.
//				이로 인해 클래스 간의 강한 결합을 피하고 복잡성을 감소시키는 효과가 있음.


// 2. 접근 제어자 : 상속 관계에서 부모 클래스의 멤버 변수 및 메서드의 접근 제어자에 따라 자식 클래스에서의 접근 여부가 결정됨.
//				private으로 선언된 멤버는 상속이 되지만 직접 접근할 수 없음

// 3. 생성자 호출 : 자식 클래스의 생성자가 호출될 때, 부모 클래스의 기본 생성자가 자동으로 호출됨.
//				만약 부모 클래스에 매개변수가 있는 생성자가 정의되어 있다면, 자식 클래스에서 명시적으로 super()를 사용하여 호출해야 함.



// 차량(Vehicle) : 부모 클래스
// 멤버 변수 		: String brand("Porche")
// 매개변수 생성자	: O
// 멤버 메서드		: start()  : Porche 차량의 시동을 겁니다.
//				: stop()   : Porche 차량의 시동을 끕니다.


// 자동차(Car)  	: 자식 클래스
// 멤버 변수 		: String model
// 매개변수 생성자	: O
// 멤버 메서드		: accelerate() : Porche 911 차량이 가속한다.
//				: brake()      : Porche 911 차량이 제동한다.


// ---------------Main method 코드 ---------------------------
//Car myCar = new Car("Porche");
//myCar.start();
//myCar.accelerate();
//myCar.brake();
//myCar.stop();











// 부모 클래스 : 차량(Vehicle)
class Vehicle {
	String brand;
	
	Vehicle(String brand) {
		this.brand = brand;
	}
	
	void start() {
		System.out.println(brand + " 차량 시동을 걸다.");
		
	}
	
	void stop() {
		System.out.println(brand + " 차량을 정지시킨다.");
	}
}


// 자식 클래스 : 자동차(Car)
class Car extends Vehicle {
	Car(String brand) {
		super(brand);
	}
	
	void accelerate() {
		System.out.println(brand + " 차량이 가속한다.");
	}
	void brake() {
		System.out.println(brand + " 차량이 제동한다.");
	}
}

class 동하 extends Vehicle {
	동하(String brand) {
		super(brand);
	}
	
	void teach() {
		System.out.println(brand + "가 가르친다.");
	}
	void talk() {
		System.out.println(brand + "가 강의를 하다.");
	}
}

public class Ch19 {
	public static void main(String[] args) {
		Car myCar = new Car("Porshe");
		
		myCar.start();			// 부모 클래스의 메서드 호출
		myCar.accelerate();		// 자식 클래스의 메서드 호출
		myCar.brake(); 			// 자식 클래스의 메서드 호출
		myCar.stop(); 			// 부모 클래스의 메서드 호출
		
		동하 동동이 = new 동하("코드마법사");
		
		동동이.start();
		동동이.teach();
		동동이.talk();
		동동이.stop();
		
		
		
	}

}
