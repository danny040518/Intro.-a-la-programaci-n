package SegundoCorte;
import java.util.Scanner;  
public class Punto5 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);  
		System.out.println("Ingrese una palabra para saber cuantas letras tiene");  
		String palabra = keyboard.nextLine();  
        int numletras = palabra.length();
        System.out.println("La palabra tiene: " +numletras+" letras");
    }
	}