package Ch24;


// ### ClassNotFoundException ###
// 클래스 로더가 클래스를 찾지 못할 때 발생하는 예외
// 이 예외는 주로 동적으로 클래스를 로딩하는 시점에서 해당 클래스를 찾을 수 없을 때 발생

public class C06ClassNotFoundException {

	public static void main(String [] args) {
		try {
			// 존재하지 않는 클래스를 로딩하려고 시도
			Class<?> myClass = Class.forName("Ch24.C02ArrayIdxException");
			System.out.println(myClass.toString());
			System.out.println(myClass.getClass());
//			Class<?> myClass = Class.forName("anyClass"); 		// Error why? ==> 없는 클래스이기 때문.
			System.out.println("클래스 로딩 성공~!!");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundexception 발생 : " + e.getMessage());
		}
	}
}
