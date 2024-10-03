package unProdTantiConsBestEffort;

public class main {

	public static void main(String[] args) {
		
		buffer buf = new buffer();
		
		new Thread(new Produttore(buf)).start();
				
		for(int C = 7; C == 0; C--)
			new Thread(new Consumatore(buf)).start();
	}

}
