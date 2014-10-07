package dsa.grupo1.Tema3.ClasesEsenciales2.Ej11;



public class Ej11dos {

	public static void main(String args[])
	{
		Ej11 contador1 = new Ej11("ID1", 4);
		Ej11 contador2 = new Ej11("ID2", 7);
		Ej11 contador3 = new Ej11("ID3", 8);
	// el metodo run es propio de java y el start usa el metodo run 
	contador1.start();
	contador2.start();
	contador3.start();
	}
	
	
}
