package inpizzeria;

public class pizzaiolo implements Runnable {
	private buffer cucina, pizzecotte;
    
    public pizzaiolo(buffer cucina, buffer pizzecotte) {
        this.cucina = cucina;
        this.pizzecotte = pizzecotte;
    }
    
    public void run() {
        while (true) {
            ordine ordineDaCucinare = cucina.pop();
            System.out.println("cuocendo pizze per il tavolo " + ordineDaCucinare.getTable());
            String[] tipiPizze = ordineDaCucinare.getType();
            int pizzeDaCuocere = Math.min(tipiPizze.length, (int)(Math.random() * 8) + 1);
            
            for (int i = 0; i < pizzeDaCuocere; i++) {
                if (i < tipiPizze.length && cucina.getsize() > 0) {
                    String tipoPizza = tipiPizze[i];
                    try {
                        Thread.sleep(3000);
                        pizzecotte.push(new ordine(ordineDaCucinare.getTable(), new String[]{tipoPizza})); // Aggiunge la pizza cotta
                        System.out.println("pizza " + tipoPizza + " per il tavolo " + ordineDaCucinare.getTable());
                    } catch (InterruptedException _) {}
                }
            }
        }
    }
}
