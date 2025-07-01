package ch13.exercise.problem03;

public class Container<T1, T2> {
	private T1 key;
	private T2 value;
	
	public T1 getKey() {
		return this.key;
	}
	
	public T2 getValue() {
		return this.value;
	}
	
	public void set(T1 key, T2 value) {
		this.key = key;
		this.value = value;
	}
}
