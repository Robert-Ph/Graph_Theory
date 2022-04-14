package dothi;

public class TestMatrix {
	public static void main(String[] args) {
		int n=6;
		//test do thi co huong
		DirectedGrapMatrix dir = new DirectedGrapMatrix(n);
		dir.addEdge(1, 2);
		dir.addEdge(1, 3);
		dir.addEdge(2, 3);
		dir.addEdge(2, 4);
		dir.addEdge(4, 5);
		dir.addEdge(6, 0);
		
		System.out.println(dir.printMatrix());
		System.out.println(dir.connecEdge(3, 6));
		System.out.println(dir.connectiviti());
		
		// test do thi vo huong
//		UndirectedGrapMatrix un = new UndirectedGrapMatrix(n);
//		un.addEdge(1, 2);
//		un.addEdge(1, 3);
//		un.addEdge(2, 3);
//		un.addEdge(2, 4);
//		un.addEdge(4, 5);
//		un.addEdge(6, 0);
//		
//		System.out.println(un.printMatrix());
//		System.out.println(un.connecEdge(3, 6));
//		System.out.println(un.connectiviti());
	}
}
