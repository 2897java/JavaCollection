package ARRAYDEMO;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs =new HashSet<>();
		hs.add("AMGOI");
		hs.add("Name");
		hs.add("RANI");
		hs.add("Institute name");
		
		Iterator<String> itr=hs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
