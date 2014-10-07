package dsa.grupo1.Tema3.ClasesEsenciales2.Ej10;

;

public class Prueba2 {
	
	public static void main(String args[])
	{
		Prueba contador1 = new Prueba("ID1", 4);
		Prueba contador2 = new Prueba("ID2", 7);
		Prueba contador3 = new Prueba("ID3", 8);
	// el metodo run es propio de java y el start usa el metodo run 
	contador1.start();
	contador2.start();
	contador3.start();
	}
	
	

}
