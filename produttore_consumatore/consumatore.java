package produttore_consumatore;

public class consumatore implements Runnable {
	buffer buffer;
	
	public consumatore(buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		while (true) {
			int n = (int) (Math.random() * (1023));
			buffer.push(n);
			try {
				Thread.sleep((int) (Math.random() * (1000 - 100 ) + 100));
			} catch (Exception e) {}
		}
		
	}
}
