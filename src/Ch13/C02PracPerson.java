package Ch13;

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//문제
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//1. C02PracPerson 클래스를 작성하세요.
//2. name, age, addr 세가지 속성을 가지도록 클래스를 구성하세요.


public class C02PracPerson {
	String name;
	int age;
	String addr;
	
	public static void main(String[] args) {
		C02PracPerson space = new C02PracPerson();
		space.name = "우주씨";
		space.age = 55;
		space.addr = "대구대구대구";
		
		System.out.printf("%s %d %s\n", space.name, space.age, space.addr);
		
	}

}
