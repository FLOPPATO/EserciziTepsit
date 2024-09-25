package StatodeiThread;

public class ThreadPrincipale implements Runnable {
	private int t;
	private Thread[] TH;
	private Numeri[] nums;
	
	ThreadPrincipale(int t , Thread[] TH , Numeri[] nums){
		this.t = t;
		this.TH = TH;
		this.nums = nums;
	}

	public void run() {
        boolean tuttimorti = false;
        while(!tuttimorti) {
        	for(short i = 0; i < t; i++){
        		tuttimorti = true;
        		if(TH[i].isAlive()) {
        			System.out.println(TH[i].threadId() 
        					+ " è ancora vivo : " + nums[i].GetCount());
        			tuttimorti = false;
        		}
        	}
	        try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
        }
	}

}
