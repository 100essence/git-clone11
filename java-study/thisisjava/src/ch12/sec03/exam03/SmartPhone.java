package ch12.sec03.exam03;

import java.util.Objects;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		super();
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {
		return "SmartPhone [company=" + company + ", os=" + os + "]";
		//return company + ", " + os;
	}

	@Override
	public int hashCode() {
		return Objects.hash(company, os);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SmartPhone other = (SmartPhone) obj;
		return Objects.equals(company, other.company) 
				&& Objects.equals(os, other.os);
	}
	
	
}
