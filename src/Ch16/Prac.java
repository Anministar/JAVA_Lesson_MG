package Ch16;


// 문제 01
// 5개의 정수를 저장할 수 있는 배열을 선언하고 모든 요소를 0으로 초기화하십시오.
// 그리고 배열을 출력하십시오.
// 
// Tip) 크기 : 5, 자료형 : int, 모든 요소를 0으로 초기화, 배열 출력
// 
// 문제 02
// 5개의 정수를 저장할 수 있는 배열을 선언하고 사용자로부터 5개의 정수를 입력받아 배열에 저장하십시오.
// 그리고 배열을 출력하십시오.
//
// 문제 03
// 10개의 정수를 저장할 수 있는 배열을 선언하고 배열을 역순으로 초기화하십시오.
// 그리고 배열을 출력하십시오.
//
// 문제 04
// 3명의 학생의 시험 점수를 저장하는 배열을 선언하고, 사용자로부터 점수를 입력받아 배열에 저장하십시오.
// 그리고 평균 점수를 계산하여 출력하십시오.
//
// 문제 05
// 정수로 이루어진 배열을 선언하고, 배열에 저장된 모든 정수의 합을 계산하여 출력하십시오.





public class Prac {

	private static double calculateAverage(int[] studentScores) {
		// TODO Auto-generated method stub
		return 3.14;
	}
	
	private static void inputStudentScores(int[] studentScores) {
		// TODO Auto-generated method stub
		
	}
	
	private static void initializeReverseArray(int[] array3) {
		// TODO Auto-generated method stub
		
	}
	
	private static void inputArrayValues(int[] array2) {
		// TODO Auto-generated method stub
		
	}
	
	private static void printArray(int[] array1) {
		// TODO Auto-generated method stub
		
	}
	
	private static int calculateSum(int[] numbersArray) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	 public static void main(String[] args) {
	        // 문제 01
	        // 5개의 정수를 저장할 수 있는 배열을 선언하고 모든 요소를 0으로 초기화하고 배열을 출력합니다.
	        int[] array1 = new int[5];
	        printArray(array1);

	        // 문제 02
	        // 5개의 정수를 저장할 수 있는 배열을 선언하고 사용자로부터 5개의 정수를 입력받아 배열에 저장하고 배열을 출력합니다.
	        int[] array2 = new int[5];
	        inputArrayValues(array2);
	        printArray(array2);

	        // 문제 03
	        // 10개의 정수를 저장할 수 있는 배열을 선언하고 배열을 역순으로 초기화하고(사용자로 부터 값을 입력받는 것 X, 9876543210 이 값을 차례로 넣으면 됨, 직접 대입 X) 배열을 출력합니다.
	        int[] array3 = new int[10];
	        initializeReverseArray(array3);
	        printArray(array3);

	        // 문제 04
	        // 3명의 학생의 시험 점수를 저장하는 배열을 선언하고, 사용자로부터 점수를 입력받아 배열에 저장하고 평균 점수를 출력합니다.
	        int[] studentScores = new int[3];
	        inputStudentScores(studentScores);
	        double averageScore = calculateAverage(studentScores);
	        System.out.println("평균 점수: " + averageScore);

	        // 문제 05
	        // 정수로 이루어진 배열을 선언하고, 배열에 저장된 모든 정수의 합을 계산하여 출력합니다.
	        int[] numbersArray = {3, 7, 2, 8, 5};
	        int sum = calculateSum(numbersArray);
	        System.out.println("배열의 합: " + sum);
	    }

	

	
}
