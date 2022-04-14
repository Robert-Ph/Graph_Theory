package dothi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ADoThiAdj {
	protected Map<String, List<String>> listAdj;
	public ADoThiAdj(Map<String, List<String>> listAdj) {
		super();
		this.listAdj = new HashMap<String, List<String>>();
	}
	public abstract void addEdge(String u, String v); //them cap dinh
	public abstract void removeEdge(String u, String v);//xoa cap dinh
	public abstract int numEdge();//so canh
	public abstract int numTopStep(String v);//so bac cua dinh
	public abstract String sumNumStep();// so bac tat ca cac dinh
	public abstract boolean connectiviti();// kiem tra tinh lien thong do thi
}
