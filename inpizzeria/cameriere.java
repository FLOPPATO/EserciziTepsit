package inpizzeria;

public class cameriere implements Runnable {
	private buffer ordini, cucina, pizzecotte, pizzepronte;
    
    public cameriere(buffer ordini, buffer cucina, buffer pizzecotte, buffer pizzepronte) {
        this.ordini = ordini;
        this.cucina = cucina;
        this.pizzecotte = pizzecotte;
        this.pizzepronte = pizzepronte;
    }
    
    public void run() {
        while (true) {
            if ((int) Math.random() == 1 || pizzecotte.getsize() == 0) {
                ordine ordine = ordini.pop();
                System.out.println("prendo l'ordine da tavolo" + ordine.getTable());
                cucina.push(ordine);
            } else {
                ordine pizza = pizzecotte.pop();
                System.out.println("porto l'ordine a tavolo" + pizza.getTable());
                pizzepronte.push(pizza);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
