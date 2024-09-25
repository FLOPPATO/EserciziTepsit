package StatodeiThread;

public class Threads implements Runnable {
	Numeri n;
	public Threads(Numeri n) {
		this.n = n;
	}
	
    public void run() {
    	int x = n.getX();
        while(n.incCount() != x);
    }
}
