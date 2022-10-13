package TallerFor;

import java.util.Scanner;

public class SextoPunto {

	public static void main(String[] args) {
		//Otra opcion de repsuesta
		/*
		 Scanner sc = new Scanner(System.in);
	        int n;
	        System.out.print("Introduce un número entero: ");                                                         
	        n = sc.nextInt();
	        System.out.println("Tabla del " + n);
	        for(int i = 0; i<=10; i++){
	             System.out.println(n + " * " + i + " = " + n*i);                                                     
	        }
	    }
	}
		 */
        for(int i = 0; i<=10; i++){
        	  for(int n = 0; n<=10; n++){
             System.out.println(i + " * " + n + " = " + n*i);                                                     
        }
    }
}
	}