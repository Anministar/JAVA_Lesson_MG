package Ch24;

import java.util.Scanner;

// #### 예외 처리 ###
// 1. 예외 처리 : 프로그램 실행 중에 예외가 발생할 수 있는 상황에 대비하여 적절한 조치를 취하는 것을 의미
// 2. 예외     : 프로그램의 정상적인 흐름을 방해하거나 중단시킬 수 있는 상황을 나타냄.


// try - catch문은 예외 처리를 위한 JAVA의 기본적인 구문임.
// JAVA 프로그램에서 예외가 발생할 수 있는 코드 블록을 try 블록내에 배치하고,
// 예외가 발생할 경우에 대한 처리를 catch 블록에서 수행함.


// try 블록				: 예외가 발생할 수 있는 코드를 포함하는 블록임.
// catch 블록				: try 블록에서 발생한 예외를 처리하는 블록임.
//						: 여러 개의 catch 블록을 사용하여 다양한 종류의 예외를 처리할 수 있음.


// finally 블록			: try 블록이나 catch 블록에서 리턴되더라도
//						: 항상 실행되어야 하는 블록임.


// ### try - catch 구조 ###

// try {
// 	// 예외가 발생할 수 있는 코드 블록
// } catch (ExceptionTyp1 e1) {
//  // ExceptionType1 예외를 처리하는 블록
// } catch ( ExceptionType2 e2) {
//  // ExceptionType2 예외를 처리하는 블록
// } finally {
//  // 항상 실행되어야 하는 블록(선택적)
// }


// ## 예외 종류 ##

// 1. 컴파일 타임 예외 (Checked Exception) 		: 발생 시점 -- 컴파일 시에 발생하는 예외
//											: 처리 여부 -- 반드시 예외를 처리해야 함.

// Ex) IOException, SQLException, ClassNotFoundException, InterruptedException




// 2. 런타임 예외 (Unchecked Exception)		: 발생 시점 -- 런타임 시에 발생하는 예외
//											: 처리 여부 -- 명시적인 예외 처리가 필요하지 않음
//											:         -- 개발자가 필요하다고 판단하면 예외 처리

// Ex) NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException, IllegalArgumentException,
//     IllegalStateException


// ## 주의해야 할 점 ##
// 런타임 예외(Unchecked Exception)은 컴파일러가 강제적으로 예외 처리를 확인 X, 따라서 개발자가 명시적으로 처리하지 않아도 됨.
// But, 예외 발생 시 프로그램이 비정상적으로 종료될 수 있음, 따라서 적절한 예외 처리를 하는 것이 좋음.


public class Ch24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int num = sc.nextInt();
		int num1 =sc.nextInt();
		
		try {
			int result = num / num1;	
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Hello world");
		
		
	}

}
