package Ch19;

// Animal01 클래스를 완성하고 이를 상속받는 Dog01 클래스를 완성해라!
// Animal01 : makeSound()				: 동물이 소리를 낸다
// Dog01 : makeSound(), bark()
// 

// Dog01 클래스에서의 makeSound()는 오버라이딩한 makeSound()입니다. 
class Animal01 {
    void makeSound() {
        System.out.println("동물이 소리를 낸다");
    }
}

class Dog01 extends Animal01 {
    // 오버라이딩
    void makeSound() {
        System.out.println("개가 짖는다");
    }

    // 추가적인 메서드
    void bark() {
        System.out.println("왈왈!");
    }
}

public class C02Overriding2 {
	public static void main(String[] args) {
		Dog01 dog = new Dog01();
	
		dog.makeSound();			// 개가 짖는다.
		dog.bark();					// 왈왈!!
		
		
		Animal01 animal = new Dog01();		// 다형성
		animal.makeSound();					// 오버라이딩된 메서드
		// animal은 부모 클래스 타입의 자료형을 가지고 있지만 자식 객체를 차조하고 있다.
		// 만약에 오버라이딩된 메서드가 자식 객체에 있다면 부모클래스 타입을 자료형으로 가지는 참조변수는 오버라이딩된 메서드를 사용한다.
		
		
		// ==> 요약하자면 부모 타입이지만 자식 객체를 참조한다면 자식 객체의 오버라이드 된 메서드를 사용한다.(만약에 오버라이드 된 메서드가 있다면)
//		animal.bark();	// 불가능, 오버라이드 된 메서드가 아닐뿐더러, 자식영역이고, animal 범위는 부모이기 때문
		
		
		
		Dog01 dog01 = new Dog01();
		dog01.makeSound();				// Dog 클래스의 makeSound 메서드 호출
		dog01.bark();					// Dog 클래스의 bark 메서드 호출
		
		
		
		
		
	}

}
