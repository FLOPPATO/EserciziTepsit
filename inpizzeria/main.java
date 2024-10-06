package inpizzeria;

public class main {

	public static void main(String[] args) {
		buffer ordini = new buffer();
		buffer cucina = new buffer();
		buffer pizzecotte = new buffer();
		buffer pizzepronte = new buffer();
		
        for (int i = 0; i < 3; i++)
            new Thread(new cameriere(ordini, cucina, pizzecotte, pizzepronte)).start();
        
        new Thread(new pizzaiolo(cucina, pizzecotte)).start();
        
		for(int i = 0; i < 2; i++)
			new Thread(new tavolo(ordini,pizzepronte,i)).start();
		

	}

}
