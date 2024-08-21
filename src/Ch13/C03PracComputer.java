package Ch13;

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//문제
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//1. Computer 클래스를 완성하세요
//2. SerialNo, CPUSpec, RAMSpec, DISKSpec 네가지 속성을 정의해주세요!
//3. 매개변수 생성자를 만들어서 객체를 초기화해주세요!
//3. powerON() 메서드를 통해 전원을 킨다는 정보를 출력하는 메서드를 만들어주세요
//4. ShowInfo() 메서드를 통해 컴퓨터 정보를 출력하는 메서드를 만들어주세요
//5. powerOFF() 메서드를 통해 전원을 끈다는 정보를 출력하는 메서드를 만들어주세요


class Computer {
	String SerialNo;
	String CPUSpec;
	String DISKSpec;
	String RAMSpec;
	
	public void PowerON() {
		System.out.println(SerialNo + "의 전원을 켭니다.");
		
	}
	public void ShowInfo() {
		System.out.println("시리얼 넘버 : " + SerialNo);
		System.out.println("CPUSpec : " + CPUSpec);
		System.out.println("RAMSpec : " + RAMSpec);
		System.out.println("DISKSpec : " + DISKSpec);
			
	}
	public void PowerOFF() {
		System.out.println(SerialNo + "의 전원을 끕니다.");
	}
	
}

public class C03PracComputer {
	
	
	public static void main(String[] args) {

		Computer LGGram1010 = new Computer();
		LGGram1010.SerialNo = "1010";
		LGGram1010.CPUSpec = "I7";
		LGGram1010.RAMSpec = "16G";
		LGGram1010.DISKSpec = "2TB";
		LGGram1010.PowerON(); // 1010의 전원을 켭니다.
		System.out.println();

		LGGram1010.ShowInfo(); // 시리얼 번호 : 1010
								// CPUSpec : I7
								// RAMSpec : 16G
								// DISKSpec : 2TB
		System.out.println();

		LGGram1010.PowerOFF(); // 1010의 전원을 끕니다.
	}

}
