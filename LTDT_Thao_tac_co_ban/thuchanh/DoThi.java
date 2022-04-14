package thuchanh;

public abstract class DoThi {
	protected int[][] arr;
	protected int n;
	public DoThi(int n) {
		this.arr = new int[n][n];
	}
	
	public abstract void add(int u, int v);
	public abstract void remov(int u, int v);
	
}
