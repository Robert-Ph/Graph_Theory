package dothi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DirectedGrapAdj extends ADoThiAdj {

	public DirectedGrapAdj(Map<String, List<String>> listAdj) {
		super(listAdj);
		// TODO Auto-generated constructor stub
	}
	public String printAdj() {
		String result="";
		Set<String> key = listAdj.keySet();
		for(String i: key) {
			result += i + ": " + listAdj.get(i)+"\n";
		}
		return result;
	}
	@Override
	public void addEdge(String u, String v) {
		// TODO Auto-generated method stub
				if(listAdj.containsKey(u)) {
					listAdj.get(u).add(v);
				}
				else {
					ArrayList<String> arrList6 = new ArrayList<String>();
					arrList6.add(v);
					listAdj.put(u, arrList6);
				}
	}

	@Override
	public void removeEdge(String u, String v) {
		// TODO Auto-generated method stub
		listAdj.get(u).remove(v);
	}

	@Override
	public int numEdge() {
		// TODO Auto-generated method stub
		int numEdge=0;
		Set<String> keySet = listAdj.keySet();
		for(String key: keySet) {
			numEdge += listAdj.get(key).size();
		}
		return numEdge;
	}

	@Override
	public int numTopStep(String u) {
		// TODO Auto-generated method stub
		return listAdj.get(u).size();
	}

	@Override
	public String sumNumStep() {
		// TODO Auto-generated method stub
		String result ="";
		Set<String> keySet = listAdj.keySet();
		for(String key: keySet) {
			result += key+" : "+listAdj.get(key).size();
		}
		return result;
	}

	@Override
	public boolean connectiviti() {
		// TODO Auto-generated method stub
		return false;
	}

}
