package SegundoCorte;
public class Punto4 {
	public static void main(String[] args) {
		String [] strArr = new String[11];
		String separador = " "; 
		 for ( int i=1; i<=strArr.length; i += 2) {
		 System.out.print( separador + strArr[1] + i) ;
		 separador= " , " ;
		 }
	}
}
