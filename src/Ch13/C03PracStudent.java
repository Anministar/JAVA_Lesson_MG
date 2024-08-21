package Ch13;


//문제 1: 학생 클래스 만들기

//1. Student 클래스를 작성하세요.
//2. name과 age라는 두 개의 속성을 가지도록 클래스를 구성하세요.
//3. 매개변수 생성자를 이용해서 속성을 초기화해주세요!
//4. displayInfo() 메소드를 구현하여 학생의 정보를 출력하세요.


public class C03PracStudent {
	String name;
	int age;

	public void displayInfo() {
		System.out.printf("학생의 정보를 출력합니다.\n");
		System.out.printf("학생의 이름 : %s\n", name);
		System.out.printf("학생의 나이 : %d\n", age);
		
		
	}
	

	public static void main(String[] args) {
		
		C03PracStudent a = new C03PracStudent();
		a.name = "사랑해용";
		a.age = 123;
		a.displayInfo();

	}



}
