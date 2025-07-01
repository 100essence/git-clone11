package ch13.sec02;

public class Product<K, M, C> {
	private K kind;
	private M model;
	private C color;
	
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
}
