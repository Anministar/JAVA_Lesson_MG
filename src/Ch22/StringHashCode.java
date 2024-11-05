package Ch22;

public class StringHashCode {
	
	public static void main(String[] args) {
		
		String a = "java";
		String b = "java";
		
		// Object 클래스에서의hashCode() == 객체의 주소값을 해싱한 값
		
		
		// String 클래스에서의 hashCode() == 문자객체의 내용을 해싱한 값
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		// System.idoentityHashCode() == 객체의 주소값을 해싱한 값
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println();
		
		
		String c = "java";
		String d = new String("java");
		
		
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		
		
		
		
		
	}

}
