package Ch13;
class C11Simple {
	// 속성
	int x; 		// 0
	double y;	// 0.0
	char z;		// ' '
	boolean b;	// false
	String str; // null
	
	// 디폴트 생성자
	public C11Simple() {
		// TODO Auto-generated constructor stub
	}
	
	//생성자 함수오버로딩
	C11Simple(int x) {
		this.x= x;
		System.out.println("C11Simple(int) 생성자 호출!");
	}
	C11Simple(int x, double y) {
		this.x = x;
		this.y = y;
		System.out.println("C11Simple(int, double) 생성자 호출!");
	}

	@Override
	public String toString() {
		return "C11Simple [x=" + x + ", y=" + y + ", z=" + z + ", b=" + b + ", str=" + str + "]";
	}
	
	
	
}
public class C11ConstructorMain {
	public static void main(String[] args) {
		C11Simple obj = new C11Simple();		// 디폴트생성자
		System.out.println(obj.toString());
		C11Simple obj2 = new C11Simple(10);		// int를 받는 생성자
		System.out.println(obj2.toString());
		C11Simple obj3 = new C11Simple(10, 10.2);	// int, double 받는 생성자
		System.out.println(obj3.toString());
	}

}
