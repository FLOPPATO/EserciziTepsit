package Teatro;

public class teatro {
    private boolean[][] posti;
    private int file;
    private int postiPerFila;
    
    public teatro(int file, int postiPerFila) {
        this.file = file;
        this.postiPerFila = postiPerFila;
        posti = new boolean[file][postiPerFila];
        for (int i = 0; i < file; i++)
            for (int j = 0; j < postiPerFila; j++)
            	posti[i][j] = true;
    }
    
    public int postiavanzati() {
        int postiavanzati = 0;
        for (int i = 0; i < file; i++)
            for (int j = 0; j < postiPerFila; j++)
                if (posti[i][j])
                	postiavanzati++;
        return postiavanzati;
    }
    
    public synchronized void prendiposto(String nome) {
        int filacentro = file / 2;
        int postocentro = postiPerFila / 2;
        for (int jmp = 0; jmp <= Math.max(filacentro, postocentro); jmp++)
            for (int i = Math.max(0, filacentro - jmp); i <= Math.min(file - 1, filacentro + jmp); i++)
                for (int j = Math.max(0, postocentro - jmp); j <= Math.min(postiPerFila - 1, postocentro + jmp); j++)
                    if (posti[i][j]) {
                    	posti[i][j] = false;
                        System.out.println(nome + " ha prenotato il posto: Fila " + (i + 1) + ", Posto " + (j + 1));
                        return;
                    }
    }
    
    public void mappaPosti() {
        for (int i = 0; i < file; i++) {
            for (int j = 0; j < postiPerFila; j++) {
                if (posti[i][j])
                    System.out.print("O ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }
	}
}
