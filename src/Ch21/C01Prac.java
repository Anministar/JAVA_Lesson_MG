package Ch21;


// interface 정의 (Shape)
// PI (3.14)
// getRound()			// 둘레		
// getArea()			// 넓이

// class 정의 (Circle)
// r(반지름)
// getRound()			// 2 x PI * r
// getArea()			// PI * r * r


// class 정의 (Rectangle)
// 가로 길이
// 세로 길이
// getRound()			// 2 * (가로 + 세로)
// getArea()			// 가로 * 세로
public class C01Prac {
		Shape donut = new Circle(10);
		donut.getRound();			// 62.8
		donut.getArea();			// 314
		
		Shape rec = new Rectangle(3, 4);
		rec.getRound(); 			// 14
		rec.getArea();				// 12
	}

}
