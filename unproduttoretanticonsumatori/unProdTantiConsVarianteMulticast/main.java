package unProdTantiConsVarianteMulticast;

public class main {

	public static void main(String[] args) {
		
		int C = 7;
		
		buffer buf = new buffer(C);
		
		Thread thr[] = new Thread[C];
		
		for(int i = 0; i < C; i++) {
			
			thr[i] = new Thread(new Consumatore(buf,i));
			
			thr[i].start();
			
		}
		
		Thread tmp = new Thread(new Produttore(buf));
		
		tmp.start();

	}

}
