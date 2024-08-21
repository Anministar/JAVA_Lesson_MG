package Ch19;

// ### 업캐스팅과 다운캐스팅 ###

// 1. 업캐스팅 : 하위 클래스의 객체를 상위 클래스 타입으로 변환하는 것을 의미.
// class Animal {}
// class Dog extends Animal { }

// Dog myDog = new Dog();
// Animal myAnimal = new Dog();			// 업캐스팅

// 2. 다운캐스팅 : 상위 클래스 타입으로 캐스팅된 객체를 다시 원래의 하위 클래스 타입으로 변환하는 것을 의미 ==> 업캐스팅이 전제되어야 함.
// 명시적인 형 변환 연산자가 필요하며, ==> 강제 형변환이 필요하다.
// 이를 통해 객체를 다시 원래 타입으로 사용할 수 있음.

// ### 다운캐스팅은 주의점 ###
// 실제로 해당 객체가 원하는 하위 타입의 인스턴스인지를 확인하는 작업이 필요함.
// class Animal { }
// class Dog extends Animal { }
// 

// Animal myAnimal = new Dog();
// Dog myDog = (Dog) myAnimal;		// 다운캐스팅


// 다운캐스팅 전에 instanceof 연산자를 사용하여 객체의 타입을 확인하는 것이 안전 ==> boolean 타입으로 결과값을 반환
// if (myAnimal instanceof Dog) {
// 		Dog anotherDog = (Dog) myAnimal;			// myAnimal이 Dog 클래스의 인스턴스라면 다운캐스팅을 진행해라.
// }

// ### 객체와 인스턴스의 차이점 ##
// Dog mydog = new Dog();			// mydog는 Dog 클래스의 인스턴스이자, 실제 객체이기도 함.
									// mydog는 Animal 클래스의 인스턴스이지만, 실제 객체는 아닙니다.
// ==> Dog클래스는 Animal클래스로 부터 상속을 받았기 때문에 (파생되었기 때문에) Animal은 인스턴스가 될 수 있지만 객체는 꼭 아니다.






class C05Super {
	int num1;
}
class C05Sub extends C05Super{
	int num2;				// 확장
}


public class C04Upcasting {
	public static void main(String[] args) {
		// Nocasting
		C05Super ob1 = new C05Super();
		C05Sub ob2 = new C05Sub();
		
		
		
		
		
		// Upcasting (상위클래스 참조변수 = 하위객체)
		C05Super ob3 = new C05Sub();
		ob3.num1 = 10;		// 가능
//		ob3.num2 = 20;		// 불가능 (참조변수가 num2를 찾지 못함.)
		
		C05Sub down = null;
		if( ob3 instanceof C05Sub) {
//			down = ob3;			 // Compile Error
			down = (C05Sub) ob3;
			down.num2 = 20;
		}
		
		
		
		
		
	}

}
