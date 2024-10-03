package unProdTantiConsVarianteMulticast;

import java.util.LinkedList;
import java.util.Queue;

public class buffer {
	int C;
	Queue<Integer>[] multicast;
	
	
	buffer(int C){
		 this.C = C;
		 multicast = new LinkedList[C];
	}
	
	public void push(int val) {
		for(Queue<Integer> i : multicast)
			i.add(val);
	}
	
	
	public synchronized int pop(int iD) {
		
		
		/* controllo lista vuota list.isempty() nn va
		 * 						 catch(NoSuchElementException) not found
		 */ 7
		
		return multicast[iD].remove();
		
	}
	
}
