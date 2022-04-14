package dothi;

import java.util.HashMap;
import java.util.List;

public class TestAdj {
	public static void main(String[] args) {
		HashMap<String, List<String>> arr = new HashMap<String, List<String>>();
		
		//test do thi vo huong
		
		UndirectedGrapAdj un = new UndirectedGrapAdj(arr);
		un.addEdge("a", "b");
		un.addEdge("a", "c");
		un.addEdge("b", "c");
		un.addEdge("c", "d");
		un.removeEdge("a", "c");
		System.out.println(un.printAdj());
		
		//test do thi co huong
		
//		DirectedGrapAdj dir = new DirectedGrapAdj(arr);
//		dir.addEdge("a", "b");
//		dir.addEdge("a", "c");
//		dir.addEdge("b", "c");
//		dir.addEdge("c", "d");
//		dir.removeEdge("a", "c");
//		System.out.println(dir.printAdj());
	}
}
