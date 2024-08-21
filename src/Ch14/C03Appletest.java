package Ch14;


class Seller01 {
	int mymoney;		// 보유금액
	int applecnt;		// 사과 재고량
	int appleprice;		// 사과 가격
	
	
	public Seller01(int mymoney, int applecnt, int appleprice) {
		super();
		this.mymoney = mymoney;
		this.applecnt = applecnt;
		this.appleprice = appleprice;
	}
	
	
	// 돈을 건내받는 메서드
	public int method01(int amount) {
		// 보유금액에 amount를 더해줘야함.
		mymoney += amount;
		
		// amount가격으로 사과를 몇개 살 수 있는지 COUNT
		int count = amount / appleprice;
		
		
		// 사과 재고량에서 count를 빼줘야함.
		applecnt -= count;
		
		// 손님한테 사과 돌려주기
		return count;
		
		
	}
	
	
	
	
}

class Buyer01 {
	int mymoney;		// 보유금액
	int myapplecnt;		// 내가 가지고 있는 사과개수
	
	
	public Buyer01(int mymoney, int myapplecnt) {
		super();
		this.mymoney = mymoney;
		this.myapplecnt = myapplecnt;
	}
	
	public void pay(Seller01 seller, int amount) {
		// 내 보유금액에서 살만큼의 돈을 차감
		mymoney -= amount;
		
		// 돈을 고양이장수에게 전달(돈을 전달해서 돈에 맞는 콜라 개수를 고양이 장수가 COUNT해서 나한테 돌려줘야 함)
		int count = seller.method01(amount);
		
		// 내가 가지고 있는 사과 개수에 더해줌.
		myapplecnt += count;
		
	}
	
}

public class C03Appletest {
	public static void main(String[] args) {
		Seller01 cat = new Seller01(10000, 100, 1000); // 보유금액, 사과재고량, 사과가격
		Buyer01 gom = new Buyer01(5000, 0); // 보유금액, 사과보유개수
		
		gom.pay(cat, 2000);
		
		System.out.println(cat);	// 보유금액, 사과재고량, 사과가격 출력
		System.out.println(gom);	// 보유금액, 사과보유개수 출력
	}
}
