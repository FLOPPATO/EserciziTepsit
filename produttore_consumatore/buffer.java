package produttore_consumatore;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class buffer implements Runnable{
	int elementi,max;
	boolean FIFO;
	Stack<Integer> stack;
	Queue<Integer> Queque;
	public buffer(int n, boolean FIFO) {
		this.FIFO = FIFO;
		if(FIFO)
			Queque = new LinkedList<>();
		else
			stack = new Stack<>();
		
		
		elementi = 0;
		max = n;
	}
	
	
	synchronized void push(int valore) {
		
		while (elementi < max) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		if(FIFO)
			Queque.add(valore);
		else
			stack.push(valore);
		elementi++;
		notify();
	}
	
	synchronized int pop() {
		while (elementi > 0) {	
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		elementi--;
		notify();
		if(FIFO)
			return Queque.remove();
		else
			return stack.pop();
	}

	public void run() {
	}
}