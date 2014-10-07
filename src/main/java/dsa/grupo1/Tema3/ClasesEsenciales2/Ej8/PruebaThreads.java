package dsa.grupo1.Tema3.ClasesEsenciales2.Ej8;

public class PruebaThreads 
{
public static void main(String args[])
{
CuentaAtras contador1 = new CuentaAtras("ID1", 4);
CuentaAtras contador2 = new CuentaAtras("ID2", 7);
CuentaAtras contador3 = new CuentaAtras("ID3", 8);

contador1.cuenta();
contador2.cuenta();
contador3.cuenta();
}
}
