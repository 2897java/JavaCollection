package ARRAYDEMO;

import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Iterator;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> hs =new LinkedHashSet<>();
		hs.add("");
		hs.add("AMGOI");
		hs.add("Name");
		hs.add("RANI");
		hs.add("Institute name");
		
		Iterator<String> itr=hs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());  //one by one attached to 
		}

	}

}
