package ARRAYDEMO;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;


public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> vc =new Stack<>();
		vc.push("AMGOI");
		vc.push(null);
		vc.push("rani");
		
		vc.pop();
		vc.pop();
		
		Iterator<String> itr=vc.iterator();
	  while(itr.hasNext()) {
		  System.out.println(itr.next());
	  }


	}

}
