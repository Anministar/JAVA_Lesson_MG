package Ch16;
import java.util.Scanner;

public class C01PracArray {
   public static void main(String[] args) {
      // 5 크기의 int형 배열을 만들어서
	   int[] ai = new int[5];
      
//      //반복문을 사용해 각 배열의 공간에 각각 정수값을 입력
	   Scanner sc = new Scanner(System.in);
	   
	   for(int i = 0; i < ai.length; i++) {
		  ai[i] = sc.nextInt();
	   }
	   
	   
//	   ai[0] = sc.nextInt();
//	   ai[1] = sc.nextInt();
//	   ai[2] = sc.nextInt();
//	   ai[3] = sc.nextInt();
//	   ai[4] = sc.nextInt();
      
      
      //합, 평균, 최대값, 최소값을 구합시다.
	   // 합 : for문을 활용해서 sum 변수이라는 변수에 저장
	   int sum = 0;
	   for(int i = 0; i < ai.length; i++) {
		   sum += ai[i];
	   }
	   
	   
	   System.out.println("5개 정수의 총합 : " + sum);
	   
	   
	   // 평균 == 총합 / 배열의 개수
	   int average = sum / ai.length;
	   
	   System.out.println("5개 정수의 평균 : " + average);
	   
	   // 최대값 : 0요소를 최대값에다가 저장, 1,2,3,4인덱스의 요소값과 비교
	   int max = ai[0];   // ai[0]은 비교대상의 초기값 지정
	   for(int i = 1; i < ai.length; i++) {
		   if (max < ai[i]) {
			   max = ai[i];
		   }
	   }
	   System.out.println("5개 정수 중 최대값 : " + max);
	   
	   // 최소값
	   int min = ai[0];
	   for (int i = 1; i < ai.length; i++) {
			if(min > ai[i]) {
				min = ai[i];
			}
	   }
	   System.out.println("5개 정수 중 최소값 : " + min);
	   
	   
	   
	   
	   
      
      // 정수를 입력해주세요 >>> 10
      // 정수를 입력해주세요 >>> 20
      // 정수를 입력해주세요 >>> 30
      // 정수를 입력해주세요 >>> 40
      // 정수를 입력해주세요 >>> 50
      
      // 5개 정수의 총합 : 150
      // 5개 정수의 평균 : 30
      // 5개 정수 중 최대값 : 50
      // 5개 정수 중 최소값 : 10
      
	}
	
}
