package Ch19;


// 1. 상속관계 만들기
// 2. 적절한 생성자 만들기( Sujper예약어 사용 )
// 3. ShowInfo함수 안에서 Downcasting을 통해서 모든 멤버변수정보 출력하기 

// Employee 클래스를 하나 만들자!!
// Employee : 이름 나이 주소 , show()


// 이를 상속받는 Parttimer 클래스와 Regular 클래스를 완성하세요!
// parttimer : hourpay ,  show()
// Regular : salary , show()


// Tips)
// ShowInfo() 함수는 C02Prac 메서드입니다.
// emp1과 emp2를 인수로 받고 있다는 이야기는 그를 모두 받아줄 자료형으로 받아주고 있다는 이야기이다.
// ShowInfo() 메서드에서 다운캐스팅하지 않는다.
// 모든 Parttimer와 Regular 클래스의 객체의 정보를 출력하세요!!




public class C04Prac {
	
	public static void main(String[] args) {
		Parttimer emp1 = new Parttimer("홍길동", "25", "대구", 20000);
		Regular emp2 = new Regular("서길동", "45", "울산", 50000000);
		ShowInfo(emp1);
		System.out.println("------------------------------");
		ShowInfo(emp2);
		
		
		
		
		
		
		
	}

}
