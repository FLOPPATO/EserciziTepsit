package Multistanza;

public class Gestore {

	public static void main(String[] args) {
		Lista listaDisco = new Lista(4);
		Discoteca disco = new Discoteca(listaDisco);
		
		long delta = System.currentTimeMillis();
		
		while(true) {
			long currentTime = System.currentTimeMillis();
			if(currentTime - delta >= 500) {
				delta = System.currentTimeMillis();
				disco.getPersone();
			}
			if(currentTime - delta >= 100)
				disco.entra(new Gruppo(10, listaDisco));
		}
	}

}