package Ch25;

//문제:
//1. Product라는 사용자가 직접 정의한 클래스를 작성해주세요!!
//	 이 클래스는 상품을 나타내는 클래스이고 속성을 이름(name)과 가격(price)을 가지고 있음.

//2. Container라는 제네릭 클래스를 작성해주세요!!
//이 클래스는 어떤 클래스의 객체라도 저장할 수 있고 item 속성을 가지고 있음.
//	 Container 클래스의 item 필드는 저장된 객체를 나타냄.

//3. Point라는 사용자 정의 클래스를 만들어주세요!!
//	 이 클래스는 속성을 x, y를 가지고 있음.

//4. showInfo 메소드는 저장된 객체의 정보를 출력함. (toString() 재정의 사용)
public class C02Prac {
    public static void main(String[] args) {
        // Product 객체를 저장하는 Container 객체 생성
        Product laptop = new Product("Laptop", 1200);
        Container<Product> productContainer = new Container<>(laptop);
        productContainer.showInfo();

        // 사용자 정의 클래스를 저장하는 Container 객체 생성
        Container<Point> pointContainer = new Container<>(new Point(5, 10));
        pointContainer.showInfo();
    }
}
