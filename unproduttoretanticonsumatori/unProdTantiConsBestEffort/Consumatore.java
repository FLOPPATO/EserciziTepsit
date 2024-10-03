package unProdTantiConsBestEffort;

public class Consumatore implements Runnable {
	
	buffer buffer;
	int n, index, negnum;
	int[] posnumbers;
	
	Consumatore(buffer buf){
		posnumbers = new int[]{0,0,0,0,0};
		buffer = buf;
		index = negnum = 0;
	}
	
	public void run(){
		while(true) {
			
			n = buffer.pop();
			
			if (n<=0) negnum++;
			
			else posnumbers[index++ % 5] = n;
			
			int sum = 0;
			for(int i : posnumbers)
				sum += posnumbers[i];
			
			System.out.println("numeri negativi : " + negnum); 
			System.out.println("media ultimi 5 numeri positivi : " + sum/5);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException _) {}
			
		}
	}
}
