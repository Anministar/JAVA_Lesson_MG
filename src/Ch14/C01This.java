package Ch14;
// ### 'this' Keyword ###
// 클래스 내에서 사용되는 예약어
// 생성되는 객체의 위치정보를 가져오는데 사용됨.

// 멤버변수 vs 매개변수 구별
// this.name = name


// ## this() ##
// Overloading(오버로딩)된 다른 생성자 호출 가능함.

class C02Simple {
	int x;
	int y;
	
	public C02Simple() {
//		x =10;
//		y = 10;
		this(10, 10);
		System.out.println("디폴트 생성자 호출!");
	}
	public C02Simple(int x) {
//		this.x = x;
//		y = 10;
		this(x , 10);
		System.out.println("int x 생성자 호출!");
	}

	public C02Simple(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("int x, int y 생성자 호출!");
	}
	void setX(int x) {
		this.x = x;
	}
	C02Simple getThis() {
		return this;
	}
}


public class C01This {
	public static void main(String[] args) {
		C02Simple ob = new C02Simple();
		System.out.println(ob.toString()); // toString() : 주소값을 반환하는 Method
		System.out.println(ob.getThis());
		
		
		C02Simple ob1 = new C02Simple();
		
		
		C02Simple ob2 = new C02Simple(100);
		C02Simple ob3 = new C02Simple(100,200);
	}

}
