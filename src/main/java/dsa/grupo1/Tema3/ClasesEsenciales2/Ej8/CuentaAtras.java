package dsa.grupo1.Tema3.ClasesEsenciales2.Ej8;

public class CuentaAtras extends Thread {

		private String id;
		private int tiempo;
	
	CuentaAtras(String id, int tiempo){
		
		this.id = id;
		this.tiempo=tiempo;
		
	}
	
	public void cuenta() {
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
