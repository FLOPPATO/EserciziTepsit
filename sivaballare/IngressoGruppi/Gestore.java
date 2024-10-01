package IngressoGruppi;

public class Gestore {

	public static void main(String[] args) {
		Lista listaDisco = new Lista();
		Discoteca disco = new Discoteca(listaDisco);
		
		long delta = System.currentTimeMillis();
		
		while(true) {
			long currentTime = System.currentTimeMillis();
			if(currentTime - delta >= 1000) {
				delta = System.currentTimeMillis();
				System.out.println(disco.getPersone());
			}
			
			disco.entra(new Gruppo(10, listaDisco));
			
		}
	}
}
