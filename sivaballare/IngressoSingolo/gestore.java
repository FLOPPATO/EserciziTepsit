package IngressoSingolo;

public class gestore {

	public static void main(String[] args) {
		lista listaDisco = new lista();
		discoteca disco = new discoteca(listaDisco);
		
		long delta = System.currentTimeMillis();
		
		while(true) {
			long currentTime = System.currentTimeMillis();
			if(currentTime - delta >= 1000) {
				delta = System.currentTimeMillis();
				System.out.println(disco.getPersone());
			}
			
			disco.entra(new Persona(listaDisco));
			
		}
	}

}
