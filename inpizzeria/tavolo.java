package inpizzeria;

public class tavolo implements Runnable {
	private buffer ordini,pizzepronte;
	private int iD;
	
	public tavolo(buffer ordini,buffer pizzepronte,int iD) {
		this.ordini = ordini;
		this.pizzepronte = pizzepronte;
		this.iD = iD;
	}
	
	public void run() {
		int NumPPL = (int) (Math.random() * 5 + 1);
		String[] tipiPizze = new String[NumPPL];
		
		for (int i = 0; i < NumPPL; i++)
            tipiPizze[i] = "margherita";
		
		ordine ordine = new ordine(iD,tipiPizze);
		System.out.println(/*i + " al tavolo " +*/ "tavolo " + iD + " ha ordinato");
		ordini.push(ordine);
		
		for(int i = 0; i < NumPPL; i++) {
			pizzepronte.popiD(iD);
			System.out.println("tavolo " + iD + " ha ricveuto");
		}
	}
	
	
}
