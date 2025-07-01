package ch06.exercise;

public class ShopService {
	private static ShopService singleton = new ShopService();
	
	// 외부에서 new 객체를 호출할 수 없도록 막기
	private ShopService() {}
	
	public static ShopService getInstance() {
		return singleton;
	}
}
