package thuchanh;

public class VoHuong extends DoThi {

	public VoHuong(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(int u, int v) {
		// TODO Auto-generated method stub
		this.arr[u][v] = 1;
		this.arr[v][u] = 1;
	}

	@Override
	public void remov(int u, int v) {
		// TODO Auto-generated method stub
		this.arr[u][v] = 0;
		this.arr[v][u] = 0;
	}

}
