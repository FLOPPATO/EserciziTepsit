package unProdTantiConsVarianteMulticast;

public class Produttore implements Runnable {
	
	buffer buffer;
	
	Produttore(buffer buf){
		buffer = buf;
	}
	
	
	public void run(){
		while(true) {
			int r = (int) ((Math.random() * 2047) - 1024);
			
			try {
				Thread.sleep(r>0?r/100*50:200);
			} catch (InterruptedException _) {}
			
			buffer.push(r);
		}
	}
}
