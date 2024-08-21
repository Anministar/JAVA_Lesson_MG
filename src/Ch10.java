
public class Ch10 {
	
	public static void main(String[] args) {
		// 중첩 while문
		
		
		
		// 문제
		// 구구단 2단 출력
		// [결과값]
		// 2 x 1 = 2
		// 2 x 2 = 4
		// ...
		// 2 x 9 = 18
//		
//		int i = 1;
//		int dan =  2;
//		
//		
//		while (i <= 9) {
//			
//			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
////			System.out.println(dan + " x " + i + " = " + dan * i);
//			
//			i++;
//		}
		
		
		
		//문제
		//구구단 2단 출력(역순출력)
		
		
		
		
		//문제
		//구구단 N단 출력(입력받기)
		
		
		
		
		
		//전체 구구단(2단-9단) 출력하기
		// [결과값]
		// 2 x 1 = 2
		// 2 x 2 = 4
		// ...
		// 2 x 9 = 18
		
		
		// 3 x 1 = 3
		// 3 x 2 = 6
		// ...
		// 3 x 9 = 27
		
		
		// 9 x 1 = 9
		// 9 x 2 = 18
		// ...
		// 9 x 9 = 81
		
		
		
		
		
		//1
		//*****
		//*****
		//*****
		//*****
		
		
		// 1. 줄을 기준으로 반복이 된다.
//		int i = 1;
//		while(i <= 4) {
//			int j = 1;
//			while(j <= 5) {
//				System.out.print("*");
//				j++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		// 2. 별을 기준으로 반복이 된다.
//		
//		int j = 1;
//		while(j <= 4) {
//			int i = 1;
//			while (i <= 5) {
//				System.out.print("*");
//				i++;
//			}
//			
//			j++;
//			System.out.println();
//		}
		
		
	
		
		//높이 : n
		//*****
		//*****
		//*****
		//*****
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("높이 : ");
//		int n = sc.nextInt();
//		
//		int i = 0;
//		int j = 0;
//		while (i < n ) {
//			while( j < n) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			j = 0;
//			i++;
//		}
		
		
		
		//2
		//*
		//**
		//***
		//****
		
//		int i = 0;
//		int j = 0;
//		while ( i < 4 ) {
//			j=0;
//			while( j <= i ) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		//높이 : 4
		//*
		//**
		//***
		//****
		
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		
//		int i = 0;
//		int j = 0;
//		while ( i < n ) {
//			j=0;
//			while( j <= i ) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		//3
		//****
		//***
		//**
		//*
		
		
		
//		int i = 0;
//		int j = 0;
//		
//		while(i < 4) {
//			j = 0;
//			while( j <= 3- i  ) {
//				System.out.print("*");
//				j++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		
		
		//높이 : 4
		//****
		//***
		//**
		//*
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		int i = 0;
//		int j = 0;
//		
//		while(i < n) {
//			j = 0;
//			while( j <= (n-1) - i  ) {
//				System.out.print("*");
//				j++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		
		
		
		//4
		//   *
		//  ***
		// *****
		//*******
		
		
		// space 		stars			i
		// 3			1				1(0)			
		// 2			3				1(1)
		// 1			5				1(2)
		// 0			7				1(3)
		
//		int i = 0;
//		while (i < 4) {
//			int space = 0;
//			while (space < 3 - i) {
//				System.out.print(" ");
//				space++;
//			}
//			
//			int stars = 0;
//			while(stars < 2 * i + 1) {
//				System.out.print("*");
//				stars++;
//			}
//			
//			
//			i++;
//			System.out.println();
//		}
		
		
		
		
		
		
		
		// 여기까지 숙제
		
		//5
		//*******
		// *****
		//  ***
		//   *
		
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		
//		
//		while (i < 4) {
//			//공백
//			j=0;
//			while(j<=i-1) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			k = 0;
//			while (k<=6-2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		//높이 : n
		//*******
		// *****
		//  ***
		//   *
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		
//		int i = 0;		//행
//		int j = 0;		//공백
//		int k = 0;		//별
//		
//		while( i < n ) {
//			
//			//공백
//			j = 0;
//			while (j <= i-1) {
//				System.out.print(" ");
//				j++;
//			}
//			
//			k = 0;
//			
//			while (k <= (n-1)*2 -2*i) {
//				System.out.print("*");
//				k++;
//			}			
//			System.out.println();
//			i++;
//		}
		
		
		
		//6
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *
		
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		
//		while(i < 7) {
//			
//			if (i < 4) {
//				
//				//공백
//				j = 0;
//				while(j<=2-i) {
//					System.out.print(" ");
//					j++;
//				}
//				//별
//				k = 0;
//				while(k<=2*i) {
//					System.out.print("*");
//					k++;
//				}
//			}
//			else {
//				//공백
//				j = 0;
//				while (j<=i-4) {
//					System.out.print(" ");
//					j++;
//				}
//				//별
//				k = 0;
//				while (k<=12 -2*i) {
//					System.out.print("*");
//					k++;
//				}
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		
		
	}
 

}
