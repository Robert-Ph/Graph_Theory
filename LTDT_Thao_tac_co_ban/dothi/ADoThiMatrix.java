package dothi;

public abstract class ADoThiMatrix {
	protected int[][] matrix;
	protected int n;
	public ADoThiMatrix(int n) {
		super();
		this.matrix = new int[n][n];
	}


	public abstract void addEdge(int u, int v); //them cap dinh
	public abstract void removeEdge(int u, int v);//xoa cap dinh
	public abstract int numEdge();//so canh
	public abstract int numTopStep(int v);//so bac cua dinh
	public abstract String sumNumStep();// so bac tat ca cac dinh
	public abstract boolean connecEdge(int u,int v);
	public abstract boolean connectiviti();// kiem tra tinh lien thong do thi
	
	
	
}
