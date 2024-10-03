package unProdTantiConsVarianteMulticast;

public class Consumatore implements Runnable {
	
	buffer buffer;
	int n, index, negnum, iD;
	int[] posnumbers;;
	
	Consumatore(buffer buf,int iD){
		posnumbers = new int[]{0,0,0,0,0};
		buffer = buf;
		index = negnum = 0;
		this.iD = iD;
	}
	
	public void run(){
		while(true) {
			
			n = buffer.pop(iD);
			
			if (n<=0) negnum++;
			
			else posnumbers[index++ % 5] = n;
			//0 % 5 0
			//1 % 5 1
			//2 % 5 2
			//3 % 5	3
			//4 % 5 4
			//5 % 5 0
			// [ n . n . n . n . n ]
			
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
