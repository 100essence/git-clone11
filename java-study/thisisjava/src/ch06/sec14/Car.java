package ch06.sec14;

public class Car {
	private int speed;
	private boolean stop;
	
	// setter 메소드
	public void setSpeed(int speed) {
//		if(speed < 0)
//			return;
//		this.speed = speed;
		
		if(speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;	
		}
	}
	// getter 메소드
	public int getSpeed() {
		if (speed < 0)
			return 0;
		
		return speed;
	}
	
	// getter 메소드
	public boolean getStop() {
		return stop;
	}
	// setter 메소드
	public void setStop(boolean stop) {
		this.stop = stop;
		if (stop == true) this.speed = 0;
	}	
}
