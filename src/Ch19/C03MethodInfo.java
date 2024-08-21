package Ch19;


//아래 Main을 만족하도록 클래스를 완성해라!
// Sub 클래스를 Super 클래스를 상속한다.
// Super : 정수형 num1, sound()  			// Sound()는 Super's Sound 메서드입니다 출력


// Sub 	 : 정수형 num2, move(), sound()	// move()는 Sub's move 메서드입니다
										// sound()는 오버라이딩 어노테이션도 같이 붙여서 오버라이드 시켜주세요!


class Super {
	int num1 = 0;
	
	public void Sound() {
		System.out.println("Super's Sound입니다.");
	}
	
	
}

class Sub extends Super {
	int num2 = 0;
	public void move() {
		System.out.println("Sub이 움직인다.");
	}
	public void Sound() {
		System.out.println("Sub's Sound입니다.");
	}
}

public class C03MethodInfo {
	public static void main(String[] args) {
		
		// Nocasting(정상범위)
		Super ob1 = new Super();
		ob1.num1 = 120;

		Sub ob2 = new Sub();
		ob2.num1 = 20;
		ob2.num2 = 30;
		
		int sum = ob1.num1 + ob2.num1;
		
		System.out.println("ob1과 ob2의 num1의 합은 : " + sum + "입니다.");
		
		ob2.move();
		
		
		// Upcasting(상위클래스 참조변수 = 하위객체)
		Super ob3 = new Sub();
		ob3.Sound();			// Sub's Sound 메서드 입니다.
		
		
		
		
	}

}
