package Ch13;

class C10Person {
	 //속성(=필드, 멤버변수)
	 String name;
	 int age;
	 String addr;
	 
	 
	 void setPerson(String name) {
		this.name = name;
		 
	 }
	 void setPerson (String name, int age) {
		 this.name = name;
		 this.age = age;
	 }
	 void setPerson (String name, int age, String addr) {
		 this.name = name;
		 this.age = age;
		 this.addr = addr;
	 }

	 //기능(멤버메서드)
	 void talk() {
		 System.out.println(name + "님이 말합니다.");
	 }
	 void walk() {
		 System.out.println(name + "님이 걷습니다.");
	 }
	 void ShowInfo() {
		 System.out.printf("이름 : %s 나이 : %d 주소 : %s\n", name, age, addr);
	 }
}
public class C10PersonMain {
	public static void main(String[] args) {
		
		//1. C01Person 클래스를 완성하세요
		//2. name, addr, age 세가지 속성을 정의해주세요!
		//3. name 속성 1개에 대한 setPerson 메서드를 만들어주세요
	 	//4. name, age 속성 2개에 대한 setPerson 메서드를 만들어주세요
	 	//5. name, age, addr 속성 3개에 대한 setPerson 메서드를 만들어주세요
	 	//6. talk(), walk(), ShowInfo() 메서드를 만들어주세요
		
		C10Person obj = new C10Person();
		obj.setPerson("홍길동"); //멤버변수 name에 "홍길동" 저장
		obj.ShowInfo();
		obj.setPerson("서길동", 10); //멤버변수 name, age에 각각 저장
		obj.ShowInfo();
		obj.setPerson("강호동", 55, "서울"); //멤버변수 name, age, addr에 각각 저장
		obj.ShowInfo();
	}

}
