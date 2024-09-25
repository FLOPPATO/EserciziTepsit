package StatodeiThread;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("n:");
        int n = scan.nextInt();
        
        System.out.println("t:");
        int t = scan.nextInt();
        
        scan.close();
        
        Thread[] TH = new Thread[t];
        
        Numeri[] nums = new Numeri[t];
        
        for(short i = 0; i < t; i++){
        	nums[i] = new Numeri(n);
        	Threads obj = new Threads(nums[i]);
        	TH[i] = new Thread(obj);
        }
        
        
        for(short i = 0; i < t; i++)
        	TH[i].start();
        
        ThreadPrincipale obj = new ThreadPrincipale(t,TH,nums);
        Thread MainThread = new Thread(obj);
        MainThread.start();
     	try {
			for(short i = 0; i < t; i++)
				TH[i].join();
			MainThread.interrupt();
		} catch (InterruptedException e) {}
        

        System.out.println("TUTTI I THREAD COMPLETATI");
    }

}
