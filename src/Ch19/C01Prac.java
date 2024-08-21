package Ch19;

// [1번] 다음 main() 메서드를 만족하도록 TV 클래스를 상속받는 ColorTV클래스를 완성하라!!!
// TV : size, getSize(), setSize()
// ColoTV : color, printProperty()


//### super()의 개념과 필요 이유 ###
//super 					: 부모 클래스를 뜻함.
//super() 					: 부모 클래스의 기본 생성자를 뜻함.
//super(매개변수)				: 부모 클래스의 매개변수 생성자를 뜻함.

//부모 클래스의 생성자를 호출하는 이유 :  	부모 클래스의 초기화 코드를 실행시켜야 하기 때문임.
//								부모 클래스는 자식 클래스보다 상위 수준의 기능이나 속성을 정의하고 있음.
//								따라서 자식 클래스가 생성될 때 부모 클래스의 초기화 작업이 먼저 이루어져야 함.

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}

class ColorTV extends TV {
	int color;

	ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	void printProperty() {
		System.out.printf("%d인치 %d컬러", getSize(), color);
	}
}

public class C01Prac {
	public static void main(String[] args) {
		ColorTV myTV = new ColoTV(32, 1024);
		
		myTV.printProperty();								// 32인치 1024컬러 TV입니다.
		
		
		
		myTV.setSize(120);
		System.out.println(myTV.getSize() + "인치");			// 120인치					
	}

}
