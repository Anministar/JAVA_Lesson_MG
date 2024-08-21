import java.util.Scanner;

public class Ch08 {

	public static void main(String[] args) {
		// 00 Switch문 (다중 분기)
		// 조건문 중 하나
		// 조건이 여러개일 때 각 조건에 따른 코드를 실행할 수 있음.
				
				
		// 01 Switch문 구조

//		switch (변수) {
//		case 값1:					// case는 여러개일 수 있다.
//									// case == if문이면서 else if문이기도 함.
//			실행할 코드1;
//			break;					// 위 코드를 실행 후 break;를 만나면 Stop역할
//		 
//		case 값2:					// 얘는 else if니깐 :)
//			실행할 코드2;
//			break;
//		 
//		default:					// else문(case의 조건에 부합하지 않을 시 나머지 처리)
//			break;
//		}
//		System.out.println("--------------------- switch문 예제 01 ----------------------");
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		
//		switch (num) {
//		case 1:
//			System.out.println("[SYSTEM] : num이 1인 경우에 실행되는 코드입니다.");
//			break;
//		case 2:
//			System.out.println("[SYSTEM] : num이 2인 경우에 실행되는 코드입니다.");
//			break;
//		case 3:
//			System.out.println("[SYSTEM] : num이 3인 경우에 실행되는 코드입니다.");
//			break;
//		default:
//			System.out.println("[SYSTEM] : num이 1, 2, 3 이외의 모든 경우에 실행되는 코드입니다.");
//			break;
//		}
//		System.out.println("Switch문, 즉 다중분기문을 종료하겠습니다.");
//		System.out.println();
		
		
	 	
//	   	if (score >= 90) {
//			System.out.println("A");
//		}
//		else if (score >= 80) {
//			System.out.println("B");
//		}
//		else if (score >= 70) {
//			System.out.println("C");
//		}
//		else if (score >= 60) {
//			System.out.println("D");
//		}
//		else {
//			System.out.println("F");
//		}
		
		
//		
//		switch(score / 10) {
//		case 10:
//			System.out.println("축하드립니다, 100점 만점으로 A학점입니다.");
//			break;
//		case 9:
//			System.out.println("90점 이상의 점수로 A학점입니다");
//			break;
//		case 8:
//			System.out.println("80점 이상의 점수로 B학점입니다");
//			break;
//		case 7:
//			System.out.println("70점 이상의 점수로 C학점입니다");
//			break;
//		case 6:
//			System.out.println("60점 이상의 점수로 D학점입니다");
//			break;
//		default:
//			System.out.println("60점 미만의 점수로 F학점입니다");
//			break;
//		
//		}
		
		
		// 문제 : 주어진 등수에 따라 메달의 색이 결정되는 프로그램을 작성해주세요 !!
		// 사용자로부터 ranking을 입력받아 메달 색을 출력해주세요 !!
		// 1등, 2등, 3등, 참여한 사람들의 랭킹에 따라 메달 색을 달리 출력해주세요
		
		
		// 1등 : Gold
		// 2등 : Silver
		// 3등 : Bronze
		// 3등 미만 : Black
		
		// [결과값]
		// 랭킹을 입력해주세요 >>> 6
		// 메달 색상 : Black
		// 6등 메달의 색은 Black 입니다.
		
		
		// 랭킹을 입력해주세요 >>> 1
		// 메달 색상 : Gold
		// 1등 메달의 색은 Gold 입니다.
		
//	    System.out.println("--------------- switch문 예제 02 ---------------");
//        int ranking = 6;
//		char medalColor;
//		switch(ranking)
//		{
//		case 1:
//			medalColor = 'G';
//			System.out.println("메달색상 : G");
//			break;
//		case 2:
//			medalColor = 'S';
//			System.out.println("메달색상 : S");
//			break;
//		case 3:
//			medalColor = 'B';
//			System.out.println("메달색상 : B");
//			break;
//		default:
//			medalColor = 'C';
//			System.out.println("메달색상 : C");
//		}
//		System.out.println(ranking + " 등 메달의 색은 "+medalColor + " 입니다.");
		
		
		// 02 break가 필요한 이유
//        System.out.println("--------------- switch - break 필요 이유 ---------------");
//        System.out.print("정수 한개를 입력해주세요 >>> ");
//        int num1 = scanner.nextInt();
//
//        switch (num1) {
//            case 1:
//                System.out.println("1 입력입니다.");
//                // break; // 주석 처리된 부분을 주석 해제하면 원하는 결과를 얻을 수 있습니다.
//            case 2:
//                System.out.println("2 입력입니다.");
//                // break;
//            case 3:
//                System.out.println("3 입력입니다.");
//                // break;
//            default:
//                System.out.println("나머지 경우의 수 입력입니다.");
//                break;
//        }
//
//        System.out.println("Switch문을 종료합니다.");
//        scanner.close();
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				

	}

}
