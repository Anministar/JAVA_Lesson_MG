package Ch16;

import java.util.Scanner;

public class Prac01 {
	public static void main(String[] args) {
//		1.크기가 10인 정수 배열을 선언해주세요
//		2.사용자로부터 10개의 정수를 입력받아 배열에 저장해주세요
//		3.배열을 반복하여 짝수의 개수를 세고, 그 값을 출력해주세요
		
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int evenCount = 0;

        System.out.println("정수 10개를 입력하세요:");

        // 사용자로부터 입력받은 정수를 배열에 저장
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 배열을 반복하여 짝수의 개수를 세기
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("입력한 정수 중 짝수의 개수: " + evenCount);
   

	}

}
