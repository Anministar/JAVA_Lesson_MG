package Ch15;


//class Buyer {
//	int myMoney;
//	int appleCnt;
//	
//	
//	//toString 재정의
//	
//	
//	@Override
//	public String toString() {
//		return "Buyer [myMoney=" + myMoney + ", appleCnt=" + appleCnt + "]";
//	}
//	
//	
//	//생성자 코드 삽입
//	public Buyer1(int myMoney, int appleCnt) {
//		super();
//		this.myMoney = myMoney;
//		this.appleCnt = appleCnt;
//	}
//	
//	
//	
//	
//	void pay(Seller seller, int money ) {
//		//보유금액에 금액 차감
//		myMoney -= money;
//		//seller에 money전달 사과 개수 리턴받음
//		int cnt = seller.returnApple(money);
//		//내 사과개수에 누적
//	}
//
//
//	
//
//
//	
//	
//}
//
//class Seller {
//	int myMoney;
//	int appleCnt;
//	int price;
//	//toString 재정의
//	
//	
//	@Override
//	public String toString() {
//		return "Seller [myMoney=" + myMoney + ", appleCnt=" + appleCnt + ", price=" + price + "]";
//	}
//	
//	
//	//생성자 코드 삽입
//	
//	public Seller(int myMoney, int appleCnt, int price) {
//		super();
//		this.myMoney = myMoney;
//		this.appleCnt = appleCnt;
//		this.price = price;
//	}
//	
//	
//	int returnApple(int money) {
//		//보유금액에 금액 누적
//		myMoney -= money;
//		//사과개수 계산 후 보유개수에서 차감
//		int cnt = money / price;
//		appleCnt -= cnt;
//		//사과개수 리턴
//		return cnt;
//	}
//
//	
//}


public class C03AppleMain {
	public static void main(String[] args) {
//		Seller cat = new Seller(10000, 100, 1000); // 보유금액, 사과재고량, 사과가격
//		Buyer gom = new Buyer(5000, 0); // 보유금액, 사과보유개수
//		
//		gom.pay(cat, 2000);
//		
//		System.out.println(cat);	// 보유금액, 사과재고량, 사과가격 출력
//		System.out.println(gom);	// 보유금액, 사과보유개수 출력
	}

}
