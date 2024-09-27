package produttore_consumatore;

public class produttore implements Runnable{
	buffer buffer;
	int pari,dispari;
	
	public produttore(buffer buffer) {
		this.buffer = buffer;
		pari = 0;
		dispari = 0;
	}
	
	public void run() {
		while (true) {
			int n = (int) (Math.random() * (1023));
			if(n % 2 == 0) {
				pari++;
			}else {
				dispari++;
			}
			System.out.println("pari: " + pari);
			System.out.println("dispari: " + dispari);
			buffer.push(n);
			try {
				Thread.sleep((int) (Math.random() * (1000 - 100 ) + 100));
			} catch (Exception e) {}
		}
	}

}
