package Teatro;

public class spettatore implements Runnable{
	teatro Teatro;
	String nome;
	
	spettatore(teatro Teatro, String nome){
		this.Teatro = Teatro;
		this.nome = nome;
	}
	
	public void run() {
		Teatro.prendiposto(nome);
	}
	

}
