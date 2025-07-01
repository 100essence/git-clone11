package ch07.sec02;

// Phone 부모 클래스를 상속받은 SmartPhone 자식 클래스 
public class SmartPhone extends Phone {
	public boolean wifi;
	
	public SmartPhone() {
		super();
	}
	public SmartPhone(String model, String color) {
		super(model);
		//this.model = model;  // Phone에서 상속받은 model 필드
		this.color = color;  // Phone에서 상속받은 color 필드
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경하였습니다");
	}
	public void internet() {
		System.out.println("인터넷에 연결합니다");
	}
}
