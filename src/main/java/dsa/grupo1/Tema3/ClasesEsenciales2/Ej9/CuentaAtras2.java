package dsa.grupo1.Tema3.ClasesEsenciales2.Ej9;

public class CuentaAtras2 extends Thread{

	private String id;
	private int tiempo;

	CuentaAtras2(String id, int tiempo){
	
		this.id = id;
		this.tiempo=tiempo;
	
	}
	
public void run() {
	 while (tiempo >= 0) {
			System.out.println(id + " - " + tiempo);
			--tiempo;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
   }
	
	
}
