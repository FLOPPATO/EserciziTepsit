package Teatro;

public class main {

	public static void main(String[] args) {
		teatro Teatro = new teatro(15,46);
		
        Thread[] spettatori = new Thread[7]; // numero spect.
        for (int i = 0; i < spettatori.length; i++) {
            spettatori[i] = new Thread(new spettatore(Teatro, "Spettatore " + (i + 1)));
        }
        
        for (Thread spettatore : spettatori) { // foreach
            spettatore.start();
        }
        
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {}
        System.out.println("Lo spettacolo sta per iniziare");
        
        for (Thread spettatore : spettatori) {
            try {
				spettatore.join();
			} catch (InterruptedException e) {}
        }
        
        Teatro.mappaPosti();
        
        System.out.println("Posti disponibili: " + Teatro.postiavanzati());

	}

}
