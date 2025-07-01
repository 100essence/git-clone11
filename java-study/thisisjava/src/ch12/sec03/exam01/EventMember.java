package ch12.sec03.exam01;

public class EventMember extends Member {
	private String gender;
	
	public EventMember() {
		super();
	}
	public EventMember(String id) {
		super(id);
	}
	public EventMember(String name, String gender) {
		super(name);
		this.gender = gender;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof EventMember em) {
			if(super.name.equals(em.name)  
				&& this.gender.equals(em.gender)) {
				return true;
			}
		}
		
		return false;
	}
}
