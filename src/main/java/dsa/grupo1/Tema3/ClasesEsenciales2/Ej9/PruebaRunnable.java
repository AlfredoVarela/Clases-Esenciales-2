package dsa.grupo1.Tema3.ClasesEsenciales2.Ej9;


public class PruebaRunnable {
	
	public static void main(String args[])
	{
	CuentaAtras2 contador1 = new CuentaAtras2("ID1", 4);
	CuentaAtras2 contador2 = new CuentaAtras2("ID2", 7);
	CuentaAtras2 contador3 = new CuentaAtras2("ID3", 8);
	// el metodo run es propio de java y el start usa el metodo run 
	contador1.start();
	contador2.start();
	contador3.start();
	}
	
	

}
