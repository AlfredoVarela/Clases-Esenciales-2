package dsa.grupo1.Tema3.ClasesEsenciales2.Ej10;

public class Prueba extends Thread{

	private String id;
	private int tiempo;
	private static String Ultima;
	
	 
	Prueba(String id, int tiempo){
	
		this.id = id;
		this.tiempo=tiempo;
	
	}
	
public void run() {
	
	 while (tiempo >= 0) {
		 	this.Ultima = id;
			System.out.println(id + " - " + tiempo + " - Ultima escritura de " + this.Ultima + " hay " + Thread.activeCount() + " trheads activos" ) ;
			
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
