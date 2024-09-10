package Ch25;

class Plastic01 {
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력");
	}
}

class Powder01 {
	public void doPrinting() {
		System.out.println("Powder01 재료로 출력");
	}
}

class ThreeDPrinter01<T> {
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
}

public class C03Generic {
	public static void main(String[] args) {
		// 3D프린트의 제네릭 타입을 Powder로 지정
	// 3D프린트<Powder> 객체 생성

	ThreeDPrinter01<Powder01> print1 = new ThreeDPrinter01<Powder01>();
	// Powder 객체 생성 후 주소를 3D프린트객체로 전달
	print1.setMaterial(new Powder01());

	// 3D프린트의 get함수로 material을 꺼내 doPrinting()
	print1.getMaterial().doPrinting();
	
	
	ThreeDPrinter01<Plastic01> print2 = new ThreeDPrinter01<Plastic01>();
	print2.setMaterial(new Plastic01());
	print2.getMaterial().doPrinting();
	}
	
}
