package StatodeiThread;

public class Numeri {
	private int n,x,counter;
	
	Numeri(int n){
		this.n = n;
		x = (int) (Math.random() * n);
	}
	
	public int getN() {
		return n;
	}
	
	public int getX() {
		return x;
	}
	
	public int incCount() {
		counter = counter+1;
		return counter;
	}
	
	public int GetCount() {
		return counter;
	}
}
