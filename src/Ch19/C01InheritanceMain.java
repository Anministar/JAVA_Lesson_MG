package Ch19;


// 아래의 메인을 만족하는 Point2D 클래스와 Point3D 클래스를 완성하세요!!
// Point2D : x, y, showPoint()
// Point3D : z, showPoint3D()

//상위클래스, 부모클래스, 슈퍼클래스
class Point2D {
	int x;
	int y;
	void showPoint() {
		System.out.println(x + " , " + y);
	}
}
//하위클래스
class Point3D extends Point2D {
	int z;
	void showPoint3D() {
		System.out.printf("%d, %d, %d\n", x, y, z);
	}
}



public class C01InheritanceMain {
	public static void main(String[] args) {
		Point3D ob1 = new Point3D();
		ob1.x = 10;
		ob1.y = 20;
		ob1.showPoint();		// x, y값을 출력하는 메서드
		ob1.z = 30;
		ob1.showPoint3D();		// x, y, z값을 출력하는 메서드
	}

}
