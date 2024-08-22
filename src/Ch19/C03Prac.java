package Ch19;

// Moonbanggu 클래스를 완성해라!!
// Moonbanggu : 샤프재고량 : 100, 연필재고량 : 100, write() 

// 이를 상속받는 Sharpen, Pencil 클래스를 완성해라!
// Sharpen : write()
// Pencil : write()

// Sharpen, Pencil 객체를 만들때마다 재고가 하나씩 줄어야한다.
class Sharpen {
	String model;
	int year;
	static int price;
	
	public Sharpen(String model, int year) {
		this.model = model;
		this.year = year;
	}
	
	
	public static void write() {
		System.out.println("가격이 " + price + "인 샤프로 씁니다.");
		
	}
	
	public void erase() {
		System.out.println(model + "샤프의 지우개로 지웁니다.");
	}	
}


public class C03Prac {
	
	public static void main(String[] args) {
		Sharpen item1 = new Sharpen();
		
		
		
		
		Pencil item2 = new Pencil();
		Writing(item1); // "샤프로 씁니다" 가 출력
		Writing(item2);	// "연필로 씁니다" 가 출력
		ShowInfo();		// 샤프 재고량 : 99 , 연필 재고량 :99
	}

}
