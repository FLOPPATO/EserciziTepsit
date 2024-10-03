package unProdTantiConsBestEffort;

public class Produttore implements Runnable {
	
	buffer buffer;
	
	Produttore(buffer buf){
		buffer = buf;
	}
	
	
	public void run(){
		while(true) {
			int r = (int) ((Math.random() * 2047) - 1024);
			buffer.push(r);
		}
	}
}
