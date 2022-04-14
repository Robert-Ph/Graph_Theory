package lab1;

public class Demo {
//	private int n;
////	private int[][] maTran = new int[n][n];
//	private int[][] l;
	
	public int[][] grap(int[][] m, int n) {
	    int[][] maTran = new int[n][n];
	    for(int i =0; i< m.length;i++) {
	    	int x= m[i][0]-1;
	    	int y = m[i][1]-1;
	    	maTran[x][y] =1;
	    	maTran[y][x] =1;
	    	
	    }
	    return maTran;
	}
	public String toString(int[][] grap) {
		String result ="";
		for(int i=0;i<grap.length;i++) {
			for(int j=0; j< grap.length;j++) {
				result += grap[i][j] +" ";
			}
			result +="\n";
		}
		return result;
	}
	public static void main(String[] args) {
		Demo demo = new Demo();
		int[][] m = {{1,2},{1,3},{1,4},{2,3},{2,4},{2,5},{3,4},{3,5},{4,5}};
		System.out.println(demo.toString(demo.grap(m, 5)));
	}
}
