package inpizzeria;

import java.util.LinkedList;
import java.util.Queue;

public class buffer {
    private Queue<ordine> queue = new LinkedList<>();
    
    public synchronized void push(ordine ordine) {
        queue.add(ordine);
        notify();
    }
    
    public synchronized int getsize() { return queue.size(); }
    
    public synchronized ordine pop() {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        notify();
        return queue.poll();
    }
    
    public synchronized ordine popiD(int tableID) {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        
        
        for (ordine o : queue)
            if (o.getTable() == tableID) {
                queue.remove(o); //il riferimento ad o in queque rimane cmq (linked list)
                notify();
                return o;
            }
            
        notify();
        return null;
    }
    
    
}
