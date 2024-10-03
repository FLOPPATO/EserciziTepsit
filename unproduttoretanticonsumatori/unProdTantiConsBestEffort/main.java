package unProdTantiConsBestEffort;

public class main {

	public static void main(String[] args) {
		
		int C = 7;
		
		buffer buf = new buffer();
		
		Thread thr[] = new Thread[C];
		
		for(Thread t : thr) {
			
			t = new Thread(new Consumatore(buf));
			
			t.start();
			
		}
		
		Thread tmp = new Thread(new Produttore(buf));
		
		tmp.start();

	}

}
