package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		
		
		HashSet<Integer> hSet = new HashSet<> ();
		
		hSet.add(10);
		hSet.add(20);
		hSet.add(10);
		hSet.add(30);
		
		
	//	hSet.remove(10);
	
		/*	for(Integer sayi : hSet) {
			System.out.println(sayi);
		}
		*/
		
	
		//	System.out.println(hSet.size());
		
		
		Iterator <Integer> itr = hSet.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
