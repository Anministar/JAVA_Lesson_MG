package Ch15;

class Customer {
	// 속성
	int myMoney;		// 보유금액
	int colaCnt;		// 콜라보유개수
	
	
	// 기능
	
	// 구매하기(콜라)
	void pay(Store store, int amount) {
		// 1. 내 보유금액에서 money 차감
		myMoney -= amount;
		// 2. 지정된 store에 money 전달
		int cnt = store.returnCola(amount);
		// 3. 콜라개수를 누적
		colaCnt += cnt;
		
		
	}

	public Customer(int myMoney, int colaCnt) {
		super();
		this.myMoney = myMoney;
		this.colaCnt = colaCnt;
	}

	@Override
	public String toString() { // 멤버변수에 대한 정보를 출력시켜주는 메서드
		return "Customer [myMoney=" + myMoney + ", colaCnt=" + colaCnt + "]";
	}
	
	
	
	
}

class Store {
	// 속성
	int savedMoney;			// 보유금액
	int colaCnt;			// 콜라 재고량
	int price;				// 콜라 가격
	
	// 기능
	int returnCola(int amount) {
		// 1. 보유금액에서 받은 금액 추가
		savedMoney += amount;
		// 2. 받은 금액만큼 콜라재고량을 감소
		int cnt = amount / price;
		// 3. 콜라 재고량에서 판매한 콜라 개수량을 빼준다
		colaCnt -= cnt;
		
		// 4. 콜라 개수 리턴
		return cnt;
	}

	public Store(int savedMoney, int colaCnt, int price) {
		super();
		this.savedMoney = savedMoney;
		this.colaCnt = colaCnt;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Store [savedMoney=" + savedMoney + ", colaCnt=" + colaCnt + ", price=" + price + "]";
	}
	
	
	
	
}



public class C02StoreMain {
	public static void main(String[] args) {
		// 고객 객체
		Customer mingu  = new Customer(100000000, 10);		// 보유금액, 콜라개수
		Customer gom = new Customer(10000, 0);
		
		
		
		// 편의점 객체
		Store GS = new Store(500000, 100, 500); // 보유금액, 콜라재고량, 콜라가격
		Store CU = new Store(100000, 50, 1000);
		
		
		// 구매하기
		mingu.pay(GS, 10000);
		gom.pay(CU, 8000);
		
		
		// 확인
		
		System.out.println("---------------------- 고객 정보 확인 ---------------------------");
		System.out.println(mingu);
		System.out.println(gom);
		System.out.println("----------------------- 편의점 정보 확인 ----------------------------");
		System.out.println(GS);
		System.out.println(CU);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
