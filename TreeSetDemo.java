package ARRAYDEMO;

import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;


public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet<String> Ts =new TreeSet<>();
		Ts.add("");
		Ts.add("AMGOI");
		Ts.add("Name");
		Ts.add("RANI");
		Ts.add("Institute name");
		Ts.add("Zebra");
		Ts.add("Banana");
		Ts.add("Apple");
		
		Iterator<String> itr=Ts.iterator(); //tree can be run at Descending (alphabetically) order thats why called as Treeset
		
		while(itr.hasNext()) {
			System.out.println(itr.next()); 

	}

}
}
