package Ch21;
// 첫번째 인터페이스  
interface Flyable {
	void fly();
}

// 두번째 인터페이스i
interface Swimmable {
	void swim();
}


// 다중 상속을 받는 클래스
class Bird implements Flyable, Swimmable {
	@Override
	public void fly() {
		System.out.println("새가 날아갑니다.");
	}
	
	@Override
	public void swim() {
		System.out.println("새가 수영합니다.");
	}
}
public class C02MultiInheritance2 {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.fly();
		bird.swim();
		
		Flyable a = new Bird();
		a.fly();					// 가능
//		a.swim();					// 불가능
	}
	
	
	

}