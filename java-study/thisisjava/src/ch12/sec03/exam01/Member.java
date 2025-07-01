package ch12.sec03.exam01;

public class Member extends Object {
	public String id; // 회원ID
	public String name; // 회원이름
	
	public Member() {
		
	}
	public Member(String id) {
		this.id = id;
	}
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/**
	 * equals메소드를 Member에서 다시 재정의
	 * 여기서는 회원ID가 같으면 같은 회원이라고 정의함
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member target) {
			if(id.equals(target.id)) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return Integer.parseInt(id);
	}
}
