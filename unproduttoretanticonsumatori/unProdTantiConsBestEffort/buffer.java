package unProdTantiConsBestEffort;

import java.util.LinkedList;
import java.util.Queue;

public class buffer {
	
	Queue<Integer> list;
	
	
	buffer(){
		 list = new LinkedList<>();
	}
	
	public void push(int val) {
		try {
			list.add(val);
		}catch(IllegalStateException e) {
			System.out.print("!!perso dato");
		}
	}
	
	
	public synchronized int pop() {
		
		/* controllo lista vuota list.isempty() nn va
		 * 						 catch(NoSuchElementException) not found
		 */ 7
		
		return list.remove();
		
	}
	
}
