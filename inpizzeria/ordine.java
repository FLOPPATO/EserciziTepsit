package inpizzeria;

public class ordine {
	private int TavoloProvenienza;
	private String[] TipoPizza;
	
	ordine(int TavoloProvenienza, String[] TipoPizza){
		this.TavoloProvenienza = TavoloProvenienza;
		this.TipoPizza = TipoPizza;
	}
	
	public int getTable() { return TavoloProvenienza; }
	
	public String[] getType() { return TipoPizza; }
	

}
