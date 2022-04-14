package dothi;


public class UndirectedGrapMatrix extends ADoThiMatrix {

	public UndirectedGrapMatrix(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}
	public String printMatrix() {
		String result ="";
		for(int i =0; i < matrix.length; i++) {
			for(int j = 0; j<matrix.length; j++) {
				result += matrix[i][j] + " ";
			}
			result += "\n";
		}
		return result;
	}
	
	// them cap dinh 
	@Override
	public void addEdge(int u, int v) {
		if(v==0) {
			for(int i=0;i<matrix.length;i++) {
				this.matrix[u-1][i]=0;
				this.matrix[i][u-1]=0;
			}
		}else {
			this.matrix[u-1][v-1] ++;
			this.matrix[v-1][u-1] ++;
		}
			
	}
	//xoa cap dinh
	@Override
	public void removeEdge(int u, int v) {
		// TODO Auto-generated method stub
			this.matrix[u-1][v-1] --;
			this.matrix[v-1][u-1] --;
	}
	// tinh so canh do thi
	@Override
	public int numEdge() {
		// TODO Auto-generated method stub
		int result=0;
		for(int i = 0; i< matrix.length;i++) {
			result += this.numTopStep(i);
		}
		return result/2;
	}
	// tinh so bac cua 1 dinh
	@Override
	public int numTopStep(int v) {
		// TODO Auto-generated method stub
		int result=0;
		for(int i = 0; i < matrix.length; i++) {
			result += matrix[v-1][i];
		}
		return result;
	}
	// in so bac cua cac dinh trong do thi
	@Override
	public String sumNumStep() {
		// TODO Auto-generated method stub
		String result ="";
		for(int i = 0; i< matrix.length;i++) {
			result += "Dinh "+i+"co bac: "+this.numTopStep(i);
		}
		return result;
	}
	// kiem tra do thi co lien thong khong
	@Override
	public boolean connectiviti() {
		// TODO Auto-generated method stub
		boolean result = false;
		for(int i=0; i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				if(i==j) {
					continue;
				}else {
					result= connecEdge(i+1, j+1);
				}
			}
			if(result == false) {
				break;
			}
		}
		return result;
	}
	// kiem tra 2 dinh co duong di den  nhau khong
	@Override
	public boolean connecEdge(int u, int v) {
		// TODO Auto-generated method stub
		boolean result=false;
		if(matrix[u-1][v-1]==1) {
			return true;
		}else {
			for(int i=0; i< matrix.length;i++) {
				for(int j=0; j< matrix.length;j++) {
					if(i==(u-1) && j==(v-1)) {
						continue;
					}
					if(matrix[i][j]==1) {
						if(matrix[j][v-1]==1) {
							result = true;
							break;
						}
					}
				}
			}
		}
		return result;
	}
}
