package unProdTantiConsVarianteMulticast;

public class main {

	public static void main(String[] args) {
		
		int C = 7;
		
		buffer buf = new buffer(C);
		
		new Thread(new Produttore(buf)).start();
				
		for(int i = 0; i < C; i++)
			new Thread(new Consumatore(buf,i)).start();
	}

}
